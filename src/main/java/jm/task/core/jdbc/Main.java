package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Sergey", "Esenin", (byte) 28);
        userService.saveUser("Aleksandr", "Pushkin", (byte) 33);
        userService.saveUser("Mikhail", "Lermontov", (byte) 30);
        userService.removeUserById(2);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
