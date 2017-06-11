package com.londonoe.daniel.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    EditText op;
    Button b0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button bMas;
    Button bMen;
    Button bx;
    Button bDiv;
    Button bIgual;
    Button bPto;
    String Tex="";
    String Tex1="";
    String Tex2="";
    boolean i=false;
    float r=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        op = (EditText) findViewById(R.id.op);
        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        bx = (Button) findViewById(R.id.bx);
        bMas = (Button) findViewById(R.id.bMas);
        bMen = (Button) findViewById(R.id.bMen);
        bDiv = (Button) findViewById(R.id.bDiv);
        bIgual = (Button) findViewById(R.id.bIgual);
        bPto = (Button) findViewById(R.id.bPto);
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bx.setOnClickListener(this);
        bMas.setOnClickListener(this);
        bMen.setOnClickListener(this);
        bDiv.setOnClickListener(this);
        bIgual.setOnClickListener(this);
        bPto.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b0:
                Tex=Tex+"0";
                break;
            case R.id.b1:
                Tex=Tex+"1";
                break;
            case R.id.b2:
                Tex=Tex+"2";
                break;
            case R.id.b3:
                Tex=Tex+"3";
                break;
            case R.id.b4:
                Tex=Tex+"4";
                break;
            case R.id.b5:
                Tex=Tex+"5";
                break;
            case R.id.b6:
                Tex=Tex+"6";
                break;
            case R.id.b7:
                Tex=Tex+"7";
                break;
            case R.id.b8:
                Tex=Tex+"8";
                break;
            case R.id.b9:
                Tex=Tex+"9";
                break;
            case R.id.bMas:
                i=true;
                r=r+Float.parseFloat(Tex);
                op.setText("+");
                break;
            case R.id.bMen:
                i=true;
                r=r-Float.parseFloat(Tex);
                op.setText("-");
                break;
            case R.id.bx:
                i=true;
                r=r*Float.parseFloat(Tex);
                op.setText("*");
                break;
            case R.id.bDiv:
                i=true;
                r=r/Float.parseFloat(Tex);
                op.setText("/");
            break;
            case R.id.bIgual:
                i=true;
                switch (op.getText().toString())
                {
                    case "+":
                        r=r+Float.parseFloat(Tex);
                        break;
                    case "-":
                        r=r-Float.parseFloat(Tex);
                        break;
                    case "*":
                        r=r*Float.parseFloat(Tex);
                        break;
                    case "/":
                        r=r/Float.parseFloat(Tex);
                        break;
                }
                op.setText("=");
                break;
            case R.id.bPto:
                Tex=Tex+".";
                break;
        }
        if (i==true)
        {
            Tex1=Float.toString(r);
            Tex="";
            i=false;
            editText.setText(Tex1);
        }
        else
        {
            editText.setText(Tex);
        }
    }
}
