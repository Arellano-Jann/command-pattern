public class Burger implements OrderSlip {
    CookReceiver cook = new CookReceiver();
    public void orderUp(){ 
        // actions needed to prep the meal
        // has reference to cook somehow. this is because it does cook.makeBurger()

        System.out.println("in Burger orderUp");
        cook.makeBurger();
    }
}
