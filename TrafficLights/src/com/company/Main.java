package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] primaryColors = scan.nextLine().split(" ");
        int countChanges = Integer.parseInt(scan.nextLine());

        List<TrafficLite> trafficLites = new ArrayList<>();

        for (String color : primaryColors) {
            ColorTrafficLite currentColor = ColorTrafficLite.valueOf(color);
            TrafficLite currentTrafficLite = new TrafficLite(currentColor);
            trafficLites.add(currentTrafficLite);
        }

        for (int i = 0; i < countChanges; i++) {
            for (TrafficLite trafficLite : trafficLites) {
                trafficLite.changeColor();
                System.out.print(trafficLite.getCurrentColor() + " ");
            }
            System.out.println();
        }
    }
}
