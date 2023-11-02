package traicay;

public class Fruit implements IFruit {
	private int id;
	private String name;
	private double price;

	public Fruit() {
		this.id=0;
		this.name="";
		this.price=0;
	}
	
	public Fruit(int id, String name, double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	@Override
	public double priceForSale() {
		// TODO Auto-generated method stub
		return 0;
	}	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fruit[name" +name+ " , id " +id+ " , price " +price+"]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
}
