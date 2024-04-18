package com.example.retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class MainSync {
    public static void main(String[] args) {
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);

        try {
            Call<List<User>> call = apiService.getAllUsers();
            call.enqueue(new Callback<List<User>>() {
                @Override
                public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                    if (response.isSuccessful() && response.body() != null) {
                        List<User> users = response.body();
                        System.out.println("- - - - -");
                        System.out.println("GET method - fetch all users:");
                        for (User user : users) {
                            System.out.println("User ID: " + user.getId());
                            System.out.println("User Name: " + user.getName());
                            System.out.println("User Email: " + user.getEmail());
                            System.out.println("- - - - -");
                        }
                    } else {
                        System.out.println("Response was not successful or was empty: " + response.code());
                    }
                }

                @Override
                public void onFailure(Call<List<User>> call, Throwable t) {
                    System.out.println("Error occurred while fetching users data: " + t.getMessage());
                }
            });
        } catch (Exception e) {
            System.out.println("Error occurred while fetching users data: " + e.getMessage());
        }
    }
}
