import java.util.ArrayList;
import java.util.Scanner;

abstract class Plant {
    private String name;
    private String growthStage;
    private int waterIntervalDays;

    public Plant(String name, String growthStage, int waterIntervalDays) {
        this.name = name;
        this.growthStage = growthStage;
        this.waterIntervalDays = waterIntervalDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrowthStage() {
        return growthStage;
    }

    public void setGrowthStage(String growthStage) {
        this.growthStage = growthStage;
    }

    public int getWaterIntervalDays() {
        return waterIntervalDays;
    }

    public void setWaterIntervalDays(int waterIntervalDays) {
        this.waterIntervalDays = waterIntervalDays;
    }

    public abstract String getDetails();

    public String getReminder() {
        return "Water the " + name + " every " + waterIntervalDays + " days.";
    }
}

class FloweringPlant extends Plant {
    private String flowerColor;

    public FloweringPlant(String name, String growthStage, int waterIntervalDays, String flowerColor) {
        super(name, growthStage, waterIntervalDays);
        this.flowerColor = flowerColor;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    @Override
    public String getDetails() {
        return "Flowering Plant:  " + getName() + ", Stage:  " + getGrowthStage() +
               ", Water Interval:  " + getWaterIntervalDays() + " days, Flower Color:  " + flowerColor;
    }
}

class VegetablePlant extends Plant {
    private String harvestSeason;

    public VegetablePlant(String name, String growthStage, int waterIntervalDays, String harvestSeason) {
        super(name, growthStage, waterIntervalDays);
        this.harvestSeason = harvestSeason;
    }

    public String getHarvestSeason() {
        return harvestSeason;
    }

    public void setHarvestSeason(String harvestSeason) {
        this.harvestSeason = harvestSeason;
    }

    @Override
    public String getDetails() {
        return "Vegetable Plant: " + getName() + ", Stage: " + getGrowthStage() +
               ", Water Interval: " + getWaterIntervalDays() + " days, Harvest Season: " + harvestSeason;
    }
}


public class SproutScout {
    private static ArrayList<Plant> plants = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nSprout Scout: Community Plant Tracker");
            System.out.println("1. Add a Plant");
            System.out.println("2. View All Plants");
            System.out.println("3. Get Watering Reminders");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addPlant();
                    break;
                case 2:
                    viewPlants();
                    break;
                case 3:
                    showReminders();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addPlant() {
        System.out.println("Choose Plant Type: 1. Flowering Plant  2. Vegetable Plant");
        int type = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Plant Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Growth Stage: ");
        String stage = scanner.nextLine();
        System.out.print("Enter Water Interval (days): ");
        int waterInterval = scanner.nextInt();
        scanner.nextLine(); 

        if (type == 1) {
            System.out.print("Enter Flower Color: ");
            String color = scanner.nextLine();
            plants.add(new FloweringPlant(name, stage, waterInterval, color));
        } else if (type == 2) {
            System.out.print("Enter Harvest Season: ");
            String season = scanner.nextLine();
            plants.add(new VegetablePlant(name, stage, waterInterval, season));
        } else {
            System.out.println("Invalid plant type.");
        }
    }

    private static void viewPlants() {
        if (plants.isEmpty()) {
            System.out.println("No plants found.");
            return;
        }

        System.out.println("\nPlant Details:");
        for (Plant plant : plants) {
            System.out.println(plant.getDetails());
        }
    }

    private static void showReminders() {
        if (plants.isEmpty()) {
            System.out.println("No plants found.");
            return;
        }

        System.out.println("\nWatering Reminders:");
        for (Plant plant : plants) {
            System.out.println(plant.getReminder());
        }
    }
}
