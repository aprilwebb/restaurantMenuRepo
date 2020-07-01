package restaurant;

import java.util.ArrayList;
import java.util.Date;
import restaurant.MenuItem;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date dateModified;

    public static Date getTime() {
        return new Date();
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public Menu(ArrayList<MenuItem> aItems) {
        items = aItems;
        dateModified = new Date();
    }

    public Menu() {
        items = new ArrayList<MenuItem>();
        dateModified = new Date();
    }

    public ArrayList<MenuItem> getMenus() {
        return items;
    }

    public void setMenus(ArrayList<MenuItem> aItems) {
        items = aItems;
    }

    public void addMenuItem(MenuItem aMenuItem) {
        items.add(aMenuItem);
        setDateModified(new Date());
    }

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                ", dateModified=" + dateModified +
                '}';
    }

    public void removeMenuItem(String name){
        if(items.size() > 0){
            for(MenuItem item : items){
                if(item.getName().toLowerCase().equals(name.toLowerCase())){
                    items.remove(item);
                    setDateModified(new Date());
                    break;
                }
            }

        }
    }
}