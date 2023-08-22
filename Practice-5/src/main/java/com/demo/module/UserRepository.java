package com.demo.module;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	List<User> findByName (String name);
	
	List<User> findTop3ByAge(Integer num);
	
	List<User> findByNameIs (String name);
	
	List<User> findByNameEquals (String name);
	
	List<User> findByNameIsNot (String name);
	
	List<User> findByNameIsNull ();
	
	List<User> findByNameIsNotNull ();
	
	List<User> findByNameStartingWith (String prefix);
	
	List<User> findByNameEndingWith (String suffix);
	
	List<User> findByNameContaining (String infix);
	
	List<User> findByNameLike (String likePattern);
	
	List<User> findByAgeLessThan (Integer age);
	
	List<User> findByAgeLessThanEqual (Integer age);
	
	List<User> findByAgeGreaterThan (Integer age);
	
	List<User> findByAgeGreaterThanEqual (Integer age);
	
	List<User> findByAgeBetween (Integer startAge, Integer endAge);
	
	List<User> findByAgeIn (Collection<Integer> ages);
	
	List<User> findByBirthDateAfter (ZonedDateTime birthDate);
	
	List<User> findByBirthDateBefore (ZonedDateTime birthDate);
	
	List<User> findByNameOrBirthDate (String name, ZonedDateTime birthDate);
	
	@Query("SELECT u FROM User u WHERE (u.name = :name OR u.birthDate = :birthDate) AND u.active = :active")
	List<User> findByNameOrBirthDateAndActive (String name, ZonedDateTime birthDate, Boolean active);
}
