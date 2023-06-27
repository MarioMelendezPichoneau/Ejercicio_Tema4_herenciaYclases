package Ejercicio_Tema4_herenciaYclases;

public class SmartDevice {
	
	protected String brand;
	protected String model;
	protected String color;
	
	public SmartDevice() {
		this.brand = "";
		this.model = "";
		this.color = "";
	}
	
	
	public SmartDevice(String brand, String model, String color) {
		
		this.brand = brand;
		this.model = model;
		this.color = color;
		
	}
	
	public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getColor() {
        return color;
    }
    
    public void printDetails() {
    	System.out.println("Brand: " + brand);
    	System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
	
	

}
