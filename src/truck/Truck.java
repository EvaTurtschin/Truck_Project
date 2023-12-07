package truck;

import java.util.Scanner;

public class Truck {
    private String model;
    private String manufacturer;
    private int year;
    private String colour;
    private int maxWeight;
    private int currentWeight = 0;
    private int maxFuel;
    private int currentFuel =0;
    private String driver;

    public Truck(String model, String manufacturer, int year, String colour,
                 int maxWeight, int maxFuel, String driver)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.colour = colour;
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
        this.driver = driver;
    }
    public String getModel ()
    {return model;}
    public String getManufacturer ()
    {return manufacturer;}
    public int getYear()
    {return year;}
    public String getColour ()
    {return colour;}
    public int getMaxWeight()
    {return maxWeight;}
    public int getMaxFuel()
    {return maxFuel;}
    public String getDriver()
    {return driver;}

    public void setOwner(String driver) {
        this.driver = driver;
    }

    public String toString() {
        return "Model: "+getModel()+", "+getManufacturer()+", "+getYear()+", "+getColour()+
                "\nMaxWeight: "+getMaxWeight()+", MaxFluel: "+getMaxFuel()+
                "\nDriver: "+getDriver();
    }

    public void load (int loadWeight)
    {
        if (loadWeight>getRemainingCapacity())
        { System.out.println("Check your load information. Weight exceeds permissible value.");
        printRemainingCapacity();
        return;}
        if (loadWeight==0)
        {System.out.println("Truck must be loaded first.");
        return;}
        else
        {   currentWeight += loadWeight;
            System.out.println("Loading: " + loadWeight);
            printRemainingCapacity();}
    }
    public void unload (int unloadWeight)
    {
        if (unloadWeight>currentWeight)
        {System.out.println("Check your load information. You are trying to unload weight that exceeds current weight.");
            return;}
        else
        {System.out.println("Unloading: " + unloadWeight);
            currentWeight = currentWeight - unloadWeight;
            printRemainingCargo();}
    }
    public void move ()
    {
        if (currentWeight==0)
        {System.out.println("Check your load information. Truck must be loaded first.");
            return;}
        else if (currentFuel<(maxFuel/10))
        {System.out.println("Check your fluel information. Fluel levell is below the permissible value.");
            return;}
        else
            System.out.println("We are on a road!");
    }
    public void stop ()
    {  Scanner needToStop = new Scanner(System.in);
       System.out.print("Mr. " + driver + ", do you want to make a stop? Y or N : ");
       String answer = needToStop.nextLine();
      char symbol = answer.charAt(0);
        if (symbol == 'Y' | symbol == 'y')
            System.out.println("Let's make a stop!");
        else if (symbol == 'N' | symbol == 'n')
            System.out.println("Just keep going!");
        else
            System.out.println("You've entered the wrong answer.");}

    public void setCurrentFuel (int currentFuel)
    {
        if (currentFuel>=maxFuel)
        { this.currentFuel = maxFuel;
            System.out.println("You can start your trip.");
        return;}
        if (currentFuel<(maxFuel/10))
        {System.out.println("Truck needs refueling!");
        return;}
        else System.out.println("You can start your trip.");
    }

    private void printRemainingCapacity()
    {
        if (currentWeight < maxWeight)
            System.out.println("Remaining capacity = " + (maxWeight-currentWeight));
        else
            System.out.println("You have reached the maximum weight.");
    }
    private int getRemainingCapacity ()
    {
        return maxWeight - currentWeight;
    }

    private void printRemainingCargo ()
    {
        System.out.println("Remaining Cargo weight = " + currentWeight);
    }
}

