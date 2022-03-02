package com.sha.springbootbookseller.security.jwt;

import com.sha.springbootbookseller.security.UserPrinciple;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface IJwtProvider
{
    Authentication getAuthentication(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);

    String generateToken(UserPrinciple userPrinciple);
}
