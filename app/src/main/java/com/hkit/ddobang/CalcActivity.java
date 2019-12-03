package com.hkit.ddobang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalcActivity extends AppCompatActivity {
    EditText et_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        et_input = findViewById(R.id.et_input);
        et_input.setText("Hello 안녕!!");
    }

    public void btnClk(View v) {
        et_input.setText("!!!!!");
    }
}
