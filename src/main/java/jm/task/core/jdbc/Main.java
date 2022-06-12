package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        User user1 = new User("Sergey", "Esenin", (byte) 28);
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        System.out.println("User с именем - " + user1.getName() + " добавлен в базу ");

        User user2 = new User("Aleksandr", "Pushkin", (byte) 33);
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        System.out.println("User с именем - " + user2.getName() + " добавлен в базу ");

        User user3 = new User("Mikhail", "Lermontov", (byte) 30);
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.println("User с именем - " + user3.getName() + " добавлен в базу ");

        User user4 = new User("Lev", "Tolstoy", (byte) 85);
        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.println("User с именем - " + user4.getName() + " добавлен в базу ");

        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
