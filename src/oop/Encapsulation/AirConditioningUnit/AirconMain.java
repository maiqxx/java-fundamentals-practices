package oop.Encapsulation.AirConditioningUnit;

import java.util.Scanner;

public class AirconMain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Aircon aircon = new Aircon();
        int input = scan.nextInt();

        if(input == 1){
            aircon.Aircon();
        }
        else if(input == 2){
            String brand = scan.next();
            String type = scan.next();
            aircon.Aircon(brand, type);
        }
        int m = scan.nextInt();
        for(int i = 0; i < m; i++){
            int op = scan.nextInt();

            if(op == 3){
                aircon.power();
            } else if(op == 4){
                aircon.thermostatUp();
            } else if(op == 5){
                aircon.thermostatDown();
            } else if(op == 6){
                aircon.thermostatUp();
            } else if(op == 7){
                aircon.thermostatDown();
            } else if(op == 8){
                aircon.getBrand();
            } else if(op == 9){
                aircon.getType();
            } else if(op == 10){
                aircon.getPower();
            } else if(op == 11){
                aircon.getThermostat();
            } else if(op == 12){
                aircon.getTemperature();
            } else if(op == 13){
                aircon.display();
            }
        }
    }
}
