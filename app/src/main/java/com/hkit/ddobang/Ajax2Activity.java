package com.hkit.ddobang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.hkit.ddobang.dao2.BTCService;
import com.hkit.ddobang.dao2.RetroFit2BTC;
import com.hkit.ddobang.vo.BtcItem;
import com.hkit.ddobang.vo.BtcResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Ajax2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajax2);
        init();
    }

    private void init() {
        Retrofit ret = RetroFit2BTC.getRetrofit();
        BTCService service = ret.create(BTCService.class);
        service.getCurrentcies().enqueue(new Callback<BtcResult>() {
            @Override
            public void onResponse(Call<BtcResult> call, Response<BtcResult> response) {
                BtcResult result = response.body();
                for(BtcItem item :  result.getData()) {
                    Log.i("test", item.getName());
                }
            }

            @Override
            public void onFailure(Call<BtcResult> call, Throwable t) {
                Log.e("test", "에러발생!!!");
            }
        });
    }
}

