package com.example.doanandroid02.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    private static final String BASE_URL = "http://192.168.1.11/doan-laravel/public/";
    private static Retrofit retrofit;
    private static Gson gson;


    public static  Retrofit getRetrofitInstance(){
        if (retrofit==null){
            gson = new GsonBuilder().setLenient().create();
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
