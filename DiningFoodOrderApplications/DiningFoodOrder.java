package DiningFoodOrderApplications;

import java.util.Scanner;

public class DiningFoodOrder extends FoodMenu {
	FoodMenu foodMenu = new FoodMenu();

	public void startOptions() {
		Scanner scanner = new Scanner(System.in);
		int option;
		boolean boolValue = false;
		while(!boolValue) {
		System.out.println("1 : DISPLAY MENU CARD");
		System.out.println("2 : ORDER FOOD");
		System.out.println("3 : GENERATE BILL");
		System.out.println("4 : EXIT");
		System.out.println();
		System.out.println("Enter Your Options");
		option = scanner.nextInt();
		switch(option) {
		case 1 :{
			displayMenu();
			break;
		}
		case 2 :{
			orderFood();
			break;
		}
		case 3 :{
			generateBill();
			break;
		}
		case 4 :{
			boolValue = true;
			break;
		}
		default :{
			System.out.println("Invalid Option!!Please Enter Correct Option");
			System.out.println();
		}
		 }
	 }
  }

	private void generateBill() {
		System.out.println("\t\t\t DE HALLOWEEN CLUB \t\t\t");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("\t Items \t\t  Quantity  \t\tAmount \t ");
		foodMenu.bill();
		System.out.println("--------------------------------------------------------------------");
		System.out.println();
	}

	private void orderFood() {
		Scanner scanner = new Scanner(System.in);
		int choice;
		boolean boolValue = false;
		while(!boolValue) {
	    System.out.println();
		System.out.println("1 : BURGERS");
		System.out.println("2 : PIZZA");
		System.out.println("3 : SANDWICHES");
		System.out.println("4 : SHAWARMAS");
		System.out.println("5 : FRIES");
		System.out.println("6 : DESSERTS & BEVERAGES");
		System.out.println("7 : BACK TO MAIN MENU");
		System.out.println();
		System.out.println("Enter Your Choice");
		choice = scanner.nextInt();
		switch(choice) {
		case 1 :{
			foodMenu.orderBurger();
			break;
		}
		case 2 :{
			foodMenu.orderPizza();
			break;
		}
		case 3 :{
			foodMenu.orderSandwiches();
			break;
		}
		case 4 :{
			foodMenu.orderShawarmas();
			break;
		}
		case 5 :{
			foodMenu.orderFries();
			break;
		}
		case 6  :{
			foodMenu.orderDessertsBeverages();
			break;
		}
		case 7 :{
			boolValue = true;
			System.out.println();
			break;
		}
		default :{
			System.out.println("Invalid Option!!Please Enter The Correct Option");
			System.out.println();
		}
	 }
   }
 }

	private void displayMenu() {
		System.out.println("\t\t\t DE HALLOWEEN CLUB \t\t\t");
		System.out.println("--------------------------------------------------------------------");
		foodMenu.menu();
		System.out.println("--------------------------------------------------------------------");
		System.out.println();
	}
  }
