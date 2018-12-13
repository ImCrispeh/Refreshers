/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapprefresher;

import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class Customer {
    private String name;
    private int id;
    private String password;
    private Accounts accounts;

    public Customer(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.accounts = new Accounts();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
