package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView inputUser, inputResultat;


    Double num1, num2, answer;
    String sign, val_1, val_2;
    boolean has_Dot;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUser = (TextView) findViewById(R.id.inputUser);
        inputResultat = (TextView) findViewById(R.id.inputResultat);

        has_Dot = false;

    }



    @SuppressLint("SetTextI18n")
    public void btn_0(View view) {
        inputUser.setText(inputUser.getText() + "0");
    }

    @SuppressLint("SetTextI18n")
    public void btn_1(View view) {
        inputUser.setText(inputUser.getText() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void btn_2(View view) {
        inputUser.setText(inputUser.getText() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void btn_3(View view) {
        inputUser.setText(inputUser.getText() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void btn_4(View view) {
        inputUser.setText(inputUser.getText() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void btn_5(View view) {
        inputUser.setText(inputUser.getText() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void btn_6(View view) {
        inputUser.setText(inputUser.getText() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void btn_7(View view) {
        inputUser.setText(inputUser.getText() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void btn_8(View view) {
        inputUser.setText(inputUser.getText() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void btn_9(View view) {
        inputUser.setText(inputUser.getText() + "9");
    }

    @SuppressLint("SetTextI18n")
    public void btn_dot(View view) {
        if (!has_Dot) {
            if (inputUser.getText().equals("")) {

                inputUser.setText("0.");
            } else {

                inputUser.setText(inputUser.getText() + ".");
            }

            has_Dot = true;
        }

    }

    public void btn_add(View view) {
        sign = "+";
        val_1 = inputUser.getText().toString();
        inputUser.setText(null);
        inputResultat.setText("+");
        has_Dot = false;
    }

    public void btn_subtract(View view) {
        sign = "-";
        val_1 = inputUser.getText().toString();
        inputUser.setText(null);
        inputResultat.setText("-");
        has_Dot = false;
    }

    public void btn_multiply(View view) {
        sign = "*";
        val_1 = inputUser.getText().toString();
        inputUser.setText(null);
        inputResultat.setText("×");
        has_Dot = false;
    }

    public void btn_divide(View view) {
        sign = "/";
        val_1 = inputUser.getText().toString();
        inputUser.setText(null);
        inputResultat.setText("÷");
        has_Dot = false;
    }

    public void btn_module(View view) {
        sign = "%";
        val_1 = inputUser.getText().toString();
        inputUser.setText(null);
        inputResultat.setText("%");
        has_Dot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btn_log(View view) {
        sign = "log";
        inputUser.setText(null);
        inputResultat.setText("log");
        has_Dot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btn_ln(View view) {
        sign = "ln";
        inputUser.setText(null);
        inputResultat.setText("ln");
        has_Dot = false;
    }

    public void btn_power(View view) {
        sign = "power";
        val_1 = inputUser.getText().toString();
        inputUser.setText(null);
        has_Dot = false;
        inputResultat.setText("xⁿ");
    }

    public void btn_factorial(View view) {
        sign = "factorial";
        inputUser.setText(null);
        has_Dot = false;
        inputResultat.setText("!");
    }

    @SuppressLint("SetTextI18n")
    public void btn_sin(View view) {
        sign = "sin";
        inputUser.setText(null);
        has_Dot = false;
        inputResultat.setText("sin");
    }

    @SuppressLint("SetTextI18n")
    public void btn_cos(View view) {
        sign = "cos";
        inputUser.setText(null);
        has_Dot = false;
        inputResultat.setText("cos");
    }

    @SuppressLint("SetTextI18n")
    public void btn_tan(View view) {
        sign = "tan";
        inputUser.setText(null);
        has_Dot = false;
        inputResultat.setText("tan");
    }

    public void btn_root(View view) {
        sign = "root";
        inputUser.setText(null);
        has_Dot = false;
        inputResultat.setText("√");
    }



    @SuppressLint("SetTextI18n")
    public void btn_equal(View view) {
        if (sign == null) {
            inputResultat.setText("= Error!");
        } else if (inputUser.getText().equals("")) {
            inputResultat.setText("Error!");
        } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && val_1.equals("")) {
            inputResultat.setText("Error!");
        } else {
            switch (sign) {
                default:
                    break;
                case "log":
                    val_1 = inputUser.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    inputUser.setText(Math.log10(num1) + "");
                    sign = null;
                    inputResultat.setText(null);
                    break;
                case "ln":
                    val_1 = inputUser.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    inputUser.setText(Math.log(num1) + "");
                    sign = null;
                    inputResultat.setText(null);
                    break;
                case "power":
                    num1 = Double.parseDouble((val_1));
                    val_2 = inputUser.getText().toString();
                    num2 = Double.parseDouble(val_2);
                    inputUser.setText(Math.pow(num1, num2) + "");
                    sign = null;
                    inputResultat.setText(null);
                    break;
                case "root":
                    val_1 = inputUser.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    inputUser.setText(Math.sqrt(num1) + "");
                    sign = null;
                    inputResultat.setText(null);
                    break;
                case "factorial":
                    val_1 = inputUser.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    int i = Integer.parseInt(val_1) - 1;

                    while (i > 0) {
                        num1 = num1 * i;
                        i--;
                    }

                    inputUser.setText(num1 + "");
                    sign = null;
                    inputResultat.setText(null);
                    break;
                case "sin":
                    val_1 = inputUser.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    inputUser.setText(Math.sin(num1) + "");
                    sign = null;
                    inputResultat.setText(null);
                    break;
                case "cos":
                    val_1 = inputUser.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    inputUser.setText(Math.cos(num1) + "");
                    sign = null;
                    inputResultat.setText(null);
                    break;
                case "tan":
                    val_1 = inputUser.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    inputUser.setText(Math.tan(num1) + "");
                    sign = null;
                    inputResultat.setText(null);
                    break;

                case "+":
                    val_2 = inputUser.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 + num2;
                    inputUser.setText(answer + "");
                    sign = null;
                    inputResultat.setText(null);
                    break;
                case "-":
                    val_2 = inputUser.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 - num2;
                    inputUser.setText(answer + "");
                    sign = null;
                    inputResultat.setText(null);
                    break;
                case "*":
                    val_2 = inputUser.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 * num2;
                    inputUser.setText(answer + "");
                    sign = null;
                    inputResultat.setText(null);
                    break;
                case "/":
                    val_2 = inputUser.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 / num2;
                    inputUser.setText(answer + "");
                    sign = null;
                    inputResultat.setText(null);
                    break;
                case "%":
                    val_2 = inputUser.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 % num2;
                    inputUser.setText(answer + "");
                    sign = null;
                    inputResultat.setText(null);
                    break;
            }

        }
    }


    public void btn_delete(View view) {
        if (inputUser.getText().equals("")) {
            inputUser.setText(null);
        } else {
            int len = inputUser.getText().length();
            String s = inputUser.getText().toString();
            if (s.charAt(len - 1) == '.') {
                has_Dot = false;
                inputUser.setText(inputUser.getText().subSequence(0, inputUser.getText().length() - 1));

            } else {
                inputUser.setText(inputUser.getText().subSequence(0, inputUser.getText().length() - 1));
            }
        }
    }

    public void btn_clear(View view) {

        inputUser.setText(null);
        inputResultat.setText(null);
        val_1 = null;
        val_2 = null;
        sign = null;
        has_Dot = false;
    }


}
