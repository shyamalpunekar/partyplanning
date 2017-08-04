package models;

/**
 * Created by spunek on 8/4/17.
 */
public class Party {

    private int numberOfGuests;
    private String yumFood;
    private String yumBeverages;
    private String yoEntertainment;
    private int yumFoodCost;
    private int yumBeverageCost;
    private int yumEntertainmentCost;
    private int yumTotalCost;


    public Party(int guests, String food, String beverages, String entertainment) {
        this.numberOfGuests = guests;
        this.yumFood = food.toLowerCase();
        this.yumBeverages = beverages.toLowerCase();
        this.yoEntertainment = entertainment.toLowerCase();
    }
}
