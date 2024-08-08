package com.Nawy.todo.objects;

public class RegisterUser {

    private String firstName;
    private String password;

    public RegisterUser (String firstName, String password){
        this.firstName=firstName;
        this.password=password;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
