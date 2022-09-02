package com.example.qless2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity implements View.OnClickListener{

    ListView ListOfOrder;
    ViewFood VF;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopping_cart);
        ListOfOrder = findViewById(R.id.ListOfItems);

        int x = ShopMenu.Order.size();
        double d=0.0;
        for(int i=0;i<x;i++){
            int z=ShopMenu.Order.get(i).indexOf(":");
            z++;
            String c=ShopMenu.Order.get(i).substring(z);
            d+=Double.parseDouble(c);
        }
        ShopMenu.Order.add("total price= "+d);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ShopMenu.Order);

        ListOfOrder.setAdapter(adp);
        Button button1 = findViewById(R.id.shoppingcartbutton);
        button1.setOnClickListener(this);
        Customer user=new Customer("1","mohammed","123345","mohammed@email.com","1234567890");
        Order order=new Order(user,ShopMenu.Order);
    }
    @Override
    public void onClick(View v) {
    if(R.id.shoppingcartbutton == v.getId()){
        Toast.makeText(this,"Your order has been accepted",Toast.LENGTH_LONG).show();
    }

    }

}
