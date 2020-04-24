package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView input, signbox;
    String sign, value1, value2,specialFunction;
    Double num1=0.0;
    Double num2=0.0;
    Double num3=0.0;
    Double result=0.0;
    boolean hasDot,isSpecialFunction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (TextView) findViewById(R.id.input);
        signbox = (TextView) findViewById(R.id.sign);
        hasDot = false;
        isSpecialFunction = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_0(View view) {
        input.setText(input.getText()+"0");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_1(View view) {
        input.setText(input.getText()+"1");
    }@SuppressLint("SetTextI18n")
    public void btnClick_2(View view) {
        input.setText(input.getText()+"2");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_3(View view) {
        input.setText(input.getText()+"3");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_4(View view) {
        input.setText(input.getText()+"4");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_5(View view) {
        input.setText(input.getText()+"5");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_6(View view) {
        input.setText(input.getText()+"6");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_7(View view) {
        input.setText(input.getText()+"7");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_8(View view) {
        input.setText(input.getText()+"8");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_9(View view) {
        input.setText(input.getText()+"9");
    }

    public void btnClick_dot(View view) {
        if(!hasDot){
            if(input.getText().equals("")){
                hasDot = true;
                input.setText("0.");
            }else {
                input.setText(input.getText()+".");
            }
            hasDot = true;
        }
    }

    public void btnClick_div(View view) {
        sign = "/";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("÷");
        hasDot = false;
    }

    public void btnClick_mult(View view) {
        sign = "*";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("*");
        hasDot = false;
    }

    public void btnClick_mind(View view) {
        sign = "-";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("-");
        hasDot = false;
    }

    public void btnClick_add(View view) {
        sign = "+";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText("+");
        hasDot = false;
    }

    public void btnClick_log(View view) {
        specialFunction = "log";
        isSpecialFunction = true;
        input.setText(null);
        signbox.setText("log");
        hasDot = false;
    }

    public void btnClick_ln(View view) {
        isSpecialFunction = true;
        specialFunction = "ln";
        input.setText(null);
        signbox.setText("ln");
        hasDot = false;
    }

    public void btnClick_puissance(View view) {
        isSpecialFunction = true;
        specialFunction = "puissance";
        value1 = input.getText().toString();
        input.setText(null);
        hasDot = false;
        signbox.setText("xⁿ");
    }

    public void btnClick_racine(View view) {
        isSpecialFunction = true;
        specialFunction = "racine";
        input.setText(null);
        hasDot = false;
        signbox.setText("√");
    }

    public void btnClick_factorielle(View view) {
        isSpecialFunction = true;
        specialFunction = "factorielle";
        input.setText(null);
        hasDot = false;
        signbox.setText("!");
    }

    public void btnClick_sin(View view) {
        isSpecialFunction = true;
        specialFunction = "sin";
        input.setText(null);
        hasDot = false;
        signbox.setText("sin");
    }

    public void btnClick_cos(View view) {
        isSpecialFunction = true;
        specialFunction = "cos";
        input.setText(null);
        hasDot = false;
        signbox.setText("cos");
    }

    public void btnClick_tan(View view) {
        isSpecialFunction = true;
        specialFunction = "tan";
        input.setText(null);
        hasDot = false;
        signbox.setText("tan");

    }

    public void btnClick_equal(View view) {
        if((specialFunction == null && sign == null) || input.getText().equals("")){
            signbox.setText("Error!");
        }else if(specialFunction != null){
            switch(specialFunction){
                default:
                    break;
                case "log":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log10(num1)+"");
                    specialFunction = null;
                    isSpecialFunction = false;
                    signbox.setText(null);
                    break;
                case "ln":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log(num1)+"");
                    specialFunction = null;
                    isSpecialFunction = false;
                    signbox.setText(null);
                    break;
                case "puissance":
                    num1 = Double.parseDouble(value1);
                    value2 = input.getText().toString();
                    num2 = Double.parseDouble(value2);
                    input.setText(Math.pow(num1, num2) + "");
                    specialFunction = null;
                    isSpecialFunction = false;
                    signbox.setText(null);
                    break;
                case "racine":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sqrt(num1) + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "factorielle":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);

                    int i = Integer.parseInt(value1) - 1;

                    while (i > 0) {
                        num1 = num1 * i;
                        i--;
                    }

                    input.setText(num1 + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "sin":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num1 = (num1*Math.PI)/180;
                    input.setText(Math.sin(num1) + "");
                    specialFunction = null;
                    isSpecialFunction = false;
                    signbox.setText(null);
                    break;
                case "cos":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num1 = (num1*Math.PI)/180;
                    input.setText(Math.cos(num1) + "");
                    specialFunction = null;
                    isSpecialFunction = false;
                    signbox.setText(null);
                    break;
                case "tan":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num1 = (num1*Math.PI)/180;
                    input.setText(Math.tan(num1) + "");
                    specialFunction = null;
                    isSpecialFunction = false;
                    signbox.setText(null);
                    break;
            }
        } else if(sign != null){
            value2 = input.getText().toString();
            num1 = Double.parseDouble(value1);
            num2 = Double.parseDouble(value2);
            input.setText(null);

            switch(sign){
                default:
                    break;
                case "+":
                    result = num1 + num2;
                    input.setText(result + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "-":
                    result = num1 - num2;
                    input.setText(result + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "*":
                    result = num1 * num2;
                    input.setText(result + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "/":
                    result = num1 / num2;
                    input.setText(result + "");
                    sign = null;
                    signbox.setText(null);
                    break;
            }

        }
        else input.setText("Error!");
    }

    public void btnClick_delete(View view) {
        if(input.getText().equals("")){
            input.setText(null);
        }else{
            int len = input.getText().length();
            String s = input.getText().toString();
            if(s.charAt(len-1) == '.'){
                hasDot = false;
                input.setText(input.getText().subSequence(0,input.getText().length() - 1));
            }else{
                input.setText(input.getText().subSequence(0,input.getText().length() - 1));
            }
        }
    }

    public void btnClick_clear(View view) {
        input.setText(null);
        signbox.setText(null);
        value1 = null;
        value2 = null;
        sign = null;
        hasDot = false;
    }
}
