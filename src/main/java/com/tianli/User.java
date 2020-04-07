package com.tianli;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;

    /*
    *
    * */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        System.out.print("aa1234567890");
        List<String> list = new ArrayList<String>();
        list.add(null);
        list.add("aa");
        list.add("bb");
        for (String temp : list) {
            System.out.println(temp);
        }
        for (String temp : list) {
            System.out.println(temp);
        }
        for (String temp : list) {
            System.out.println(temp.toString());
        }
        System.out.println();

    }

    /**
     *
     * @param username
     */
    public void print(String username){
        if (username != null) {
            String.format(username, "/$$$");
        }
        switch (username) {
            case "a":

        }
    }


}
