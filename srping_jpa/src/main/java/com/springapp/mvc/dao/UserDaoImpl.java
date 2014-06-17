package com.springapp.mvc.dao;

import com.springapp.mvc.domain.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author rifatul.islam
 * @since 6/9/14.
 */

@Repository
@Qualifier("userDao")
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser() {

    }

    @Override
    public User getUser(int userId) {
        User user = entityManager.find(User.class, userId);
        System.out.println("user in User DAO JPA " + user);
        return user;
    }
}
