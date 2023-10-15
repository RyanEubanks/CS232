package PP4;
import java.util.Scanner;
import java.util.ArrayList;

public class TestApartments {
    
    public static void main(String[] args) {
        // Declare variables
        Scanner in = new Scanner(System.in);
        int minBedrooms;
        int minBathrooms;
        ArrayList<Apartments> apart = new ArrayList<>();
        

        // Create objects
        Apartments apartment1 = new Apartments(110, 3, 2);
        Apartments apartment2 = new Apartments(111, 1, 2);
        Apartments apartment3 = new Apartments(112, 4, 3);
        Apartments apartment4 = new Apartments(113, 5, 3);
        Apartments apartment5 = new Apartments(114, 2, 1);

        // Put objects in arraylist
        apart.add(apartment1);
        apart.add(apartment2);
        apart.add(apartment3);
        apart.add(apartment4);
        apart.add(apartment5);


        // Prompt User
        System.out.println("Enter how many bedrooms you want: ");
        minBedrooms = in.nextInt();

        System.out.println("Enter how many bathrooms y3ou want: ");
        minBathrooms = in.nextInt();

        for(int i = 0; i <= apart.size() - 1; i++) {
            if(minBedrooms <= i) {
                for(int k = 0; k <= apart.size(); k++) {
                    if(minBathrooms <= i) {
                        System.out.println(apart.get(i).toString());
                    }
                }

            }
        }


        /* 
        switch(minBedrooms) {
            case 5:
                System.out.println(apartment4);
                break;
            case 4:
                System.out.println(apartment4 + "\n");
                System.out.println(apartment3);
                break;
            case 3:
                switch(minBathrooms) {
                    case 2:
                        System.out.println(apartment4);
                        System.out.println(apartment3 + "\n");
                        break;
                    case 3:
                        System.out.println(apartment4);
                        System.out.println(apartment3);
                        System.out.println(apartment1);

                }
        */
            


        }


    }

