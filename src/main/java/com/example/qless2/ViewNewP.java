package com.example.qless2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ViewNewP extends AppCompatActivity {
    EditText shopn;
    CheckBox chc;
    CheckBox chr;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_partner);
        Button button4 = findViewById(R.id.button);
        shopn=findViewById(R.id.shopname);
        chc=findViewById(R.id.checkBoxC);
        chr=findViewById(R.id.checkBoxR);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chc.isChecked() && chr.isChecked()) {
                    twoOption(v);
                }
                if(chc.isChecked() && !chr.isChecked()){
                    DataBase.cafe.add(DataBase.cafe.size(),new Shop("",chr.getText().toString(),shopn.getText().toString()));
                    Send(v);
                }
                if(chr.isChecked() && !chc.isChecked()){
                    DataBase.rest.add(DataBase.rest.size(),new Shop("",chr.getText().toString(),shopn.getText().toString()));
                    Send(v);
                }
            }
        });
    }
    public void Send(View view){
        Toast.makeText(this, "Your Shop has been added", Toast.LENGTH_LONG).show();
        }
    public void twoOption(View view){
        Toast.makeText(this, "You must select only one option", Toast.LENGTH_LONG).show();
    }




}
