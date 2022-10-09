package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extracheese = false;
    private boolean extratoppings = false;
    private boolean takeaway = false;
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
        if(!extracheese){
            extracheese = true;
            this.calculatedbill += ExtraCheesePrice;
        }


    }

    public void addExtraToppings(){
        // your code goes here
        if(!extratoppings){
            extratoppings = true;
            if(this.isVeg)
                this.calculatedbill += this.ExtraToppingsForVegPizza;
            else
                this.calculatedbill += this.ExtraToppingsForNonvegPizza;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway){
            takeaway = true;
            this.calculatedbill += this.PaperBagPrice;
        }

    }

    public String getBill(){
        // your code goes here
//        Base Price Of The Pizza: 300
//        Extra Cheese Added: 80
//        Extra Toppings Added: 70
//        Paperbag Added: 20
//        Total Price: 470
        String answer = "";
        answer += "Base Price Of The Pizza: " + String.valueOf(this.price) + "\n";

        if(this.extracheese)
            answer += "Extra Cheese Added: 80" + "\n";

        if(this.extratoppings){
            if(this.isVeg)
                answer += "Extra Toppings Added: 70" + "\n";
            else
                answer += "Extra Toppings Added: 120" + "\n";
        }

        if(this.takeaway)
            answer += "Paperbag Added: 20" + "\n";

        answer += "Total Price: " + this.calculatedbill + "\n";

        this.bill = answer;

        return this.bill;
    }
}
