public class BurgerShopMain {

    public static void main(String[] args) {
        Hamburger myMC = new Hamburger("MC","White bread roll",true);
        HealthyBurger myHipster = new HealthyBurger("Flacka","Brown rye bread roll",true);
        DeluxeBurger myBigRoyal = new DeluxeBurger("Royal","White bread roll",true);

        myMC.setCarrot(true);
        myMC.setLettuce(true);
        myMC.totalPriceHamburger();

        myHipster.setCarrot(true);
        myHipster.setLettuce(true);
        myHipster.setSauce(true);
        myHipster.totalPriceHamburger();

        myBigRoyal.setCarrot(true);
        myBigRoyal.totalPriceHamburger();

    }
}
