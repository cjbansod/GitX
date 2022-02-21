package car_dealership;

public class Vehicle 
{
	
	private String make;
	private String model;
	private int price;
	
	public Vehicle(String make, String model, int price) 
	{
		super();
		this.make = make;
		this.model = model;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Vehicle [make="+make+" model "+model+" Price "+price+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj==null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Vehicle v=(Vehicle)obj;
		if(make == null) {
			if(v.make != null)
				return false;
		}else if(!make.equals(v.make)){
			return false;
		}
		if(model==null) {
			if(v.model != null)
				return false;
		}else if(!model.equals(v.model)) {
			return false;
		}
		if(Double.doubleToLongBits(price) != Double.doubleToLongBits(v.price))
			return false;
		
	
		
		return true;
		
	}

}
