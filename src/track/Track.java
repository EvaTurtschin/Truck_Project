package track;

public class Track {
    private String model;
    private String manufacturer;
    private int year;
    private String colour;
    private int maxWeight;
    private int currentWeight = 0;
    private int maxFuel;
    private int currentFuel =0;
    private String owner;

    public Track (String model, String manufacturer, int year, String colour,
                  int maxWeight, int maxFuel, String owner)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.colour = colour;
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
        this.owner = owner;
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
    public String getOwner()
    {return "Owner: " + owner;}

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String toString() {
        return "Model: "+getModel()+", "+getManufacturer()+", "+getYear()+", "+getColour()+
                "\nMaxWeight: "+getMaxWeight()+", Fluel: "+getMaxFuel();
    }

    public void load (int loadWeight)
    {
        if (loadWeight>maxWeight)
            System.out.println("Check your load information. Weight exceeds permissible value.");
        else if (loadWeight<=currentWeight)
            System.out.println("Truck must be loaded first.");
        else
            System.out.println("Loading: " + loadWeight);
    }
    public void unload (int unloadWeight)
    {
        if (unloadWeight>maxWeight)
            System.out.println("Check your load information. Weight exceeds permissible value.");
        else
            System.out.println("Unloading: " + unloadWeight);
    }
    public void move (int currentFuel, int loadWeight)
    {
        if ((loadWeight ==0 && currentWeight==0) || loadWeight>maxWeight)
            System.out.println("Check your load information. Weight doesn't correspond to the permissible value.");
        else if (currentFuel<(maxFuel/10))
            System.out.println("Check your fluel information. Fluel levell is below the permissible value.");
        else
            System.out.println("You can start your trip!");
    }
    public void stop ()
    {

    }
    public void fillFuel (int currentFuel)
    {
        if (currentFuel<(maxFuel/10))
            System.out.println("Truck needs refueling!");
        else System.out.println("You can start your trip.");
    }

    private void printRemainingCapacity()
    {
        if (currentWeight < maxWeight)
            System.out.println("Remaining capacity = " + (maxWeight-currentWeight));
        else
            System.out.println("You have reached the maximum weight.");
    }


}

