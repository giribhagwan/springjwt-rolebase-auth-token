package com.springExample.jwt.services;



import com.springExample.jwt.domain.User;
import com.springExample.jwt.services.dto.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}
