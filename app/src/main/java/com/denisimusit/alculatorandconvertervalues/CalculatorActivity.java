package com.denisimusit.alculatorandconvertervalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    private TextView textViewInput;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_0;
    private Button button_00;
    private Button button_divide;
    private Button button_multiply;
    private Button button_minus;
    private Button button_plus;
    private Button button_equals;
    private Button button_Clear;
    private Button button_del;
    private Button button_interest;
    private Button button_point;

    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);
        //находим елементы по индификатору
        textViewInput = (TextView) findViewById(R.id.textViewInput);
        button_0 = (Button) findViewById(R.id.button_0);
        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);
        button_5 = (Button) findViewById(R.id.button_5);
        button_6 = (Button) findViewById(R.id.button_6);
        button_7 = (Button) findViewById(R.id.button_7);
        button_8 = (Button) findViewById(R.id.button_8);
        button_9 = (Button) findViewById(R.id.button_9);
        button_00 = (Button) findViewById(R.id.button_00);
        button_divide = (Button) findViewById(R.id.button_divide);
        button_multiply = (Button) findViewById(R.id.button_multiply);
        button_minus = (Button) findViewById(R.id.button_minus);
        button_plus = (Button) findViewById(R.id.button_plus);
        button_equals = (Button) findViewById(R.id.button_equals);
        button_Clear = (Button) findViewById(R.id.button_Clear);
        button_del = (Button) findViewById(R.id.button_del);
        button_interest = (Button) findViewById(R.id.button_interest);
        button_point = (Button) findViewById(R.id.button_point);


        //обробатываем нажатия кнопок
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button_0:
                        textViewInput.setText(R.string.button_0);
                        break;
                    case R.id.button_00:
                        textViewInput.setText(R.string.button_00);
                        break;
                    case R.id.button_1:
                        textViewInput.setText(R.string.button_1);
                        break;
                    case R.id.button_2:
                        textViewInput.setText(R.string.button_2);
                        break;
                    case R.id.button_3:
                        textViewInput.setText(R.string.button_3);
                        break;
                    case R.id.button_4:
                        textViewInput.setText(R.string.button_4);
                        break;
                    case R.id.button_5:
                        textViewInput.setText(R.string.button_5);
                        break;
                    case R.id.button_6:
                        textViewInput.setText(R.string.button_6);
                        break;
                    case R.id.button_7:
                        textViewInput.setText(R.string.button_7);
                        break;
                    case R.id.button_8:
                        textViewInput.setText(R.string.button_8);
                        break;
                    case R.id.button_9:
                        textViewInput.setText(R.string.button_9);
                        break;
                    case R.id.button_Clear:
                        textViewInput.setText("");
                        break;
                    case R.id.button_minus:
                        textViewInput.setText(R.string.button_minus);
                        break;
                    case R.id.button_plus:
                        textViewInput.setText(R.string.button_plus);
                        break;
                    case R.id.button_multiply:
                        textViewInput.setText(R.string.button_multiply);
                        break;
                    case R.id.button_divide:
                        textViewInput.setText(R.string.button_divide);
                        break;
                    case R.id.button_point:
                        textViewInput.setText(R.string.button_point);
                        break;
                    case R.id.button_interest:
                        textViewInput.setText(R.string.button_interest);
                        break;
                    case R.id.button_del:
                        //TODO
                        break;
                    case R.id.button_equals:
                        //TODO
                        break;

                }

            }
        };

        button_0.setOnClickListener(onClickListener);
        button_00.setOnClickListener(onClickListener);
        button_1.setOnClickListener(onClickListener);
        button_2.setOnClickListener(onClickListener);
        button_3.setOnClickListener(onClickListener);
        button_4.setOnClickListener(onClickListener);
        button_5.setOnClickListener(onClickListener);
        button_6.setOnClickListener(onClickListener);
        button_7.setOnClickListener(onClickListener);
        button_8.setOnClickListener(onClickListener);
        button_9.setOnClickListener(onClickListener);
        button_minus.setOnClickListener(onClickListener);
        button_plus.setOnClickListener(onClickListener);
        button_divide.setOnClickListener(onClickListener);
        button_multiply.setOnClickListener(onClickListener);
        button_del.setOnClickListener(onClickListener);
        button_interest.setOnClickListener(onClickListener);
        button_point.setOnClickListener(onClickListener);
        button_Clear.setOnClickListener(onClickListener);
        button_equals.setOnClickListener(onClickListener);


    }
}
