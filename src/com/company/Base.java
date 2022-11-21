package com.company;

import java.util.*;

public class Base {

    private Map<String, String> allUsers;

    public void usersBase() {
        allUsers = new HashMap<>();

        allUsers.put("Jan", "Kowalski");
        allUsers.put("Ala", "Nowak");
        allUsers.put("Ola", "123");
        allUsers.put("Zuzia", "321");
    }
    public Map<String, String> getAllUsers() {
        return allUsers;
    }
}

