package com.pizzakamenec.repository.api;

import com.pizzakamenec.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    List<User> findAll();
    User save(User user);
    User update(User user);
    void delete(String id);
}
