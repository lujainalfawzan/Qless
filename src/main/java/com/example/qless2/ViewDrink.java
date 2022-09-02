package com.example.qless2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ViewDrink extends AppCompatActivity implements View.OnClickListener {
    ListView ListOfItems;
    DataBase data;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drink);

        Button button1 = findViewById(R.id.button23);
        button1.setOnClickListener(this);
        data=new DataBase();
        ListOfItems = (ListView) findViewById(R.id.ListOfItems);

        ArrayList<String> Items = new ArrayList<>();
        switch (ViewRestList.x){
            case 0:
                for(int i=0;i<DataBase.rest.get(0).shopmenu.get(0).menuDrink.size();i++)
                    Items.add(DataBase.rest.get(0).shopmenu.get(0).menuDrink.get(i).getitemName()+" Price:"+
                            DataBase.rest.get(0).shopmenu.get(0).menuDrink.get(i).getPrice());
                break;
            case 1:
                for(int i=0;i<DataBase.rest.get(1).shopmenu.get(0).menuDrink.size();i++)
                    Items.add(DataBase.rest.get(1).shopmenu.get(0).menuDrink.get(i).getitemName()+" Price:"+
                            DataBase.rest.get(1).shopmenu.get(0).menuDrink.get(i).getPrice());
                break;
            case 2:
                for(int i=0;i<DataBase.rest.get(2).shopmenu.get(0).menuDrink.size();i++)
                    Items.add(DataBase.rest.get(2).shopmenu.get(0).menuDrink.get(i).getitemName()+" Price:"+
                            DataBase.rest.get(2).shopmenu.get(0).menuDrink.get(i).getPrice());
                break;
            default:{
                switch (ViewCafeList.x){
                    case 0:
                        for(int i=0;i<DataBase.cafe.get(0).shopmenu.get(0).menuDrink.size();i++)
                            Items.add(DataBase.cafe.get(0).shopmenu.get(0).menuDrink.get(i).getitemName()+" Price:"+
                                    DataBase.cafe.get(0).shopmenu.get(0).menuDrink.get(i).getPrice());
                        break;
                    case 1:
                        for(int i=0;i<DataBase.cafe.get(1).shopmenu.get(0).menuDrink.size();i++)
                            Items.add(DataBase.cafe.get(1).shopmenu.get(0).menuDrink.get(i).getitemName()+" Price:"+
                                    DataBase.cafe.get(1).shopmenu.get(0).menuDrink.get(i).getPrice());
                        break;
                    case 2:
                        for(int i=0;i<DataBase.cafe.get(2).shopmenu.get(0).menuDrink.size();i++)
                            Items.add(DataBase.cafe.get(2).shopmenu.get(0).menuDrink.get(i).getitemName()+" Price:"+
                                    DataBase.cafe.get(2).shopmenu.get(0).menuDrink.get(i).getPrice());
                        break;
                }
            }

        }
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Items);

        ListOfItems.setAdapter(adp);
        ListOfItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                String s = "Adding to shopping cart";
                Toast.makeText(ViewDrink.this, s, Toast.LENGTH_LONG).show();
                ShopMenu.Order.add(selectedItem);
            }
        });
    }
    @Override
    public void onClick(View v) {

        if(R.id.button23 == v.getId()){
            openAct1();
        }
    }

    public void openAct1() {
        Intent intent = new Intent(this, CartActivity.class);
        startActivity(intent);
    }
}
