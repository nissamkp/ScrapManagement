package net.javaguides.userservice.controller;

import lombok.AllArgsConstructor;
import net.javaguides.userservice.dto.UserDto;
import net.javaguides.userservice.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    // Build save User REST API
    @PostMapping
    public ResponseEntity<UserDto> saveDepartment(@RequestBody UserDto userDto){
        UserDto savedUser = userService.saveUser(userDto);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // Build get User rest api
    @GetMapping("{user-id}")
    public ResponseEntity<UserDto> getDepartment(@PathVariable("user-id") String userId){
        System.out.println("Entere User Application");
        UserDto userDto = userService.getUserById(userId);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}
