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
}
