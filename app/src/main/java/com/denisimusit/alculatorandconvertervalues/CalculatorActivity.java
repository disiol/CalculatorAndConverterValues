package com.denisimusit.alculatorandconvertervalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    private EditText editText;
    private Button  button_1;
    private Button  button_2;
    private Button  button_3;
    private Button  button_4;
    private Button  button_5;
    private Button  button_6;
    private Button  button_7;
    private Button  button_8;
    private Button  button_9;
    private Button  button_0;
    private Button  button_00;
    private Button  button_divide;
    private Button  button_multiply;
    private Button  button_minus;
    private Button  button_plus;
    private Button  button_equals;
    private Button  button_Clear;
    private Button  button_del;
    private Button button_interest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);
        editText = (EditText) findViewById(R.id.editText);



    }
}
