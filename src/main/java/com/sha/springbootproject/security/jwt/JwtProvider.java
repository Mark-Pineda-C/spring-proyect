package com.sha.springbootproject.security.jwt;

import javax.servlet.http.HttpServletRequest;

import com.sha.springbootproject.security.UserPrincipal;

import org.springframework.security.core.Authentication;

public interface JwtProvider {
    String generateToken(UserPrincipal auth);
    Authentication getAuthentication(HttpServletRequest request);
    boolean isTokenValid(HttpServletRequest request);
}
