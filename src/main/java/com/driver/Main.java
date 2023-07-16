package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 2: create object of Product in Main function called p
        Product p = new Product();

        // Task 3: call the method product(int x, int y) using Product class object p
        int result1 = p.product(5, 3);
        System.out.println("Product of 5 and 3 is: " + result1);

        // Task 4: call the method product(int x, int y, int z) using Product class object p
        int result2 = p.product(2, 4, 6);
        System.out.println("Product of 2, 4, and 6 is: " + result2);

        // Task 5: call the method product(double x, double y) using Product class object p
        double result3 = p.product(2.5, 3.5);
        System.out.println("Product of 2.5 and 3.5 is: " + result3);
    }

    public static class Product {
        // Task 3: create a method product(int x, int y)
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: create an overloaded method product(int x, int y, int z)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: create an overloaded method product(double x, double y)
        public double product(double x, double y) {
            return x * y;
        }
    }
}
