public class Driver {
    public static void main(String[] args){
        WaitressInvoker waitress = new WaitressInvoker();
        CustomerClient customer = new CustomerClient(waitress);
        customer.createOrder();
        waitress.orderUp();

    }
}