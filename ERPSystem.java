package com.example;


import java.util.ArrayList;
import java.util.List;

public class ERPSystem {
    private List<String> inventory = new ArrayList<>();
    private List<String> users = new ArrayList<>();

   
    public void addInventory(String item) {
        inventory.add(item);
        System.out.println("Item added to inventory: " + item);
    }

    public void manageInventory() {
        System.out.println("Inventory: " + inventory.toString());
        checkInventory();
    }

   
    public void addUser(String user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    public void manageUsers() {
        System.out.println("Users: " + users.toString());
    }

    
    public void checkInventory() {
        if (inventory.size() < 2) {
            triggerAlert("Inventory running low!");
        }
    }

    private void triggerAlert(String message) {
        System.out.println("ALERT: " + message);
    }

    public List<String> getInventory() {
        return inventory;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
}

