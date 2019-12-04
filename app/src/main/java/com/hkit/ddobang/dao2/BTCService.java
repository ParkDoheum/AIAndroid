package com.hkit.ddobang.dao2;

import com.hkit.ddobang.vo.BtcResult;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BTCService {

    @GET("/v2/currencies")
    Call<BtcResult> getCurrentcies();
}
