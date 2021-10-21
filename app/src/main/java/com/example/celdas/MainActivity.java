package com.example.celdas;

import static android.graphics.Color.rgb;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    /*
    --Colores-- rgb
    Naranja-> 225,135,27
    Gris-> 97,95,91
     */




    Button btn1,btn2,btn3,btn4;

    int estado_btn1 = 0;
    int estado_btn2 = 0;
    int estado_btn3 = 0;
    int estado_btn4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

    }

    public void click_btn1(View view){
        cambiar_btn1();
        cambiar_btn2();
        cambiar_btn3();
    }

    public void click_btn2(View view){
        cambiar_btn2();
        cambiar_btn4();
        cambiar_btn1();
    }

    public void click_btn3(View view){
        cambiar_btn3();
        cambiar_btn4();
        cambiar_btn1();

    }

    public  void  click_btn4(View view){
        cambiar_btn4();
        cambiar_btn3();
        cambiar_btn2();
    }

    public void cambiar_btn1(){
        if (estado_btn1 == 0){
            estado_btn1 = 1;
            btn1.setBackgroundColor(rgb(225,135,27));
        }
        else{
            estado_btn1 = 0;
            btn1.setBackgroundColor(rgb(97,95,91));
        }
    }



    private void cambiar_btn2(){
        if(estado_btn2 == 0){
            estado_btn2 = 1;
            btn2.setBackgroundColor(rgb(225,135,27));
        }
        else {
            estado_btn2 = 0;
            btn2.setBackgroundColor(rgb(97,95,91));
        }
    }

    private void cambiar_btn3(){
        if(estado_btn3 == 0){
            estado_btn3 = 1;
            btn3.setBackgroundColor(rgb(225,135,27));
        }
        else{
            estado_btn3 = 0;
            btn3.setBackgroundColor(rgb(97,95,91));
        }
    }



    private void cambiar_btn4(){
        if(estado_btn4 == 0){
            estado_btn4 = 1;
            btn4.setBackgroundColor(rgb(225,135,27));
        }
        else{
            estado_btn4 = 0;
            btn4.setBackgroundColor(rgb(97,95,91));
        }
    }





}