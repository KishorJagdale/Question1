

import java.util.Scanner;

public class SkyScraperMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the total no of floors in the building");
        int totalFloors = sc.nextInt();

        int[] floorSizeArr = new int[totalFloors];
        for (int floorSize = 0; floorSize < totalFloors; floorSize++) {

            System.out.println("enter the floor size given on day : " + (floorSize + 1));
            floorSizeArr[floorSize] = sc.nextInt();

        }

        System.out.println("\nThe order of construction is as follows\n");

        SkyScraper skyScraper = new SkyScraper();
        skyScraper.build(floorSizeArr);
    }
}