package oop.Encapsulation.AirConditioningUnit;

public class Aircon {

    private int thermostat;
    private double temperature;
    private String power;
    private String type;
    private String brand;

    public int getThermostat(){
        return thermostat;
    }

    public void setThermostat(int thermostat){
        this.thermostat = thermostat;
    }

    public double getTemperature(){
        return temperature;
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
    }

    public String getPower(){
        return power;
    }

    public void setPower(String power){
        this.power = power;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void Aircon(){
        thermostat = 1;
        temperature = 16.0;
        power = "false";
        type = "true";
         brand = "AC Brand";
         System.out.println("Default Constructor");
    }

    public void Aircon(String brand, String type){
        this.brand = brand;
        this.type = type;
        thermostat = 1;
        temperature = 16.0;
        power = "false";
        System.out.println("Overloaded Constructor");
    }

    public void power(){
        if (power == "false"){
            power = "true";
        } else {
            power = "true";
        }
    }

    public void thermostatUp(){
        thermostat += 1;
    }

    public void thermostatDown(){
        thermostat -= 1;
    }

    public void temperatureUp(){
        thermostat += 0.5;
    }

    public void temperatureDown(){
        thermostat -= 0.5;
    }

    public void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Power status: " + power);
        System.out.println("Thermostat: " + thermostat);
        System.out.println("Temperature: " + temperature);

    }
}


