package com.ddm.trabalho1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndPoints {

    @GET("users")
    Call<List<User>> getUsers();
}
