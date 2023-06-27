package Ejercicio_Tema4_herenciaYclases;

public class SmartPhone extends SmartDevice {
	
	private String operatingSystem;
	
	public SmartPhone() {
		super();
		this.operatingSystem = "";
	}
	
	public SmartPhone(String brand, String model, String color, String operatingSystem) {
        super(brand, model, color);
        this.operatingSystem = operatingSystem;
    }
	
	public String getOperatingSystem() {
		return operatingSystem;
	}
	
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		super.printDetails();
		System.out.println("operatingSistem: " + operatingSystem);
	}
}
