package net.javaguides.userservice.mapper;

import net.javaguides.userservice.dto.UserDto;
import net.javaguides.userservice.entity.User;

import java.util.Optional;

public class UserMapper {

    public static UserDto mapToUserDto(Optional<User> user){
        UserDto userDto = new UserDto(
                user.get().getId(),
                user.get().getUserName(),
                user.get().getPassword(),
                user.get().getUserType(),
                user.get().getStatus()
        );
        return userDto;
    }

    public static User mapToUser(UserDto userDto){
        User user = new User(
                userDto.getId(),
                userDto.getUserName(),
                userDto.getPassword(),
                userDto.getUserType(),
                userDto.getStatus()
        );
        return user;
    }
}
