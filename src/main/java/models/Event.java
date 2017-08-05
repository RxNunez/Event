package models;

import java.util.*;

public class Event {
    private Integer custGuests;
    private Integer custMeals;
    private Integer custBeverages;
    private Integer custEntertainment;
    private Integer cost =0;
    private Integer custDiscount;
    private String mealOption = "";
    private String beverageOption = "";
    private String entertainmentOption = "";
    private String discountOption = "";

    public Event(Integer guests, Integer meals, Integer beverages, Integer entertainment, Integer discount) {
        custGuests = guests;
        custMeals = meals;
        custBeverages = beverages;
        custEntertainment = entertainment;
        custDiscount = discount;
    }

    public Integer getGuests() {
        return custGuests;
    }

    public String getMealOption() {
        return mealOption;
    }

    public String getBeverageOption() {
        return beverageOption;
    }

    public String getEntertainmentOption() {
        return entertainmentOption;
    }

    public Integer getCost() {
        return cost;
    }

    public Integer getDiscount() {
        return custDiscount;
    }

    public Integer billTotal() {
        if (custMeals == 1) {
            cost += 15 * custGuests;
        } else if (custMeals == 2) {
            cost += 25 * custGuests;
        } else {
            cost += 20 * custGuests;
        }

        if (custBeverages == 1) {
            cost += 5 * custGuests;
        } else if (custBeverages == 2) {
            cost += 15 * custGuests;
        } else {
            cost += 10 * custGuests;
        }

        if (custEntertainment == 1) {
            cost += 1500;
        } else if (custEntertainment == 2) {
            cost += 500;
        } else {
            cost += 1000;
        }
        if (custDiscount == 1) {
            cost -= 100;
        } else if (custDiscount == 2) {
            cost -= 200;
        } else {
            cost += 0;
        }
        return cost;
    }

    public String pickMeal() {
        if (custMeals == 1) {
            mealOption = "Chicken/Beef";
        } else if (custMeals == 2) {
            mealOption = "Seafood/Vegan";
        } else {
            mealOption = "Your choice is unavailable. Chicken and vegetables are default.";
        }
        return mealOption;
    }

    public String pickBeverage() {
        if (custBeverages == 1) {
            beverageOption = "Non-Alcoholic";
        } else if (custBeverages == 2) {
            beverageOption = "Alcoholic";
        } else {
            beverageOption = "Your choice is unavailable. Non-Alcoholic and sparkling are default.";
        }
        return beverageOption;
    }

    public String pickEntertainment() {
        if (custEntertainment == 1) {
            entertainmentOption = "Live Band";
        } else if (custEntertainment == 2) {
            entertainmentOption = "DJ";
        } else {
            entertainmentOption = "Your choice is unavailable. BoBo the Clown and water balloons are default.";
        }
        return entertainmentOption;
    }

    public String pickDiscount() {
        if (custDiscount == 1) {
            discountOption = "Winter Months";
        } else if (custDiscount == 2) {
            discountOption = "Referral";
        } else {
            discountOption = "Your choice is unavailable. No discount will be awarded.";
        }
        return discountOption;
    }
}
