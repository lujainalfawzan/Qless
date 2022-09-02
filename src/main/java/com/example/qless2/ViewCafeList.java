package com.example.qless2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ViewCafeList extends AppCompatActivity{
    ListView lv;
    ArrayAdapter adapter;
    SearchView sv;
    DataBase b;
    ArrayList<String> list1;
    static int x;
    String s;
    boolean f=true;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafe_list);


        lv=findViewById(R.id.listviwe);
        sv=findViewById(R.id.searchView);
        list1=new ArrayList<String>();
        b=new DataBase();

        for(int i=0;i<b.cafe.size();i++){
            list1.add(b.cafe.get(i).getShopName());
        }

        adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,list1);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0 && adapter.getItem(0) == "Dunkin") {
                    Intent intent = new Intent(ViewCafeList.this, ShopMenu.class);
                    x = position;
                    startActivity(intent);
                }
                else if (position == 1 && adapter.getItem(1) == "Dr.Cafe") {
                    Intent intent = new Intent(ViewCafeList.this, ShopMenu.class);
                    x = position;
                    startActivity(intent);
                }
                else if (position == 2 && adapter.getItem(2) == "Starbucks") {
                    Intent intent = new Intent(ViewCafeList.this, ShopMenu.class);
                    x = position;
                    startActivity(intent);
                }
                else {
                    if(s.charAt(0) == b.rest.get(1).getShopName().charAt(0)) {
                        for(int i=1;i<s.length();i++)
                            if (s.charAt(i) != b.cafe.get(1).getShopName().charAt(i))
                                f = false;
                        if(f == true) {
                            Intent intent = new Intent(ViewCafeList.this, ShopMenu.class);
                            x = 1;
                            startActivity(intent);
                        }
                    }
                    else if(s.charAt(0) == b.cafe.get(2).getShopName().charAt(0)) {
                        for(int i=1;i<s.length();i++)
                            if (s.charAt(i) != b.cafe.get(2).getShopName().charAt(i))
                                f = false;
                        if(f == true) {
                            Intent intent = new Intent(ViewCafeList.this, ShopMenu.class);
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

