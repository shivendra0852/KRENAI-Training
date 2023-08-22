package com.demo.module;

import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.User;
import com.demo.exception.UserException;
import com.demo.model.UserRequest;
import com.demo.model.UserResponse;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<UserResponse> registerUser(@RequestBody UserRequest userRequest) throws UserException {
		
		UserResponse res = userService.registerUser(userRequest);
		
		return new ResponseEntity<UserResponse>(res,HttpStatus.CREATED);
	}
	
	@GetMapping("/byname")
    public ResponseEntity<List<User>> getUserByName(@RequestParam String name) {
        List<User> users = userService.getUserByName(name);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/top3byage")
    public ResponseEntity<List<User>> getUserTop3ByAge(@RequestParam Integer num) {
        List<User> users = userService.getUserTop3ByAge(num);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/bynameis")
    public ResponseEntity<List<User>> getUserByNameIs(@RequestParam String name) {
        List<User> users = userService.getUserByNameIs(name);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/bynameequals")
    public ResponseEntity<List<User>> getUserByNameEquals(@RequestParam String name) {
        List<User> users = userService.getUserByNameEquals(name);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/bynameisnot")
    public ResponseEntity<List<User>> getUserByNameIsNot(@RequestParam String name) {
        List<User> users = userService.getUserByNameIsNot(name);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/bynameisnull")
    public ResponseEntity<List<User>> getUserByNameIsNull() {
        List<User> users = userService.getUserByNameIsNull();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/bynameisnotnull")
    public ResponseEntity<List<User>> getUserByNameIsNotNull() {
        List<User> users = userService.getUserByNameIsNotNull();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/bynamestartingwith")
    public ResponseEntity<List<User>> getUserByNameStartingWith(@RequestParam String prefix) {
        List<User> users = userService.getUserByNameStartingWith(prefix);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/bynameendingwith")
    public ResponseEntity<List<User>> getUserByNameEndingWith(@RequestParam String suffix) {
        List<User> users = userService.getUserByNameEndingWith(suffix);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/bynamecontaining")
    public ResponseEntity<List<User>> getUserByNameContaining(@RequestParam String infix) {
        List<User> users = userService.getUserByNameContaining(infix);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/bynamelike")
    public ResponseEntity<List<User>> getUserByNameLike(@RequestParam String likePattern) {
        List<User> users = userService.getUserByNameLike(likePattern);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/byagelessthan")
    public ResponseEntity<List<User>> getUserByAgeLessThan(@RequestParam Integer age) {
        List<User> users = userService.getUserByAgeLessThan(age);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/byagelessthanequal")
    public ResponseEntity<List<User>> getUserByAgeLessThanEqual(@RequestParam Integer age) {
        List<User> users = userService.getUserByAgeLessThanEqual(age);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/byagegreaterthan")
    public ResponseEntity<List<User>> getUserByAgeGreaterThan(@RequestParam Integer age) {
        List<User> users = userService.getUserByAgeGreaterThan(age);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/byagegreaterthanequal")
    public ResponseEntity<List<User>> getUserByAgeGreaterThanEqual(@RequestParam Integer age) {
        List<User> users = userService.getUserByAgeGreaterThanEqual(age);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/byagebetween")
    public ResponseEntity<List<User>> getUserByAgeBetween(@RequestParam Integer startAge, @RequestParam Integer endAge) {
        List<User> users = userService.getUserByAgeBetween(startAge, endAge);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/byagein")
    public ResponseEntity<List<User>> getUserByAgeIn(@RequestParam List<Integer> ages) {
        List<User> users = userService.getUserByAgeIn(ages);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/bybirthdateafter")
    public ResponseEntity<List<User>> getUserByBirthDateAfter(@RequestParam String birthDate) {
        // Parse the birthDate string into ZonedDateTime and call the service method
        List<User> users = userService.getUserByBirthDateAfter(ZonedDateTime.parse(birthDate));
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/bybirthdatebefore")
    public ResponseEntity<List<User>> getUserByBirthDateBefore(@RequestParam String birthDate) {
        // Parse the birthDate string into ZonedDateTime and call the service method
        List<User> users = userService.getUserByBirthDateBefore(ZonedDateTime.parse(birthDate));
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/bynameorbirthdate")
    public ResponseEntity<List<User>> getUserByNameOrBirthDate(@RequestParam String name, @RequestParam String birthDate) {
        // Parse the birthDate string into ZonedDateTime and call the service method
        List<User> users = userService.getUserByNameOrBirthDate(name, ZonedDateTime.parse(birthDate));
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

//    @GetMapping("/bynameorbirthdateandactive")
//    public ResponseEntity<List<User>> getUserByNameOrBirthDateAndActive(@RequestParam String name, @RequestParam String birthDate, @RequestParam Boolean active) {
//        // Parse the birthDate string into ZonedDateTime and call the service method
//        List<User> users = userService.getUserByNameOrBirthDateAndActive(name, ZonedDateTime.parse(birthDate), active);
//        return new ResponseEntity<>(users, HttpStatus.OK);
//    }

}
