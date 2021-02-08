package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button plus;
    Button minus;
    Button equal;
    Button multiply;
    Button divide;
    Button zero;
    Button clear;
    TextView display;
    int x=0;
    int y=0;
    int z=0;
    char op='0';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        plus=(Button)findViewById(R.id.button10);
        minus=(Button)findViewById(R.id.button11);
        equal=(Button)findViewById(R.id.button12);
        clear=(Button)findViewById(R.id.button13);
        zero=(Button)findViewById(R.id.button14);
        divide=(Button)findViewById(R.id.button15);
        multiply=(Button)findViewById(R.id.button16);
        display=(TextView)findViewById(R.id.textView);
        display.setText("0");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText("1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText("2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText("3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText("4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText("5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText("6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText("7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText("8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText("9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText("0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plusfun();
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                minusfun();
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplyfun();
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dividefun();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearfun();
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });


    }

    void displayText(String s)
    {
        if(display.getText().toString()=="0")
        {
            display.setText(s);
        }
        else
        {
            String s1=display.getText().toString();
            s1+=s;
            display.setText(s1);
        }
    }

    void plusfun()
    {
        x=Integer.parseInt(display.getText().toString());
        op='+';
        display.setText("0");
    }
    void minusfun()
    {
        x=Integer.parseInt(display.getText().toString());
        op='-';
        display.setText("0");
    }
    void multiplyfun()
    {
        x=Integer.parseInt(display.getText().toString());
        op='*';
        display.setText("0");
    }
    void dividefun()
    {
        x=Integer.parseInt(display.getText().toString());
        op='/';
        display.setText("0");
    }

    void calculate()
    {

        if(op!='0')
        {
            y=Integer.parseInt(display.getText().toString());
            switch(op)
            {
                case '+':z=x+y;
                    break;
                case '-':z=x-y;
                    break;
                case '*':z=x*y;
                    break;
                case '/':if(y!=0)
                        z=x/y;
                    break;
            }
        }
        if(op=='/' && y==0)
        {
            display.setText("CANNOT DIV BY ZERO");
        }
        else
            display.setText(Integer.toString(z));
        x=0;
        y=0;
        z=0;
        op='0';
    }

    void clearfun()
    {
        display.setText("0");
        x=0;
        y=0;
        z=0;
        op='0';
    }


}

