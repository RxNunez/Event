package models;

class Event {
    private Integer custGuests;
    private Integer custMeals;
    private Integer custBeverages;
    private Integer custEntertainment;
    private Integer cost = 0;
    private Integer discount;
    private String mealoption = "";
    private String beverageoption = "";
    private String entertainmentoption = "";

    public Event(Integer guests, Integer meals, Integer beverages, Integer entertainment) {
        custGuests = guests;
        custMeals = meals;
        custBeverages = beverages;
        custEntertainment = entertainment;
    }
}
