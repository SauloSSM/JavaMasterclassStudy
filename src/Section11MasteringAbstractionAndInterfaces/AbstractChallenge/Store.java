package Section11MasteringAbstractionAndInterfaces.AbstractChallenge;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product) {}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Oil Painting", 1350,
                "Impressionistic work by SSSM painted in 2026"));

        storeProducts.add(new ArtObject("Sculpture", 2000,
                "Bronze work by LMB, produced in 2015"));

        storeProducts.add(new Furniture("Desk", 200,
                "Mahogany Desk"));

        storeProducts.add(new Furniture("Lamp", 500,
                "Tiffany Lamp with Hummingbirds"));

        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 4);
        addItemToOrder(order2, 2, 3);
        addItemToOrder(order2, 0, 1);
        printOrder(order2);
    }

    public static void listProducts() {

        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {

        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {

        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem((item.qty()));
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
