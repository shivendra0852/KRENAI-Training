package com.demo.module;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.User;
import com.demo.exception.UserException;
import com.demo.model.UserRequest;
import com.demo.model.UserResponse;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserResponse registerUser(UserRequest userRequest) throws UserException{
		
		Optional<User> existingUser = userRepository.findById(userRequest.getId());
		
		if(existingUser.isPresent()) {
			throw new UserException("Employee already registered with this details!");
		}
		
		UserRequestMapper userRequestMapper = new UserRequestMapper();
		User user = userRequestMapper.map(userRequest);
		
		userRepository.save(user);
		
		
		UserResponseMapper userResponseMapper = new UserResponseMapper();
		UserResponse userResponse = userResponseMapper.map(user);
		
		return userResponse;
		
	}
	
	
	public List<User> getUserByName(String name) throws UserException {
        List<User> users = userRepository.findByName(name);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserTop3ByAge(Integer num) throws UserException {
        List<User> users = userRepository.findTop3ByAge(num);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByNameIs(String name) throws UserException {
        List<User> users = userRepository.findByNameIs(name);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByNameEquals(String name) throws UserException {
        List<User> users = userRepository.findByNameEquals(name);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByNameIsNot(String name) throws UserException {
        List<User> users = userRepository.findByNameIsNot(name);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByNameIsNull() throws UserException {
        List<User> users = userRepository.findByNameIsNull();

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByNameIsNotNull() throws UserException {
        List<User> users = userRepository.findByNameIsNotNull();

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByNameStartingWith(String prefix) throws UserException {
        List<User> users = userRepository.findByNameStartingWith(prefix);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByNameEndingWith(String suffix) throws UserException {
        List<User> users = userRepository.findByNameEndingWith(suffix);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByNameContaining(String infix) throws UserException {
        List<User> users = userRepository.findByNameContaining(infix);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByNameLike(String likePattern) throws UserException {
        List<User> users = userRepository.findByNameLike(likePattern);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByAgeLessThan(Integer age) throws UserException {
        List<User> users = userRepository.findByAgeLessThan(age);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByAgeLessThanEqual(Integer age) throws UserException {
        List<User> users = userRepository.findByAgeLessThanEqual(age);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByAgeGreaterThan(Integer age) throws UserException {
        List<User> users = userRepository.findByAgeGreaterThan(age);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByAgeGreaterThanEqual(Integer age) throws UserException {
        List<User> users = userRepository.findByAgeGreaterThanEqual(age);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByAgeBetween(Integer startAge, Integer endAge) throws UserException {
        List<User> users = userRepository.findByAgeBetween(startAge, endAge);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByAgeIn(Collection<Integer> ages) throws UserException {
        List<User> users = userRepository.findByAgeIn(ages);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByBirthDateAfter(ZonedDateTime birthDate) throws UserException {
        List<User> users = userRepository.findByBirthDateAfter(birthDate);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByBirthDateBefore(ZonedDateTime birthDate) throws UserException {
        List<User> users = userRepository.findByBirthDateBefore(birthDate);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

    public List<User> getUserByNameOrBirthDate(String name, ZonedDateTime birthDate) throws UserException {
        List<User> users = userRepository.findByNameOrBirthDate(name, birthDate);

        if (users.isEmpty()) {
            throw new UserException("No users found!");
        }
        return users;
    }

//    public List<User> getUserByNameOrBirthDateAndActive(String name, ZonedDateTime birthDate, Boolean active) throws UserException {
//        List<User> users = userRepository.findByNameOrBirthDateAndActive(name, birthDate, active);
//
//        if (users.isEmpty()) {
//            throw new UserException("No users found!");
//        }
//        return users;
//    }
	
}
