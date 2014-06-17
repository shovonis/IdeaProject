package com.springapp.mvc.service;

import com.springapp.mvc.dao.UserDao;
import com.springapp.mvc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author rifatul.islam
 * @since 6/16/14.
 */

@Service
@Transactional(value = "transactionManager")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDao")
    UserDao userDao;

    @Override
    public User getUserById(int userId) {
        return userDao.getUser(userId);
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }
}
