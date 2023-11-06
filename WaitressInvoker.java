import java.util.ArrayList;

public class WaitressInvoker {
    // invoke orderUp to have meal prepped
    OrderSlip order;
    ArrayList<OrderSlip> orders = new ArrayList<OrderSlip>(); // array of orders that the waitress can call orderUp on
    public void takeOrder(OrderSlip order){ // param with different orderslips from different customers
        System.out.println("in WaitressInvoker");

    }
}
