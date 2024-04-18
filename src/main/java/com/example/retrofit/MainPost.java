package com.example.retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPost {
    public static void main(String[] args) {
        //create instance of ApiService using RetrofitClient
        ApiService apiService= RetrofitClient.getClient().create(ApiService.class);

        User newUser = new User();
        newUser.setName("Mahmoud Najmeh");
        newUser.setEmail("mamo@cool.com");

        Call<User> createUserCall = apiService.createUser(newUser);
        createUserCall.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.isSuccessful() && response.body() != null) {
                    User user = response.body();
                    System.out.println("POST method -  create new User:");
                    System.out.println("User ID: " + user.getId());
                    System.out.println("User Name: " + user.getName());
                    System.out.println("User Email: " + user.getEmail());
                } else {
                    System.out.println("Failed to create user: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                System.out.println("Error occurred while creating user: " + t.getMessage());
            }
        });
    }

}
