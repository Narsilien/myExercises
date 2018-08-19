public class HealthyBurger extends Hamburger {

    private boolean cucumber;
    private boolean cabagge;
    private int cabageCost = 5;
    private int cucumberCost = 3;
    private int countOfAdditionals = 0;

    public HealthyBurger(String name, String breadRollType, boolean meat) {
        super(name, breadRollType, meat);
        super.getBaseCost();
    }
    public boolean isCucumber() {
        return cucumber;
    }
    public boolean isCabagge() {
        return cabagge;
    }
    public int getCabageCost() {
        return cabageCost;
    }
    public int getCucumberCost() {
        return cucumberCost;
    }
    public int getCountOfAdditionals() {
        return countOfAdditionals;
    }
    public void setCountOfAdditionals(int countOfAdditionals) {
        this.countOfAdditionals = countOfAdditionals;
    }

    @Override
    public int breadCost() {

        switch (getBreadRollType().toLowerCase()) {
            case "brown rye bread roll" :
                return 15;
            default:
                return 15;
        }
    }

    @Override
    public double AdditionalsPriceHamburger() {
        System.out.println("------------------------------------------");
        while (getCountOfAdditionals() <= 1) {
            if (isCarrot() && getCountOfAdditionals() < 2) {
                setCostAdditionals(getCostAdditionals() + getCarroteCost());
                System.out.println("Carrote in Healthyburger for a cost of: " + getCarroteCost());
                setCountOfAdditionals(getCountOfAdditionals() + 1);
            }
            if (isLettuce() && getCountOfAdditionals() < 2) {
                setCostAdditionals(getCostAdditionals() + getLettuceCost());
                System.out.println("Lettuce in Healthyburger for a cost of: " + getLettuceCost());
                setCountOfAdditionals(getCountOfAdditionals() + 1);
            }
            if (isSauce() && getCountOfAdditionals() < 2) {
                setCostAdditionals(getCostAdditionals() + getSauceCost());
                System.out.println("Sauce in Healthyburger for a cost of: " + getSauceCost());
                setCountOfAdditionals(getCountOfAdditionals() + 1);
            }
            if (isTomato() && getCountOfAdditionals() < 2) {
                setCostAdditionals(getCostAdditionals() + getTomatoCost());
                System.out.println("Tomato in Healthyburger for a cost of: " + getLettuceCost());
                setCountOfAdditionals(getCountOfAdditionals() + 1);
            }
            if (isCabagge() && getCountOfAdditionals() < 2) {
                setCostAdditionals(getCostAdditionals() + getCabageCost());
                System.out.println("Cabagge in Healthyburger for a cost of: " + getCabageCost());
                setCountOfAdditionals(getCountOfAdditionals() + 1);
            }
            if (isCucumber() && getCountOfAdditionals() < 2) {
                setCostAdditionals(getCostAdditionals() + getCucumberCost());
                System.out.println("Cucumber in Healthyburger for a cost of: " + getCucumberCost());
                setCountOfAdditionals(getCountOfAdditionals() + 1);
            }
        }
        return getCostAdditionals();
    }

    @Override
    public double totalPriceHamburger() {
        if(isMeat()) {
            setPrice(getPrice() + getBaseCost() + AdditionalsPriceHamburger());

        }
        System.out.println("Base price for Healthyburger is: " + getBaseCost());
        System.out.println("Price for additional stuff: " + getCostAdditionals() );
        System.out.println("Total price for your Healthyburger is: " + getPrice() );
        return getPrice();
    }

}
