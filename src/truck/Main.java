package truck;

public class Main {
    public static void main(String[] args) {

        Truck tr1 = new Truck("Atego 1224", "Mercedes-Benz",
                2008,"white",175, 120, "Smith" );
        Truck tr2 = new Truck ("Bug 1134", "Volvo", 2015,
                "red", 160,120, "Bond");
        Truck tr3 = new Truck ("SuperTrack 13", "Volvo", 2020,
                "black", 200, 120, "Buch");

        Truck [] trucks = {tr1, tr2, tr3};
        for (Truck truck : trucks)
        { System.out.println(truck);
            System.out.println();}

        for (Truck tr : trucks)
        {System.out.println("truck "+tr.getManufacturer()+", "+ tr.getModel()+": Driver: " + tr.getDriver());}
        System.out.println();

        tr1.load (50);
        tr1.load(125);
        System.out.println();
        tr1.load(10);
        System.out.println();


        tr1.setCurrentFuel(10);
        System.out.println();
        tr1.setCurrentFuel(120);
        System.out.println();

        tr1.move();
        System.out.println();

        tr1.stop();
        System.out.println();
        tr1.stop();
        System.out.println();

        tr1.unload(190);
        System.out.println();
        tr1.unload(90);
        System.out.println();

    }
}
