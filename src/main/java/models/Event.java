package models;

public class Event {
    private Integer custGuests;
    private Integer custMeals;
    private Integer custBeverages;
    private Integer custEntertainment;
    private Integer cost = 0;
    private Integer discount;
    private String mealOption = "";
    private String beverageOption = "";
    private String entertainmentOption = "";

    public Event(Integer guests, Integer meals, Integer beverages, Integer entertainment) {
        custGuests = guests;
        custMeals = meals;
        custBeverages = beverages;
        custEntertainment = entertainment;
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
            cost += 500;
        } else if (custEntertainment == 2) {
            cost += 1500;
        } else {
            cost += 1000;
        }

        return cost;
    }
}
