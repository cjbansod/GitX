package car_dealership;

public class Employee {

	
	public  void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) 
	{
		double doubleamount;
		if(finance == true) 
		{
			doubleamount=vehicle.getPrice()-cust.getCashOnHand();
			runCreditHistory(cust, doubleamount);
			
		}else if(vehicle.getPrice() <= cust.getCashOnHand()) 
		{
			runCreditHistory(cust,vehicle);
		}else
		{
		 System.out.print("Bring more money as overdrawn");
		}
		
	}
	
	public static void runCreditHistory(Customer cust, Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Customer has purchased the vehicle: "+vehicle.getMake()+ " for the Model: "+vehicle.getModel()+" for the price: "+vehicle.getPrice());
		
	}

	public static void  runCreditHistory(Customer cust,double doubleamount) {
		System.out.println("Run Credit History for Customer....");
		System.out.println("Customer has been approved...");
		
		
	}
	
	
}
