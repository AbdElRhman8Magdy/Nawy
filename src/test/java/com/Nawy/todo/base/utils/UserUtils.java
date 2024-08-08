package com.Nawy.todo.base.utils;

import com.Nawy.todo.objects.EditUser;
import com.Nawy.todo.objects.User;
import com.Nawy.todo.objects.UserName;
import com.Nawy.todo.objects.UserPass;
import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

public class UserUtils {
    public static User GenerateRndmUserNAme(){

        String firstName = new Faker().name().nameWithMiddle();
        String password = new Faker().address().fullAddress();

        User user = new User(firstName,password);



        return user;
    }
    public static User GenAPIUSerData(){
        String UserName = "Magdy"+getRandomString(6,true,true) + "@gmail.com";
        String Password = "Magdy"+getRandomString(6,true,true) ;
User APIUser = new User(UserName,Password);
        return APIUser;
    }
    public static UserName GenerateRndmUserNamefrst(){

        String firstName = new Faker().name().fullName();

        UserName userName = new UserName(firstName);


        return userName;
    }

    public static UserPass GenerateRndmUserPassword(){

        String password = new Faker().phoneNumber().cellPhone();

            UserPass userPass = new UserPass(password);


        return userPass;
    }

    public static EditUser GenerateEditdmUser(){

        String firstName = new Faker().name().firstName();
        String middleName = new Faker().name().name();
        String lasttName = new Faker().name().lastName();

        String employeeId = "0378";
        String otherId = "5";
        String drivingLicenseNo = "5845";
        String drivingLicenseExpiredDate = "2025-08-31";
        String gender = "1";
        String maritalStatus = "Single";
        String birthday = "1999-11-30";
        int nationalityId = 55;
        String sinNumber = "01452144";

        EditUser editUser = new EditUser(firstName,middleName,lasttName,employeeId,otherId,drivingLicenseNo,drivingLicenseExpiredDate,gender
        ,maritalStatus,birthday,nationalityId,sinNumber);
        return editUser;

    }

    public static String getRandomString(int length,boolean useLetters,Boolean useNumbers  ){


        return  RandomStringUtils.random(length, useLetters, useNumbers);
    }

    public static void main(String[] args) {
//        System.out.println("GenerateEditdmUser ->"+ UserUtils.GenerateEditdmUser());
//        System.out.println("GenerateRndmUserPassword-->>"+UserUtils.GenerateRndmUserPassword());
//        System.out.println("GenerateEditdmUser  "+UserUtils.GenerateEditdmUser());
//        System.out.println("GenerateRndmUserNamefrst  -U"+UserUtils.GenerateRndmUserNamefrst());

        String UserName = "Magdy"+getRandomString(6,true,true) + "@gmail.com";
        System.out.println(UserName);
        System.out.println(UserName);
        System.out.println(UserName);
    }
//   public static RegisternewUser GenerateRegUser (){
//       String firstName = new Faker().name().firstName();
//       String password = new Faker().phoneNumber().cellPhone();
//
//   }
}
