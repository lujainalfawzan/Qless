package com.example.qless2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class DataBase extends AppCompatActivity {
    static ArrayList<Shop> rest = new ArrayList<>();
     static ArrayList<Shop> cafe = new ArrayList<>();
    Menu r1=new Menu();
    Menu r2=new Menu();
    Menu r3=new Menu();
    Menu c1=new Menu();
    Menu c2=new Menu();
    Menu c3=new Menu();
    public DataBase() {

        rest.add(0,new Shop("Mc", "restaurant", "McDonalds")); //one rest
        rest.get(0).shopmenu.add(r1);
        rest.add(1,new Shop("Kfc", "restaurant", "Kfc"));
        rest.get(1).shopmenu.add(r2);
        rest.add(2,new Shop("inNout", "restaurant", "IN-N-OUT"));
        rest.get(2).shopmenu.add(r3);
        cafe.add(new Shop("cafe1","cafe", "Dunkin"));
        cafe.get(0).shopmenu.add(c1);
        cafe.add(new Shop("cafe2","cafe", "Dr.Cafe"));
        cafe.get(1).shopmenu.add(c2);
        cafe.add(new Shop("cafe3","cafe", "Starbucks"));
        cafe.get(2).shopmenu.add(c3);



        r1.menuDrink.add(0,new Item("cola",10.6,1));
        r1.menuDrink.add(1,new Item("orange",5.6,1));
        r1.menuFood.add(0,new Item("Mc wrap",15.6,1));
        r1.menuFood.add(1,new Item("macburger",35.6,1));

        r2.menuDrink.add(new Item("cola",10.6,2));
        r2.menuDrink.add(new Item("orange",5.6,2));
        r2.menuFood.add(new Item("MozzarellaBurger",15.6,2));
        r2.menuFood.add(new Item("SpicyTwister",35.6,2));

        r3.menuDrink.add(new Item("Seven-up",10.6,3));
        r3.menuDrink.add(new Item("Lemonada",5.6,3));
        r3.menuFood.add(new Item("CheeseBurger",15.6,3));
        r3.menuFood.add(new Item("Hamburger",35.6,3));

        c1.menuDrink.add(new Item("Black coffe",10.6,1));
        c1.menuDrink.add(new Item("iced caffe mocha",11.6,1));
        c1.menuFood.add(new Item("cookies",15.6,1));
        c1.menuFood.add(new Item("cakes",35.6,1));

        c2.menuDrink.add(new Item("Amerucan caffe",10.6,2));
        c2.menuDrink.add(new Item("Tea",5.6,2));
        c2.menuFood.add(new Item("Cheesecake",15.6,2));
        c2.menuFood.add(new Item("Cakes",22.6,2));


        c3.menuDrink.add(new Item("Amerucan caffe",10.6,3));
        c3.menuDrink.add(new Item("Iced white mocha",16.6,2));
        c3.menuFood.add(new Item("Cheesecake",15.6,3));
        c3.menuFood.add(new Item("Cakes",22.6,3));






    }


}
class Order{
    Customer User;
    int orderID=-1;
    ArrayList<String> userOrder=new ArrayList<>();

    public Order(Customer User,ArrayList<String> order) {
        this.User=User;
        orderID++;
        for(int i=0;i<order.size();i++){
            userOrder.add(order.get(i));
        }
    }
}
class Customer {

    private String ID;
    private String userName;
    private String passWord;
    private String email;
    private String phoneNumber;

    //constructor
    public Customer(String ID, String userName, String passWord, String email, String phoneNumber) {
        this.ID = ID;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //setters
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //getters
    public String getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //signUp method
    public boolean signUp(String userName , String passWord , String email , String phoneNumber){

        return true; //to be removed
    }
    //signIn method
    public boolean signIn(String userName , String passWord ){

        return true; //to be removed
    }
    //forgotpassword method
    public String ForgotPassword(String email){

        return "test"; //to be removed
    }


}
 class Shop {
     private String ShopID;
     private String ShopType;
     private String ShopName;
     ArrayList<Menu> shopmenu;

     public Shop(String ShopID, String ShopType, String ShopName) {
         this.ShopID = ShopID;
         this.ShopType = ShopType;
         this.ShopName = ShopName;
         shopmenu=new ArrayList<>();
     }
     public void setShopID(String ShopID) {
         this.ShopID = ShopID;
     }

     public void setShopType(String ShopType) {
         this.ShopType = ShopType;
     }

     public void setShopName(String ShopName) {
         this.ShopName = ShopName;
     }

     public String getShopID() {
         return ShopID;
     }

     public String getShopType() {
         return ShopType;
     }

     public String getShopName() {
         return ShopName;
     }


 }
class Menu {
    ArrayList<Item> menuFood=new ArrayList<>();
    ArrayList<Item> menuDrink=new ArrayList<>();

    public void selsctType(){

    }

}

 class Item{
         private String itemName;
         private double price;
         private int itemID;

     public Item(String itemName, double price, int itemID) {
             this.itemName = itemName;
             this.price = price;
             this.itemID = itemID;
         }

     public void setitemName(String itemDescrption) {
         this.itemName = itemDescrption;
     }

     public void setPrice(double price) {
         this.price = price;
     }

     public void setItemID(int itemID) {
         this.itemID = itemID;
     }

     public String getitemName() {
         return itemName;
     }

     public double getPrice() {
         return price;
     }

     public int getItemID() {
         return itemID;
     }


 }
class Newpartner {
    private String phoneNumber;
    private String email;
    private String descrption;

    public Newpartner(String phoneNumber, String email, String descrption) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.descrption = descrption;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

}

class ShoppingCart {

    public void addItem(Item item){

    }
    public boolean remove(Item item){

        return true; //to be removed
    }
    public double calcTotal(){

        return 1.1; // to be removed
    }

    public void comment(String comment){

    }
    public void DisplayOrder(){

    }
}



