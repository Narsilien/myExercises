public class Hamburger {

    private String name;
    private boolean meat;

    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean sauce;

    private double price;

    private String breadRollType;

    private final int meatCost = 15;
    private final int lettuceCost = 6;
    private final int tomatoCost = 2;
    private final int sauceCost = 4;
    private final int carroteCost = 5;
    private int baseCost;
    private double costAdditionals;


    public Hamburger(String name, String breadRollType, boolean meat) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;

        baseCost = meatCost + breadCost();
    }

    public String getName() {
        return name;
    }


    public boolean isMeat() {
        return meat;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isSauce() {
        return sauce;
    }

    public double getPrice() {
        return price;
    }

    public int getMeatCost() {
        return meatCost;
    }

    public int getLettuceCost() {
        return lettuceCost;
    }

    public int getTomatoCost() {
        return tomatoCost;
    }

    public int getCarroteCost() {
        return carroteCost;
    }

    public int getSauceCost() {
        return sauceCost;
    }

    public int getBaseCost() {
        return baseCost;
    }

    public double getCostAdditionals() {
        return costAdditionals;
    }

    public void setCostAdditionals(double costAdditionals) {
        this.costAdditionals = costAdditionals;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;

    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;

    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;

    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;

    }


    public int breadCost() {

        switch (getBreadRollType().toLowerCase()) {
            case "white bread roll" :
                return 5;
            case "cornbread" :
                return 7;
            case "crispy bread" :
                return 10;
            default:
                return 5;
        }
    }

    public double AdditionalsPriceHamburger() {
        System.out.println("------------------------------------------");
        if (isCarrot()) {
            setCostAdditionals(getCostAdditionals() + getCarroteCost());
            System.out.println("Carrote in burger for a cost of: " + getCarroteCost());
        }

        if (isLettuce()) {
            setCostAdditionals(getCostAdditionals() + getLettuceCost());
            System.out.println("Lettuce in burger for a cost of: " + getLettuceCost());
        }

        if (isSauce()) {
            setCostAdditionals(getCostAdditionals() + getSauceCost());
            System.out.println("Sauce in burger for a cost of: " + getSauceCost());
        }

        if (isTomato()) {
            setCostAdditionals(getCostAdditionals() + getTomatoCost());
            System.out.println("Tomato in burger for a cost of: " + getLettuceCost());
        }
        return getCostAdditionals();

    }


    public double totalPriceHamburger() {
       if(isMeat()) {
           setPrice(getPrice() + getBaseCost() + AdditionalsPriceHamburger());

       }

        System.out.println("Base price for burger is: " + getBaseCost());
        System.out.println("Price for additional stuff: " + getCostAdditionals() );
        System.out.println("Total price for your burger is: " + getPrice() );
        return getPrice();
    }














}
