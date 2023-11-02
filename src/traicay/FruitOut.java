package traicay;

public class FruitOut extends Fruit {
	private String orgin;
	private double extraOut;

	public FruitOut() {
		super();
		this.orgin="";
		this.extraOut=0;
		// TODO Auto-generated constructor stub
	}
	
	public FruitOut(int id, String name, double price, String orgin, double extraOut) {
		super(id, name, price);
		this.orgin=orgin;
		this.extraOut=extraOut;
	}
	
	public double priceForSale() {
		return getPrice() + extraOut + 0.1*extraOut;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FruitOut[name" +super.getName()+ " , id " +super.getId()+ " , price " +super.getPrice()+ " , orgin " +orgin+ " , extraOut " +extraOut+"]";
	}

	public String getOrgin() {
		return orgin;
	}

	public void setOrgin(String orgin) {
		this.orgin = orgin;
	}

	public double getExtraOut() {
		return extraOut;
	}

	public void setExtraOut(double extraOut) {
		this.extraOut = extraOut;
	}
	
	

}
