package com.hkit.ddobang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.hkit.ddobang.dao.BoxOfficeService;
import com.hkit.ddobang.dao.RetroFit2;
import com.hkit.ddobang.vo.BoxOfficeResult;
import com.hkit.ddobang.vo.Result;
import com.hkit.ddobang.vo.WeeklyBoxOffice;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class AjaxActivity extends AppCompatActivity {

    RecyclerView boxoffice_recycler;
    List<WeeklyBoxOffice> weeklyBoxOfficeLists = new ArrayList<>();
    BoxOfficeAdapter boxOfficeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajax);
        init();
    }

    private void init() {
        boxoffice_recycler = findViewById(R.id.boxoffice_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(AjaxActivity.this, LinearLayoutManager.VERTICAL, false);
        boxoffice_recycler.setLayoutManager(linearLayoutManager);
        boxOfficeAdapter = new BoxOfficeAdapter(weeklyBoxOfficeLists
                , AjaxActivity.this);
        boxoffice_recycler.setAdapter(boxOfficeAdapter);

        Retrofit retro = RetroFit2.getRetrofit();
        BoxOfficeService service = retro.create(BoxOfficeService.class);
        service.getBoxOffice(RetroFit2.API_KEY, "20190608")
                .enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Log.i("test", "통신 Good!!!!!");

                Result result = response.body();
                BoxOfficeResult bResult = result.getBoxOfficeResult();
                weeklyBoxOfficeLists.addAll(bResult.getWeeklyBoxOfficeList());
                weeklyBoxOfficeLists.addAll(bResult.getWeeklyBoxOfficeList());
                boxOfficeAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {
                Log.e("test", "통신 에러 발생!!!");
            }
        });



    }
}









