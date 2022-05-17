package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Petr", "Ivanov", (byte) 23);
        userService.saveUser("Ivan", "Sidorov", (byte) 30);
        userService.saveUser("Anna", "Lebedeva", (byte) 28);
        userService.removeUserById(1);
        List<User> userList = userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
