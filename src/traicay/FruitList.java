package traicay;

import java.util.ArrayList;
import java.util.List;

public class FruitList {
	private List<Fruit> fruits;

	public FruitList() {
		this.fruits=new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	
	public FruitList(List<Fruit> fruits) {
		this.fruits=fruits;
	}
	
	public void addFruit( Fruit fruit) {
		fruits.add(fruit);
	}
	
	public void printFruits() {
		for( Fruit fruit : fruits) {
			System.out.println(fruit.getName());
			System.out.println(fruit.getId());
			System.out.println(fruit.getPrice());
		}
	}
	
	public void printPriceForSale() {
		for( Fruit	fruit : fruits ) {
			if(fruit.priceForSale()>20) {
				System.out.println(fruit.priceForSale());
			}
		}
	}
	
	public int getTotalFruit() {
		return fruits.size();
	}

}
