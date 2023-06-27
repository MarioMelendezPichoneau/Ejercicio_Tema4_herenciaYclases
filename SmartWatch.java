package Ejercicio_Tema4_herenciaYclases;

public class SmartWatch extends SmartDevice {
	 private int batteryLife;
	 
	 public SmartWatch() {
		// TODO Auto-generated constructor stub
		 super();
		 this.batteryLife = 0;
	}
	 
	 
	 public SmartWatch(String brand, String model, String color, int batteryLife) {
		 super(brand, model, color);
		 this.batteryLife = batteryLife;
	 }
	 
	 public int getBatteryLife() {
	        return batteryLife;
	    }
	 
	 @Override
	public void printDetails() {
		// TODO Auto-generated method stub
		super.printDetails();
		System.out.println("Battery Life: " + batteryLife + " hours");
	}
}
