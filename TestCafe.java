import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args){
        CafeUtil cafeMethods = new CafeUtil();
        int result = cafeMethods.getStreakGoal();
        double[] r ={12.3, 1.0, 4.4};
        double orderTotalRsult = cafeMethods.getOrderTotal(r);
        System.out.println(result);
        System.out.println(orderTotalRsult);

        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("drip coffee");
        menuItems.add("cappuccino");
        menuItems.add("mocha");

        cafeMethods.displayMenu(menuItems);
        ArrayList<String> customers = new ArrayList<String>();
        cafeMethods.addCustomer(customers);
        cafeMethods.addCustomer(customers);
    }
}
