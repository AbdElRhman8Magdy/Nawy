package com.Nawy.todo.base.config;

import com.Nawy.todo.API.RegisterAPI;

public class EndPoint {
    static RegisterAPI registerAPI = new RegisterAPI();
    public final static String API_REGISTER_ENDPOINT = "/api/v1/users/register";
    public final static String API_TASK_ENDPOINT = "login";
    public final static String API_TASK_ENDPOINT1 = "pim/employees/110/personal-details";
    public final static String API_NewPage_ENDPOINT = "/todo";
    public final static String API_NewToDoPage_ENDPOINT = "/todo/new";

    public final static String API_BaseURI_ENDPOINT = "https://todo.qacart.com";

    public final static String API_BaseURI_ENDPOINT_Task = "https://api.demoblaze.com/";

    public final static String API_REGISTER_ENDPOINT_Task = "signup";

    public final static String API_REGISTER_Token = "77f6a232bc16d2ccebdcae6d843fb124";


}
