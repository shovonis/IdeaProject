package com.springapp.mvc.service;

import com.springapp.mvc.domain.User;

import java.util.List;

/**
 * @author rifatul.islam
 * @since 6/16/14.
 */
public interface UserService {
    public User getUserById(int userId);

    public List<User> getAllUser();

    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteUser(User user);
}
