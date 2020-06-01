package com.alex.Components;

public class Bank {

    private User[] users = new User[5];

    public Bank() {
        init();
    }

    void init() {
        System.out.println("初始化数据");
        this.users[0] = new User("weijie xiang", "911004");
    }

    public boolean login(String username, String password) {
        boolean flag = false;
        for (User user : users) {
            if (user != null) {
                flag = ((user.username).equals(username))
                        && ((user.password).equals(password));
                if (flag) break;
            }
        }
        return flag;
    }

    public User[] displayAllUsers() {
        return this.users;
    }


}
