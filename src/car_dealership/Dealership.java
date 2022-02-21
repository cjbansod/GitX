package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cust1=new Customer();
		cust1.setName("Vaibhav");
		cust1.setAddress("Aurangabad");
		cust1.setCashOnHand(5000.00f);
        
		Vehicle vehicle1=new Vehicle("Lamborghini", "Avandator", 10000);
		
		Employee emp1=new Employee();
		//emp1.handleCustomer(cust1, false, vehicle1);
		
		cust1.purchaseCar(vehicle1, emp1, false);
		Vehicle vehicle2=new Vehicle("Lamborghini", "Avandator", 10000);
		
		boolean val=vehicle2.equals(vehicle1);
		System.out.println(val);
	}

}
