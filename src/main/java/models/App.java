package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("Welcome to Events-R-Us");
            System.out.println("Let's get this party rolling!");
            System.out.println("The following choices are required to plan your event.");
            System.out.println("How many guests will be at your event?");
            String stringGuests = bufferedReader.readLine();

            System.out.println("Please choose a meal." + '\n' + "Enter 1 for Chicken/Beef or 2 for Seafood/Vegan.");
            String stringMeals = bufferedReader.readLine();

            System.out.println("Please choose a beverage." + '\n' + "Enter 1 for Non-Alcoholic or 2 for Alcoholic.");
            String stringBeverages = bufferedReader.readLine();

            System.out.println("Please choose a form of entertainment." + '\n' + "Enter 1 for Live Band or 2 for DJ.");
            String stringEntertainment = bufferedReader.readLine();

            System.out.println("Please choose a discount." + '\n' + "Enter 1 for Winter Months or 2 for Referral");
            String stringDiscount = bufferedReader.readLine();


            Event plan = new Event(Integer.parseInt(stringGuests), Integer.parseInt(stringMeals), Integer.parseInt(stringBeverages), Integer.parseInt(stringEntertainment), Integer.parseInt(stringDiscount));

            plan.billTotal();
            plan.pickMeal();
            plan.pickBeverage();
            plan.pickEntertainment();
            plan.pickDiscount();

            System.out.println('\n' + "Total expected Number of Guests" + plan.getGuests() + '\n' + "Your event choices:" + '\n' + "Meal: " + plan.getMealOption() + '\n' + "Beverage: " + plan.getBeverageOption() + '\n' + "Entertainment: " + plan.getEntertainmentOption() + '\n' + "Discount: " + plan.getDiscount());
            System.out.println("The total selected cost of your event is  " + "$" + plan.getCost() + ".00");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
