package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.User;

import java.util.Optional;

public interface IUserService
{

    User saveUser(User user);

    //username'ye gore kullaniciyi bulmak (2.yontem)
    Optional<User> findByUsername(String username);

    //son yontem varsayılan kullanici rolunu admin olarak degistirmek
    void makeAdmin(String username);
}
