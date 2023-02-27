import java.util.ArrayList;
import java.util.Scanner;


public class Notebook {
    private String brand;
    private String model;
    private int ramSizeGB;
    private double screenSize;
    private double price;
    
    public Notebook(String brand, String model, int ramSizeGB, double screenSize, double price) {
        this.brand = brand;
        this.model = model;
        this.ramSizeGB = ramSizeGB;
        this.screenSize = screenSize;
        this.price = price;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getRamSizeGB() {
        return ramSizeGB;
    }
    
    public double getScreenSize() {
        return screenSize;
    }
    
    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Apple", "MacBook Pro", 16, 13.3, 1999.99));
        notebooks.add(new Notebook("Dell", "XPS 13", 8, 13.4, 1299.99));
        notebooks.add(new Notebook("HP", "Spectre x360", 16, 14.0, 1499.99));
        notebooks.add(new Notebook("Lenovo", "ThinkPad X1 Carbon", 16, 14.0, 1799.99));
        notebooks.add(new Notebook("ASUS", "ZenBook UX425", 8, 14.0, 999.99));
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minimum RAM size (in GB): ");
        int minRamSize = scanner.nextInt();
        
        for (Notebook notebook : notebooks) {
            if (notebook.getRamSizeGB() >= minRamSize) {
                System.out.println("Brand: " + notebook.getBrand() + " | Model: " + notebook.getModel() 
                    + " | RAM size: " + notebook.getRamSizeGB() + " GB | Screen size: " + notebook.getScreenSize()
                    + " inches | Price: $" + notebook.getPrice());
            }
        }
    }
}