package com.liyuhang.ThinkingInJava.Generic;

import com.liyuhang.ThinkingInJava.Generic.Common.Generator;
import com.liyuhang.ThinkingInJava.Generic.Common.Generators;

import java.util.ArrayList;
import java.util.Random;

class Product{
    private final int id;
    private String description;
    private double price;

    public Product(int IDnumber, String descr, double priceIn) {
        id = IDnumber;
        description = descr;
        price = priceIn;
        System.out.println("toString");
    }

    @Override
    public String toString() {
        return id + ": " + description + ", price: $" +price ;
    }

    public void priceChange(double change) {
        price += change;
    }

    public static Generator<Product> generator = new Generator<Product>() {
        private Random random = new Random(47);
        @Override
        public Product next() {
            return new Product(random.nextInt(1000), "test",
                    Math.round(random.nextDouble()*1000.0) + 0.99);
        }
    };
}

/**
 * 货架上货
 */
class Shelf extends ArrayList<Product> {
    public Shelf (int nProduct){
        Generators.fill(this, Product.generator, nProduct);
    }
}

class Aisle extends ArrayList<Shelf>{
    public Aisle(int nShelves, int nProducts) {
        for (int i = 0; i < nShelves; i++){
            add(new Shelf(nProducts));
        }
    }
}

class  CheckoutStand {}
class Office {}

public class Store extends ArrayList<Aisle>{

}
