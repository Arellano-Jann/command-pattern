public class CustomerClient {
    WaitressInvoker waitress;
    public void createOrder(){ // customer creates an orderslip and tells the cook to make it
        // contains the things that the orderSlip should have like burgers and such
        waitress.takeOrder(new Burger());
        waitress.takeOrder(new Shake());
    }
}
