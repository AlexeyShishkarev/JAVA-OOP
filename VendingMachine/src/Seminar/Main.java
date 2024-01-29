package Seminar;

import Seminar.product.Bottle;
import Seminar.product.Product;
import Seminar.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();


        Product product1 = new Product("Твикс", 70.0);
        Bottle product2 = new Bottle("Кока кола", 100.0, 0.5);
        Product product3 = new Product("Баунти", 130.0);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);


          System.out.println(vendingMachine.getProductsList());


    }
}