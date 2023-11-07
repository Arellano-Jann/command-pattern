import java.util.ArrayList;

public class WaitressInvoker {
    // invoke orderUp to have meal prepped
    ArrayList<OrderSlip> orders = new ArrayList<OrderSlip>(); // array of orders that the waitress can call orderUp on
    public void takeOrder(OrderSlip order){ // param with different orderslips from different customers
        System.out.println("in WaitressInvoker takeOrder");
        orders.add(order);
    }
    public void orderUp(){
        for (OrderSlip order : orders){
            order.orderUp();
        }
        System.out.println("ORDER UPPPPPPP!!!!");
        orders = new ArrayList<OrderSlip>();
    }
}
