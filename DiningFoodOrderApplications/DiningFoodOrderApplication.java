package DiningFoodOrderApplications;

import java.util.ArrayList;
import java.util.Scanner;

public class DiningFoodOrderApplication extends DiningFoodOrder{
	ArrayList<Integer> tableList = new ArrayList<>();

	public static void main(String[] args) {
		DiningFoodOrderApplication foodObject = new DiningFoodOrderApplication();
		foodObject.startProcess();
	}

	private void startProcess() {
		DiningFoodOrder foodOrder = new DiningFoodOrder();
		Scanner scanner = new Scanner(System.in);
		boolean boolValue = false;
		while(!boolValue) {
		System.out.println("\t\t Welcome To DE Halloween Club \t\t");
		System.out.println();
		System.out.println("Book Your Table (Slot From 1 TO 10)");
		int tableInput = scanner.nextInt();
		if(tableAvailability(tableInput)) {
			foodOrder.startOptions();
			boolValue=true;
		}
	}	
}

	private boolean tableAvailability(int tableInput) {
		if(tableInput >=1 && tableInput <=10) {
			if(tableList.contains(tableInput)) {
				System.out.println();
				System.out.println("Sorry :( Table is Already Booked. Try Again");
				System.out.println();
			}else {
				tableList.add(tableInput);
				System.out.println();
				System.out.println("Table "+tableInput+" is Booked For You :)");
				System.out.println("Happy Dining");
				System.out.println();
				return true;
			}
		}else {
			System.out.println();
			System.out.println("Invalid Table Number. Try Again");
			System.out.println();
			return false;
		}
		return false;
	}

}
