package com.hkit.ddobang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class NavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
    }

    public void btnClk(View v) {
        if(v.getId() == R.id.btn_navCalc) {
            //Log.d("test", "진입했당!!!");

            Intent intent = new Intent(NavActivity.this, CalcActivity.class);
            startActivity(intent);

        }
    }
}
