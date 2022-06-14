package com.Neiborsdish.app.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA5Y5d5IQ:APA91bGhxXdRQE9fKOTwNxg-ZOARUvVPHhPZu2tVSKWzXStYbLzxFcQMqeVuaYe9ZhBSJgzkZA58LUxEbKXI7GWsVisXaagTyOfCfjt10nWiotX1eF8fSq3U05PEGDa83RD_Caafyeyq"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
