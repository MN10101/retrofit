package com.example.retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainAsync {
    public static void main(String[] args) {
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);

        // To update an existing user
        int userIdToUpdate = 1; // Define the user ID to update
        User updatedUser = new User();
        updatedUser.setId(userIdToUpdate);
        updatedUser.setName("Ali Najmeh");
        updatedUser.setEmail("ali@outlook.com");

        Call<User> updateUserCall = apiService.updateUser(userIdToUpdate, updatedUser); // Fix method name
        updateUserCall.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.isSuccessful()) {
                    System.out.println("PUT method - updated User:");
                    System.out.println("User ID: " + response.body().getId());
                    System.out.println("User Name: " + response.body().getName());
                    System.out.println("User Email: " + response.body().getEmail());
                } else {
                    System.out.println("Failed to update user: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                System.out.println("Error occurred while updating user: " + t.getMessage());
            }
        });
    }
}
