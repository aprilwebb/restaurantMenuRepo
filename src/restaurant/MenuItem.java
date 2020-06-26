package restaurant;

import java.util.Arrays;
import java.util.Date;

public class MenuItem {
    private double price;
    private String name;
    private String description;
    private String category;
    private boolean isNew = true;
    private Date dateAdded;

    public MenuItem(String name, double price, String description, String category) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.setCategory(category);
        this.dateAdded = new Date();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        String[] allowedCategories = {"appetizer", "main course", "dessert"};

        if (Arrays.stream(allowedCategories).anyMatch(category.toLowerCase()::equals)){
            this.category = category;
        } else {
            System.out.println("Invalid category entered. Please submit a valid category.");
        }
    }

}
