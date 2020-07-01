package restaurant;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private double price;
    private String name;
    private String description;
    private String category = null;
    private boolean isNew = true;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.setCategory(category);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isNew() {
        return isNew;
    }


    public void setCategory(String category) {
        String[] allowedCategories = {"appetizer", "main course", "dessert"};

        if (Arrays.stream(allowedCategories).anyMatch(category.toLowerCase()::equals)) {
            this.category = category;
        } else {
            System.out.println("Invalid category entered. Please submit a valid category");
        }

    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.getPrice(), getPrice()) == 0 &&
                isNew() == menuItem.isNew() &&
                getName().equals(menuItem.getName()) &&
                getDescription().equals(menuItem.getDescription()) &&
                getCategory().equals(menuItem.getCategory());
    }

}