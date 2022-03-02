package com.sha.springbootbookseller.service;


import com.sha.springbootbookseller.model.Role;
import com.sha.springbootbookseller.model.User;
import com.sha.springbootbookseller.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

@Service    //springte bir sinifin service katmanini tuttugunu belirtmek icin @SERVICE anatasyonu eklenir
public class UserService implements IUserService
{
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    //1. method kullaniciyi kaydetmek icin userRepositoryden dogrudan save yöntemi cagirilabilir
    @Override
    public User saveUser(User user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());

        return userRepository.save(user);
    }

    //2. method username'ye gore kullaniciyi bulmak
    @Override
    public Optional<User> findByUsername(String username)
    {
        return userRepository.findByUsername(username);
    }

    //3. method varsayılan kullanici rolunu admin olarak degistirmek
    @Override
    @Transactional //springte silme veya guncelleme sorgusu calisitirirken transactional zorunludur
    public void makeAdmin(String username)
    {
        userRepository.updateUserRole(username,Role.ADMIN);
    }
}
