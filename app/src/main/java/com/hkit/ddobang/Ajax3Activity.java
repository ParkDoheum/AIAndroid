package com.hkit.ddobang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.hkit.ddobang.dao2.BTCService;
import com.hkit.ddobang.dao2.RetroFit2BTC;
import com.hkit.ddobang.vo.Rates;
import com.hkit.ddobang.vo.RatesResult;
import com.hkit.ddobang.vo.RatesResultParent;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Ajax3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajax3);
        init();
    }

    private void init() {
        Retrofit ret = RetroFit2BTC.getRetrofit();
        BTCService service = ret.create(BTCService.class);
        service.getRates("BTC").enqueue(new Callback<RatesResultParent>() {
            @Override
            public void onResponse(Call<RatesResultParent> call, Response<RatesResultParent> response) {
                RatesResultParent rrp = response.body();
                RatesResult rr = rrp.getData();
                Log.i("test", "currency : " + rr.getCurrency());

                Rates rates = rr.getRates();
                Log.i("test", "AED : " + rates.getAed());
                Log.i("test", "AFN : " + rates.getAfn());
                Log.i("test", "ALL : " + rates.getAll());
            }

            @Override
            public void onFailure(Call<RatesResultParent> call, Throwable t) {

            }
        });
    }

}
