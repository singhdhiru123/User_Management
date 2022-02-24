package com.th.repository;

import com.th.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    public User findById(int id);

    public Optional<User> findByUserNameAndPassword(String userName, String password);

}
