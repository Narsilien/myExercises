public class DeluxeBurger extends Hamburger {

    private boolean chips;
    private boolean drink;
    private int costOfChips = 6;
    private int costOfDrinks = 7;

    public DeluxeBurger(String name, String breadRollType, boolean meat) {
        super(name, breadRollType, meat);
        setChips(true);
        setDrink(true);
    }

    public boolean isChips() {
        return chips;
    }

    public boolean isDrink() {
        return drink;
    }

    public int getCostOfChips() {
        return costOfChips;
    }

    public int getCostOfDrinks() {
        return costOfDrinks;
    }

    public void setChips(boolean chips) {
        this.chips = chips;
    }

    public void setDrink(boolean drink) {
        this.drink = drink;
    }

    @Override
    public double AdditionalsPriceHamburger() {
        System.out.println("------------------------------------------");
        if (isDrink()) {
            setCostAdditionals(getCostAdditionals() + getCostOfDrinks());
            System.out.println("Drink with burger for a cost of: " + getCostOfDrinks());
        }

        if (isChips()) {
            setCostAdditionals(getCostAdditionals() + getCostOfChips());
            System.out.println("Chips with burger for a cost of: " + getCostOfChips());
        }
        return getCostAdditionals();

    }


}
