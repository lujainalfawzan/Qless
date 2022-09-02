package com.example.qless2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ShopMenu extends AppCompatActivity implements View.OnClickListener {

    static ArrayList<String> Order = new ArrayList<String>();

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_menu);

        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(this);
        Button button2 = findViewById(R.id.SeeListDrink);
        button2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                //startActivity(this, ViewRestList.class);
                openAct1();
                break;
            case R.id.SeeListDrink:
                openAct2();
                break;
        }
    }

    public void openAct1(){
        Intent intent = new Intent(this,ViewFood.class);
        startActivity(intent);
    }

    public void openAct2(){
        Intent intent = new Intent(this,ViewDrink.class);
        startActivity(intent);
    }

}
