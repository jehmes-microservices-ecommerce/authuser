package com.ecommerce.authuser.services.interfaces;

import com.ecommerce.authuser.exceptions.UserException;
import com.ecommerce.authuser.models.User;

public interface UserService {
    User save(User newUser) throws UserException;
}
