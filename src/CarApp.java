//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
import java.util.*;


public class CarApp {
	
	public static void main(String[] args) {
	String userInput;
	int carYear;
	double userNumber;
	int userScan;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("How many cars do you wish to enter? ");
	userScan = scan.nextInt();
	scan.nextLine();
		
	Car car1,car2,car3;
	UsedCar car4,car5,car6,car7;
	
	
	// Add this somewhere ----- List<Object>
	ArrayList<Car> listOfCars = new ArrayList<>();	
		
	listOfCars.add(car1 = new Car("Honda","Civic",2019,30000.90));
	listOfCars.add(car2 = new Car("Honda","Accord",2010,20000.77));
	listOfCars.add(car3 = new Car("Honda","Highlander",2016,35000.60));
	listOfCars.add(car4 = new UsedCar("Honda","Civic",2010,9000.00,10000.6));
	listOfCars.add(car5 = new UsedCar("Honda","Civic",2010,12000.80,5000.8));
	listOfCars.add(car6 = new UsedCar("Honda","Accord",2010,19000.13,6000.0));
	listOfCars.add(car7 = new UsedCar("Honda","Highlander",2007,8000.57,200000.4));
	

	
	
	
	
//	
////	for (int i = 0; i < userScan; i++) {
////		Car car = new Car();
//		
//		System.out.print("Car make: ");
//		userInput = scan.nextLine();
//		car.setMake(userInput); 
//		
//		System.out.print("Car model: ");
//		userInput = scan.nextLine();
//		car.setModel(userInput); 
//		
//		System.out.print("Car year: ");
//		carYear = scan.nextInt();
//		car.setYear(carYear); 
//		
//		System.out.print("Car price: ");
//		userNumber = scan.nextDouble();
//		car.setPrice(userNumber);
//		scan.nextLine();
		
//		System.out.println(car);
//		listOfCars.add(car);
//
//		}
//		
//		Car usedCar = new UsedCar("Nissan","250z",1992,32000.99,123);
		
		//3. menu system
	
		Iterator<Car> iter = listOfCars.iterator(); 
		int carNumber = 1;
		
		for (int i = 0; i < listOfCars.size(); i++) { 
			
		if (listOfCars.get(i) instanceof Car) {
			System.out.println(carNumber + ". " + listOfCars.get(i).getMake() + " " + listOfCars.get(i).getModel() + " " + listOfCars.get(i).getYear() + " $" + listOfCars.get(i).getPrice());

		}
		else {
			System.out.println(carNumber + ". " + listOfCars.get(i).getMake() + " " + listOfCars.get(i).getModel() + " " + listOfCars.get(i).getYear() + " $" + listOfCars.get(i).getPrice()+"(Used)"+listOfCars.get(i).getMiles());

		}
		carNumber++;	
		}
		
		
		//4. storing new and used cars in an ArrayList
		
//	
//		List<Car> cars = new ArrayList<>();
//		cars.add(new Car("Honda Accord", "Ford Focus"));
//		cars.add(new UsedCar("Honda Civic"));
//		
//		
//		for (Car thisCar : cars) {
//			thisCar.go();
//			thisCar.go();
//			System.out.println(thisCar);
//		}
	
	}

}
