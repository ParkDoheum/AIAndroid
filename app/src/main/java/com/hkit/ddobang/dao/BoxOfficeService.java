package com.hkit.ddobang.dao;

import com.hkit.ddobang.vo.Result;

import retrofit2.Call;
import retrofit2.http.*;

public interface BoxOfficeService {
    @GET("/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?")
    Call<Result> getBoxOffice(@Query("key") String key,
                              @Query("targetDt") String targetDt);
}
