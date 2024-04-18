package com.example.retrofit;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.*;

public interface ApiService {
    @GET("users/{userId}")
    Call<User> getUserByID(@Path("userId") int userId);

    @GET("users")
    Call<List<User>> getAllUsers();

    @POST("users")
    Call<User> createUser(@Body User user);

    @PUT("users/{userId}")
    Call<User> updateUser(@Path("userId") int userId, @Body User user);

    @DELETE("users/{userId}")
    Call<Void> deleteUser(@Path("userId") int userId);
}
