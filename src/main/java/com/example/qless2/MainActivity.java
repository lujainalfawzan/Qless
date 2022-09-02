package com.example.qless2;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button1 = findViewById(R.id.RList);
        Button button2 = findViewById(R.id.goToCafeList);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);


    }

    /*public void openAct4(){
        //Intent intent = new Intent(this, ViewNewP.class);
        //startActivity(intent);
        Toast.makeText(this, "your request has been sent, wait for the admins respones", Toast.LENGTH_LONG).show();
    }*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.popup_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== R.id.item3 ){
            openAct3();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.RList:
                openAct1();
                break;
            case R.id.goToCafeList:
                openAct2();
                break;
            //case R.id.b:
                //openAct3();
                //break;
            //case R.id.button:
                //Toast.makeText(this, "your request has been sent, wait for the admins respones", Toast.LENGTH_LONG);
                //Send(v);
               // break;
        }
    }
    public void openAct1(){
        Intent intent = new Intent(this,ViewRestList.class);
        startActivity(intent);
    }

    public void openAct2(){
        Intent intent = new Intent(this , ViewCafeList.class);
        startActivity(intent);
    }

    public void openAct3(){
        Intent intent = new Intent(this , ViewNewP.class);
        startActivity(intent);
    }



}
