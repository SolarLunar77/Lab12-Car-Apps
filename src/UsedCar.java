
public class UsedCar extends Car {
	
	private double mileage;

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "UsedCar [mileage=" + mileage + ", getMake()=" + getMake() + ", getModel()=" + getModel()
				+ ", getYear()=" + getYear() + ", getPrice()=" + getPrice() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public double getMiles() {
		return mileage;
	}
	
	

	

}
