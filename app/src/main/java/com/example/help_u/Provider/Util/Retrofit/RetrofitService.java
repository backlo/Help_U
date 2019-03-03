package com.example.help_u.Provider.Util.Retrofit;


import com.example.help_u.Provider.Data.LocationRequest_provider;
import com.example.help_u.Requester.Data.HelperRegistration;
import com.example.help_u.Provider.Data.ServerResponse;
import com.example.help_u.Provider.Data.UserInfo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitService  {

    String URL = "http://192.168.1.161:8080";

    @POST("/helpu/user/registration")
    Call<ServerResponse> sendUserInfo(@Body UserInfo userInfo);

    @POST("/helpu/user/id/check")
    Call<ServerResponse> idCheck(@Body UserInfo userInfo);

    @POST("/helpu/user/login")
    Call<ServerResponse> login(@Body UserInfo userInfo);

    @POST("/helpu/provider/phones")
    Call<ServerResponse> helperRegistration(@Body HelperRegistration helperRegistration);

    @POST("/helpu/help/request")
    Call<ServerResponse> sendLocation(@Body LocationRequest_provider locationRequest);

    @POST("/helpu/provider/location")
    Call<ServerResponse> sendLocation_Provider(@Body LocationRequest_provider locationRequestProvider);
}

