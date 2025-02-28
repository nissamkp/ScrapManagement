package net.javaguides.userservice.service.impl;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import net.javaguides.userservice.dto.UserDto;
import net.javaguides.userservice.entity.User;
import net.javaguides.userservice.repository.UserRepository;
import net.javaguides.userservice.service.UserService;
import org.springframework.stereotype.Service;
import net.javaguides.userservice.mapper.UserMapper;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto saveUser(UserDto userDto) {

        // convert department dto to department jpa entity
        User user = UserMapper.mapToUser(userDto);

        User savedUser = userRepository.save(user);

        UserDto saveduserDto = UserMapper.mapToUserDto(Optional.of(savedUser));

        return saveduserDto;
    }

    @Override
    public UserDto getUserById(String userId) {

        Optional<User> user = userRepository.findById(userId);
        UserDto userDto = UserMapper.mapToUserDto(user);

        return userDto;
//        return  null;
    }
}
