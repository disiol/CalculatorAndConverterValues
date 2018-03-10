package com.denisimusit.alculatorandconvertervalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

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

    private String histori;//записываетса история


    /**
     * Результат который заносится в масив для обработки
     */
    ArrayList<Float> result = new ArrayList<Float>();

    /**
     * Первое введенное число
     */
    float number1;

    /**
     * Второе введенное число
     */
    float number2;

    int currentOperation = 0;
    int nextOperation;

    /**
     * Прибавление
     */
    final static int ADD = 1;

    /**
     * Вычитание
     */
    final static int SUBTRACT = 2;

    /**
     * Умножение
     */
    final static int MULTIPLY = 3;

    /**
     * Деление
     */
    final static int DIVISION = 4;

    /**
     * Равно
     */
    final static int EQUALS = 5;


    final static int CLEAR = 1;
    final static int DONT_CLEAR = 0;
    int clearCalcDisplay = 0;

    private static final String TAG = "myLogs";
    private static final int TIME = 3000;

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

    }

    //обробатываем нажатия кнопок

    public void onClick(View view) {
        //TODO history
        Log.d(TAG, "Оброботаем нажатие кнопки"); //выводит лог в Logcat
//        CharSequence text = textViewInput.getText();

        switch (view.getId()) {


            case R.id.button_0:
                if (clearCalcDisplay == CLEAR) {
                    textViewInput.setText("");

                }
                if (textViewInput.getText().equals("0")) {
                    textViewInput.setText("");
                    Log.e(TAG, "clearIfEqualsZero: ");
                }
                clearCalcDisplay = DONT_CLEAR;
                textViewInput.append("0");
                break;

            case R.id.button_00:
                if (clearCalcDisplay == CLEAR) {
                    textViewInput.setText("");

                }
                if (textViewInput.getText().equals("0")) {
                    textViewInput.setText("");
                    Log.e(TAG, "clearIfEqualsZero: ");
                }
                clearCalcDisplay = DONT_CLEAR;
                textViewInput.append("00");

                break;

            case R.id.button_1:
                if (clearCalcDisplay == CLEAR) {
                    textViewInput.setText("");

                }
                if (textViewInput.getText().toString().equals("0")) {
                    textViewInput.setText("");
                    Log.e(TAG, "clearIfEqualsZero: ");
                }
                clearCalcDisplay = DONT_CLEAR;
                textViewInput.append("1");
                break;

            case R.id.button_2:
                if (clearCalcDisplay == CLEAR) {
                    textViewInput.setText("");

                }
                if (textViewInput.getText().equals("0")) {
                    textViewInput.setText("");
                    Log.e(TAG, "clearIfEqualsZero: ");
                }
                clearCalcDisplay = DONT_CLEAR;
                textViewInput.append("2");
                break;

            case R.id.button_3:
                if (clearCalcDisplay == CLEAR) {
                    textViewInput.setText("");

                }
                if (textViewInput.getText().equals("0")) {
                    textViewInput.setText("");
                    Log.e(TAG, "clearIfEqualsZero: ");
                }
                clearCalcDisplay = DONT_CLEAR;
                textViewInput.append("3");
                break;

            case R.id.button_4:
                if (clearCalcDisplay == CLEAR) {
                    textViewInput.setText("");

                }
                if (textViewInput.getText().equals("0")) {
                    textViewInput.setText("");
                    Log.e(TAG, "clearIfEqualsZero: ");
                }
                clearCalcDisplay = DONT_CLEAR;
                textViewInput.append("4");
                break;

            case R.id.button_5:
                if (clearCalcDisplay == CLEAR) {
                    textViewInput.setText("");

                }
                clearCalcDisplay = DONT_CLEAR;
                textViewInput.append("5");
                break;

            case R.id.button_6:
                if (clearCalcDisplay == CLEAR) {
                    textViewInput.setText("");

                }
                clearCalcDisplay = DONT_CLEAR;
                textViewInput.append("6");
                break;

            case R.id.button_7:
                if (clearCalcDisplay == CLEAR) {
                    textViewInput.setText("");

                }
                if (textViewInput.getText().equals("0")) {
                    textViewInput.setText("");
                    Log.e(TAG, "clearIfEqualsZero: ");
                }
                clearCalcDisplay = DONT_CLEAR;
                textViewInput.append("7");
                break;

            case R.id.button_8:
                if (clearCalcDisplay == CLEAR) {
                    textViewInput.setText("");

                }
                if (textViewInput.getText().equals("0")) {
                    textViewInput.setText("");
                    Log.d(TAG, "clearIfEqualsZero: ");
                }
                clearCalcDisplay = DONT_CLEAR;
                textViewInput.append("8");
                break;

            case R.id.button_9:
                if (clearCalcDisplay == CLEAR) {
                    textViewInput.setText("");

                }
                if (textViewInput.getText().equals("0")) {
                    textViewInput.setText("");
                    Log.e(TAG, "clearIfEqualsZero: ");
                }
                clearCalcDisplay = DONT_CLEAR;
                textViewInput.append("9");
                break;

            case R.id.button_Clear:
                textViewInput.setText("0");
                result.removeAll(result);

                break;

            case R.id.button_plus:

                if (textViewInput.length() != 0) {
                    calcLogic(ADD);
                }
                Log.d(TAG, "Нажата кнопка +");
                break;

            case R.id.button_minus:
                if (textViewInput.length() != 0) {
                    calcLogic(SUBTRACT);

                }
                Log.d(TAG, "Нажата кнопка -");
                break;

            case R.id.button_divide:
                if (textViewInput.length() != 0) {
                    calcLogic(DIVISION);

                }

                Log.d(TAG, "Нажата кнопка /");
                break;
            case R.id.button_multiply:
                calcLogic(MULTIPLY);
                Log.d(TAG, "Нажата кнопка *");
                break;

            case R.id.button_equals:
                Log.d(TAG, "Нажата кнопка =");

                if (textViewInput.getText().length() != 0) {
                    try {
                        calcLogic(EQUALS);
                    } catch (Exception e) {

                        Log.e(TAG, "ошибка: " + e);
                    }


                }
                break;


            default:
                break;

        }
    }


    private void clearIfEqualsZero() {
        if (textViewInput.getText().equals("0")) {
            textViewInput.setText("");
            Log.e(TAG, "clearIfEqualsZero: ");
        }
    }


    /*Функция расчета введенных значений*/
    private void calcLogic(int operator) {

        try {
            result.add(Float.parseFloat(textViewInput.getText().toString()));

            if (operator != EQUALS) {
                nextOperation = operator;
            } else if (operator == EQUALS) {
                nextOperation = 0;
            }

            switch (currentOperation) {

        /*Прибавление*/
                case ADD:
                    number1 = result.get(0);
                    number2 = result.get(1);

                    result.removeAll(result);

                    result.add(number1 + number2);

                    textViewInput.setText(String.format("%.0f", result.get(0)));
                    break;

          /*Вычитание*/
                case SUBTRACT:
                    number1 = result.get(0);
                    number2 = result.get(1);

                    result.removeAll(result);

                    result.add(number1 - number2);

                    textViewInput.setText(String.format("%.0f", result.get(0)));
                    break;

          /*Умножение*/
                case MULTIPLY:
                    number1 = result.get(0);
                    number2 = result.get(1);

                    result.removeAll(result);

                    result.add(number1 * number2);

                    textViewInput.setText(String.format("%.0f", result.get(0)));
                    break;
           /*Деление*/
                case DIVISION:
                    number1 = result.get(0);
                    number2 = result.get(1);

                    result.removeAll(result);

                    result.add(number1 / number2);

                    textViewInput.setText(String.format("%.0f", result.get(0)));
                    break;
            }


            clearCalcDisplay = CLEAR;
            currentOperation = nextOperation;
            if (operator == EQUALS) {
                number1 = 0;
                number2 = 0;
                result.removeAll(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void paused(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            Log.e(TAG, "ошибка: " + e);
        }

    }


}
