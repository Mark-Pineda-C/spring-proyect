package com.sha.springbootproject.service;

import com.sha.springbootproject.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
