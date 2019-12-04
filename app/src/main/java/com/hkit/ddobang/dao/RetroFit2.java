package com.hkit.ddobang.dao;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFit2 {
    private static Retrofit retrofit = null;

    public static String API_KEY = "430156241533f1d058c603178cc3ca0e";

    public static Retrofit getRetrofit() {
        if(retrofit == null) {
            final String BASE_URL = "https://www.kobis.or.kr";
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
