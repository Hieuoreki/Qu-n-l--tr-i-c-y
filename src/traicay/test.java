package traicay;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FruitList fruitlist=new FruitList();
		
		int choice = 0;
		do {
			System.out.println("Menu: ");
			System.out.println(" 1. Thêm Fruit: ");
			System.out.println(" 2. In danh sách Fruit: ");
			System.out.println(" 3. In danh sách FruitIn và FruitOut có priceForSale lớn hơn 20: ");
			System.out.println(" 4. Tính tổng số Fruit có trong danh sách: ");
			System.out.println(" 5. Thoát. ");
			System.out.println(" Choice của bạn: ");
			int choice1=sc.nextInt();
			sc.nextLine();
			
			switch(choice1) {
			case 1:
				System.out.print(" ID: ");
				int id=sc.nextInt();
				sc.nextLine();
				
				System.out.print(" Name: ");
				String name=sc.nextLine();
				
				System.out.print(" Price: ");
				double price=sc.nextDouble();
				sc.nextLine();
				
				System.out.print(" Fruitln hay FruitOut ( 1 là Fruitln, 2 là FruitOut ) ");
				int fruitType=sc.nextInt();
				sc.nextLine();
				
				if(fruitType==1) {
					System.out.print(" Nhập extraIn: ");
					double extraln=sc.nextDouble();
					sc.nextLine();
					Fruitln fruitln=new Fruitln(id, name, price, extraln);
					fruitlist.addFruit(fruitln);
				}else if(fruitType==2) {
					System.out.print(" Nhập orgin: ");
					String orgin=sc.nextLine();
					System.out.print(" Nhập extraOut: ");
					double extraOut=sc.nextDouble();
					sc.nextLine();
					FruitOut fruitOut=new FruitOut(id, name, price, orgin, extraOut);
					fruitlist.addFruit(fruitOut);
				}else {
					System.out.print(" Sai dữ liệu. ");
				}
				break;
				
			case 2: 
				System.out.println(" In danh sách: ");
				fruitlist.printFruits();
				break;
				
			case 3:
				System.out.print(" In danh sách có priceForSale lớn hơn 20: ");
				fruitlist.printPriceForSale();
				break;
				
			case 4:
				int totalFruits = fruitlist.getTotalFruit();
                System.out.println("Total Fruits: " + totalFruits);
                break;
			case 5:
				System.out.println(" Kết thúc program. ");
				System.exit(0);
				
				default:
					System.out.println(" Dữ liệu sai. ");
			}
		}while(choice!=5);
	}
}