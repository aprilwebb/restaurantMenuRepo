package com.company;

import restaurant.MenuItem;
import restaurant.Menu;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Menu myMenu = new Menu();
        printElements(myMenu);

        System.out.println(Menu.getTime());

        System.out.println(new Menu().getMenus());

        MenuItem superBurger = new MenuItem(
                "Cheese Burger",
                17.99,
                "the best burger of your life",
                "main course");

        myMenu.addMenuItem(superBurger);
        printElements(myMenu);

        superBurger.setPrice(18.99);

        MenuItem chocolateCheeseCake = new MenuItem(
                "Chocolate Cheese Cake",
                10.99,
                "A great dessert",
                "dessert");

        myMenu.addMenuItem(chocolateCheeseCake);
        printElements(myMenu);

        MenuItem invalidItem = new MenuItem(
                "Test Item",
                10.99,
                "A great test",
                "Dessert");

        myMenu.addMenuItem(invalidItem);
        printElements(myMenu);

//        myMenu.removeMenuItem(superBurger);
        printElements(myMenu);

        MenuItem pizza = new MenuItem("Cheese Pizza", 12.00, "Yummy", "Main Course");

        System.out.println(pizza.isNew());

        System.out.println("Check date modified:");
        System.out.println(myMenu.getDateModified());
        myMenu.addMenuItem(pizza);
        System.out.println(myMenu.getDateModified());

        System.out.println(pizza);
        System.out.println(myMenu);
    }

    public static void printElements(Menu aMenu){
        for(MenuItem d: aMenu.getMenus()) {
            System.out.println(d);
        }
    }
}