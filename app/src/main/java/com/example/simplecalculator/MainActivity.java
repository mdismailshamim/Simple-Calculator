package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,button7,
            button8,button9,buttonPercent,buttonPlus,buttonMinus,buttonMultiply,
            buttonDivision,buttonEqual,buttonClear,buttonDot,buttonBracket;
    TextView tvInput,tvOutput;
    String process;
    boolean checkBracket = false;
    private boolean lastNumeric;
    // Represent that current state is in error or not
    private boolean stateError;
    // If true, do not allow to add another DOT
    private boolean lastDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.btn0); button1 = findViewById(R.id.btn1); button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3); button4 = findViewById(R.id.btn4); button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6); button7 = findViewById(R.id.btn7); button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);

        buttonPlus = findViewById(R.id.btnPlus); buttonMinus = findViewById(R.id.btnMinus);
        buttonDivision = findViewById(R.id.btnDivision); buttonMultiply = findViewById(R.id.btnMultiply);
        buttonEqual = findViewById(R.id.btnEqual); buttonClear = findViewById(R.id.btnClear);
        buttonDot = findViewById(R.id.btnDot); buttonPercent = findViewById(R.id.btnPercent);
        buttonBracket = findViewById(R.id.btnBracket); tvInput = findViewById(R.id.tvInput);
        tvOutput = findViewById(R.id.tvOutput);

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOutput.setText("");
            }
        });


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "0");
                stateError = false;
                lastNumeric = true;
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "1");
                stateError = false;
                lastNumeric = true;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "2");
                stateError = false;
                lastNumeric = true;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "3");
                stateError = false;
                lastNumeric = true;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "4");
                stateError = false;
                lastNumeric = true;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "5");
                stateError = false;
                lastNumeric = true;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "6");
                stateError = false;
                lastNumeric = true;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "6");
                stateError = false;
                lastNumeric = true;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "7");
                stateError = false;
                lastNumeric = true;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "8");
                stateError = false;
                lastNumeric = true;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "9");
                stateError = false;
                lastNumeric = true;
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "+");
                lastNumeric = false;
                lastDot = false;    // Reset the DOT flag
            }
        });


        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "-");
                lastNumeric = false;
                lastDot = false;    // Reset the DOT flag
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "*");
                lastNumeric = false;
                lastDot = false;    // Reset the DOT flag
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "/");
                lastNumeric = false;
                lastDot = false;    // Reset the DOT flag
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + ".");
                lastNumeric = false;
                lastDot = true;
            }
        });

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getPercent = tvInput.getText().toString();
                process = tvInput.getText().toString();
                String percentResult = process+"%";
                tvInput.setText(percentResult);
                lastNumeric = false;
                lastDot = true;
            }
        });

        buttonBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkBracket){
                    process = tvInput.getText().toString();
                    tvInput.setText(process + ")");
                    checkBracket = false;
                }else{
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "(");
                    checkBracket = true;
                }

            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String finalResult = "";
                String txt = tvInput.getText().toString();
                // Create an Expression (A class from exp4j library)
                Expression expression = new ExpressionBuilder(txt).build();
                try {
                    double result = expression.evaluate();
                    tvInput.setText(Double.toString(result));
                    lastDot = true; // Result contains a dot
                }catch (ArithmeticException e){
                    finalResult= "Error";
                    stateError = true;
                    lastNumeric = false;
                }
                tvOutput.setText(finalResult);
            }
        });
    }
}
