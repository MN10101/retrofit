package com.example.retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainDelete {
    public static void main(String[] args) {
        // Create an instance of the ApiService interface using RetrofitClient
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);

        // Define the user ID to delete
        int userIdToDelete = 1;

        // Call the deleteUser method with the user ID
        Call<Void> deleteUserCall = apiService.deleteUser(userIdToDelete);
        deleteUserCall.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    System.out.println("DELETE method - User deleted successfully.");
                } else {
                    System.out.println("Failed to delete user: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                System.out.println("Error occurred while deleting user: " + t.getMessage());
            }
        });
    }
}
