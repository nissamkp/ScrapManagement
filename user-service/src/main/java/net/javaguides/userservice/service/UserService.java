package net.javaguides.userservice.service;


import net.javaguides.userservice.dto.UserDto;

public interface UserService {
    UserDto saveUser(UserDto userDto);

    UserDto getUserById(String Id);
}
