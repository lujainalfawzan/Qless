package com.example.qless2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ViewRestList extends AppCompatActivity {
    ListView lv;
    ArrayAdapter adapter;
    SearchView sv;
    ArrayList<String> list1;
    static int x = -1;
    String s;
    boolean f=true;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rest_list);
        lv = findViewById(R.id.test);
        sv = findViewById(R.id.searchv);
        list1 = new ArrayList<String>();

        for (int i = 0; i < DataBase.rest.size(); i++) {
            list1.add(DataBase.rest.get(i).getShopName());
        }

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list1);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0 && adapter.getItem(0) == "McDonalds") {
                    Intent intent = new Intent(ViewRestList.this, ShopMenu.class);
                    x = position;
                    startActivity(intent);
                }
                else if (position == 1 && adapter.getItem(1) == "Kfc") {
                    Intent intent = new Intent(ViewRestList.this, ShopMenu.class);
                    x = position;
                    startActivity(intent);
                }
                else if (position == 2 && adapter.getItem(2) == "IN-N-OUT") {
                    Intent intent = new Intent(ViewRestList.this, ShopMenu.class);
                    x = position;
                    startActivity(intent);
                }
                else {
                    if(s.charAt(0) == DataBase.rest.get(1).getShopName().charAt(0)) {
                        for(int i=1;i<s.length();i++)
                            if (s.charAt(i) != DataBase.rest.get(1).getShopName().charAt(i))
                                f = false;
                        if(f == true) {
                            Intent intent = new Intent(ViewRestList.this, ShopMenu.class);
                            x = 1;
                            startActivity(intent);
                        }
                    }
                    else if(s.charAt(0) == DataBase.rest.get(2).getShopName().charAt(0)) {
                        for(int i=1;i<s.length();i++)
                            if (s.charAt(i) != DataBase.rest.get(2).getShopName().charAt(i))
                                f = false;
                        if(f == true) {
                            Intent intent = new Intent(ViewRestList.this, ShopMenu.class);
                            x = 2;
                            startActivity(intent);
                        }
                    }
                }
            }
        });
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                s=newText;
                return false;
            }
        });

    }
}