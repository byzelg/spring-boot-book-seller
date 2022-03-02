package com.sha.springbootbookseller.repository;

import com.sha.springbootbookseller.model.Role;
import com.sha.springbootbookseller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IUserRepository extends JpaRepository <User, Long>
//temel database islemleri icin SpringData sinifindan JpaRepository soyut sinifi extend edildi
//ilk parametre model sinifi, 2. parametre id sinifi
{
    Optional<User> findByUsername (String username);

    @Modifying  //sorguyu guncelleyebilmek icin MODIFY anatasyonu kullanildi
    @Query("update User set role = :role where username = :username ")   //parametreler iki nokta ile belirtilir
    void updateUserRole(@Param("username") String username, @Param("role")Role role);

}
