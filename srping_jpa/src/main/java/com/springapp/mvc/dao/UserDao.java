package com.springapp.mvc.dao;

import com.springapp.mvc.domain.User;

/**
 * @author rifatul.islam
 * @since 6/11/14.
 */
public interface UserDao {
    public void addUser();

    public User getUser(int userId);
}
