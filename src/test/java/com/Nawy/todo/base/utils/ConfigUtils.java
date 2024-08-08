package com.Nawy.todo.base.utils;

import java.util.Properties;

public class ConfigUtils {
    private  Properties properties;
    private static ConfigUtils configUtils;
    private ConfigUtils(){
        String env = System.getProperty("env","Production");
        switch (env) {
            case "Production" ->
                    properties = PropertiesUtils.loadProperties("src/test/java/com/Nawy/todo/base/config/production.properties");
            case "Local" ->
                    properties = PropertiesUtils.loadProperties("src/test/java/com/Nawy/todo/base/config/local.properties");
            default -> throw new IllegalStateException("Unexpected value: " + env);
        }
    }
    public static ConfigUtils GetInstance(){

        if (configUtils ==null){
            configUtils = new ConfigUtils();
        }
        return configUtils;
    }

    public  String ReturnBaseURL(){
        String prop  = properties.getProperty("baseUrl");
        if(prop != null) return prop;
            throw new RuntimeException("couldnt find baseUrl in property file ");
    }

    public  String ReturnEmail(){
        String prop  = properties.getProperty("email");
        if(prop != null) return prop;
        throw new RuntimeException("couldnt find EEMail in property file ");
    }

    public  String ReturnPassword(){
        String prop  = properties.getProperty("password");
        if(prop != null) return prop;
        throw new RuntimeException("couldnt find passworrrd in property file ");
    }
}
