package com.Nawy.todo.objects;

public class User {
    // Create POJO class  for API Request Body


    private String username;



    private String password;




    public User(String username,String password){
        this.password=password;
        this.username=username;

    }

//    public UserName(String username) {
//        this.username=username;
//
//    }
//    public UserPass(String password) {
//        this.password=password;
//
//    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
