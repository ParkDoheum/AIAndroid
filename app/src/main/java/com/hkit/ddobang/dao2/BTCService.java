package com.hkit.ddobang.dao2;

import com.hkit.ddobang.vo.BtcResult;
import com.hkit.ddobang.vo.RatesResult;
import com.hkit.ddobang.vo.RatesResultParent;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BTCService {

    @GET("/v2/currencies")
    Call<BtcResult> getCurrentcies();

    @GET("/v2/exchange-rates?")
    Call<RatesResultParent> getRates(@Query("currency") String val);

}
