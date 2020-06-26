package restaurant;

import java.util.ArrayList;
import java.util.Date;
import restaurant.MenuItem;

public class Menu {
    private ArrayList<MenuItem> menus;

    public Menu(ArrayList<MenuItem> menus) {
        this.menus = menus;
    }

    public ArrayList<MenuItem> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<MenuItem> menus) {
        this.menus = menus;
    }

    public void addMenu(MenuItem aMenuItem){
        this.menus.add(aMenuItem);
    }

    public MenuItem createMenuItem(String name, double price, String description, String category){
        return new MenuItem(name, price, description, category);
    }
}

