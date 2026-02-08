package com.example.endtern_project1.patterns;

public class DatabaseConfig {
    private static DatabaseConfig instance;
    private String url;

    private DatabaseConfig(){
        url = "jdbc:postgresql://localhost:5432/music_platform";
    }

    public static synchronized DatabaseConfig getInstance(){
        if(instance == null){
            instance = new DatabaseConfig();
        }
        return instance;
    }

    public String getUrl(){
        return url;
    }
}