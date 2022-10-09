package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int calculatedbill = 0;

    private int VegPizzaBasePrice = 300;
    private int NonVegPizzaBasePrice = 400;
    private int ExtraCheesePrice = 80;
    private int ExtraToppingsForVegPizza = 70;
    private int ExtraToppingsForNonvegPizza = 120;
    private int PaperBagPrice = 20;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg)
            this.price = VegPizzaBasePrice;
        else
            this.price = NonVegPizzaBasePrice;

        this.calculatedbill += this.price;
    }

    public void Deluxe(boolean isDeluxe){
        this.calculatedbill += 150;
        this.price += 150;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        this.calculatedbill += ExtraCheesePrice;

    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg)
            this.calculatedbill += this.ExtraToppingsForVegPizza;
        else
            this.calculatedbill += this.ExtraToppingsForNonvegPizza;
    }

    public void addTakeaway(){
        // your code goes here
        this.calculatedbill += this.PaperBagPrice;
    }

    public String getBill(){
        // your code goes here
        this.bill = String.valueOf(this.calculatedbill);
        return this.bill;
    }
}
