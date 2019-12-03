package com.hkit.ddobang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalcActivity extends AppCompatActivity {
    EditText et_input;
    String calc = "";
    String leftVal = "";
    String rightVal = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        et_input = findViewById(R.id.et_input);
       // et_input.setText("Hello 안녕!!");
    }

    public void btnClk(View v) {
        Button btn = (Button)v;
        String bVal = btn.getText().toString();

        if(bVal.equals("/") || bVal.equals("*") || bVal.equals("-") || bVal.equals("+")) {
            calc = bVal;
        } else if(calc.equals("")){
            leftVal = leftVal + bVal;
        } else {
            rightVal = rightVal + bVal;
        }

        et_input.setText(leftVal + calc + rightVal);

    }

    /*
    public void btnClk(View v) {
        Button btn = (Button)v;
        String str = et_input.getText().toString();
        String val = btn.getText().toString();
        if(val.equals("/") || val.equals("*") || val.equals("-") || val.equals("+")) {
            String lc = str.substring(str.length() - 1);
            if(lc.equals("/") || lc.equals("*") || lc.equals("-") || lc.equals("+")) {
                str = str.substring(0, str.length() - 1);
                str += val;
            } else {
                str += btn.getText();
            }
        } else {
            str += btn.getText();
        }

        et_input.setText(str);
    }
    */

}
