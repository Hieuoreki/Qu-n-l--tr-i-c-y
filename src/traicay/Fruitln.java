package traicay;

public class Fruitln extends Fruit {
	private double extraln;

	public Fruitln() {
		super();
		this.extraln=0;
	}
	
	public Fruitln(int id, String name, double price, double extraln) {
		super(id, name, price);
		this.extraln=extraln;
	}
	
	public double priceForSale() {
		return getPrice() + extraln;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Fruitln[name" +super.getName()+ " , id " +super.getId()+ " , price " +super.getPrice()+ " , extraln " +extraln+"]";
	}

	public double getExtraln() {
		return extraln;
	}

	public void setExtraln(double extraln) {
		this.extraln = extraln;
	}

}
