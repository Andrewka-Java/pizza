package com.pizzakamenec.repository.impl;

import com.pizzakamenec.model.User;
import com.pizzakamenec.repository.api.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<User> findAll() {
        return mongoTemplate.findAll(User.class);
    }

    @Override
    public User save(User user) {
        return mongoTemplate.save(user);
    }

    @Override
    public User update(User user) {
        Query query = new Query().addCriteria(Criteria.where("id").is(user.getId()));

        Update update = new Update()
                .set("name", user.getName());

        return mongoTemplate.findAndModify(query, update, User.class);
    }

    @Override
    public void delete(String id) {
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        mongoTemplate.remove(query, User.class);
    }


}
