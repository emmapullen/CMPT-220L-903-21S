package base;

public class Main extends Customer {
    /**
     * In our Assignment here we're running a little lemonade stand and we also sell pretzels. We need to keep track of
     * our inventory as well as the money that we're making throughout the day. I have code in the wet code section that
     * keeps track of all of this poorly. Come up with a better way to manage our system. There's not just one way to do
     * this so get creative and most importantly remember to stay DRY!
     * <p>
     * We're gonna look at the first hour where we have 15 customers!
     * <p>
     * We're responsible for keeping track of the number of pretzels and lemonades sold as well as the cash on hand and
     * in the tip jar! To keep things easy I won't make you make change! At the end of the day tips are split among the
     * employees! That means DON'T add it to the cash at the end of the day or during a transaction
     * <p>
     * At the end we're going to print out our inventory left and how much we made in case for the day! Print out the
     * tips too!
     * <p>
     * Remember to use functions, variables, and whatever else would make this easier to maintain!
     * <p>
     * Pretzels are $2 for 1
     * Lemonade is $8 for 1
     */
    static int lemonades_available = 43;
    static int pretzels_available = 60;
    static double cash = 1500.0;
    static double tips = 0.0;
    static double profit = 0.0;


    public static void main(String[] args) {
        //	Replace this with your dry inventory function!

        Customer cust1 = new Customer(4, 1, 4);
        Customer cust2 = new Customer(2, 3, 0);
        Customer cust3 = new Customer(3, 0, 0);
        Customer cust4 = new Customer(1, 2, 0);
        Customer cust5 = new Customer(0, 6, 10);
        Customer cust6 = new Customer(0, 4, 5);
        Customer cust7 = new Customer(2, 0, 0);
        Customer cust8 = new Customer(10, 8, 10);
        Customer cust9 = new Customer(6, 0, 0);
        Customer cust10 = new Customer(0, 1, 0);
        Customer cust11 = new Customer(1, 0, 0);
        Customer cust12 = new Customer(0, 7, 4);
        Customer cust13 = new Customer(2, 0, 0);
        Customer cust14 = new Customer(6, 3, 0);
        Customer cust15 = new Customer(9, 2, 3);

        Customer[] allCustomers = new Customer[15];
        allCustomers[0] = cust1;
        allCustomers[1] = cust2;
        allCustomers[2] = cust3;
        allCustomers[3] = cust4;
        allCustomers[4] = cust5;
        allCustomers[5] = cust6;
        allCustomers[6] = cust7;
        allCustomers[7] = cust8;
        allCustomers[8] = cust9;
        allCustomers[9] = cust10;
        allCustomers[10] = cust11;
        allCustomers[11] = cust12;
        allCustomers[12] = cust13;
        allCustomers[13] = cust14;
        allCustomers[14] = cust15;



        dry_inventory(allCustomers);
    }

    static void dry_inventory(Customer[] customers) {
        double lemonade_val = 8.00;
        double pretzels_val = 2.00;
        Customer tempCust = new Customer();

        for (int i = 0; i < customers.length; i++) {

            tempCust = customers[i];
            //System.out.print(tempCust.cPretzel + "\n");
            pretzels_available = pretzels_available - tempCust.cPretzel;
            lemonades_available = lemonades_available - tempCust.cLemonade;
            tips = tips + tempCust.cTip;
            profit = (tempCust.cLemonade * lemonade_val) + (tempCust.cPretzel * pretzels_val);
            cash = cash + profit;


        }
        System.out.println("Results for the hour!");
        System.out.print("Pretzels available: " + pretzels_available + "\n");
        System.out.print("Lemonades available: " + lemonades_available + "\n");
        System.out.print("Tips: $" + tips + "\n");
        System.out.print("Cash: $" + cash + "\n");

    }
}




