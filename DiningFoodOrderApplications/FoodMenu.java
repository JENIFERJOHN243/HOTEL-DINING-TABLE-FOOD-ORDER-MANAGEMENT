package DiningFoodOrderApplications;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FoodMenu {
	    static float total=0;
	    float amount=0;
        HashMap<String,Integer> burger = new LinkedHashMap<>();
        HashMap<String,Integer> pizza = new LinkedHashMap<>();
        HashMap<String,Integer> sandwiches = new LinkedHashMap<>();
        HashMap<String,Integer> shawarmas = new LinkedHashMap<>();
        HashMap<String,Integer> fries = new LinkedHashMap<>();
        HashMap<String,Integer> dessertsBeverages = new LinkedHashMap<>();
        HashMap<String,Integer> resultantMap = new LinkedHashMap<>();
        ArrayList<Float> totalList = new ArrayList<Float>();
        Scanner scanner = new Scanner(System.in);
        
        public void menu() {	
			burger.put("Veg Cheese Burger", 140);
			burger.put("Paneer Spl Burger", 170);
			burger.put("Cripsy Chicken Burger", 160);
			burger.put("Chicken Cheese Burger", 140);
			
			pizza.put("Panneer Cheese Pizza", 160);
			pizza.put("Double Cheese Pizza", 180);
			pizza.put("BBQ Chicken Pizza", 240);
			pizza.put("Tandoori Chicken Pizza", 200);
			
			sandwiches.put("Creamy Mayo Sandwich", 100);
			sandwiches.put("Chesse Corn Sandwich", 140);
			sandwiches.put("Fried Chicken Sandwich", 170);
			sandwiches.put("Chicken Keema Sandwich", 180);
			
			shawarmas.put("Mexican Shawarma", 140);
			shawarmas.put("BBQ Spl Shawarma", 180);
			shawarmas.put("Special Shawarma", 200);
			
			fries.put("Masala French Fries", 130);
			fries.put("Peri-Peri French Fries", 130);
			
			dessertsBeverages.put("Spl Choco Lava Cake", 90);
			dessertsBeverages.put("ButterScotch Mousse", 90);
			dessertsBeverages.put("Strawberry Milkshake", 110);
			dessertsBeverages.put("BlackCurrant Milkshake", 120);
			
			System.out.println();
			System.out.println("\t\tBURGERS\t\t");
			for(Map.Entry<String, Integer> display : burger.entrySet()) {
				System.out.println("\t"+display.getKey()+"\t\t"+display.getValue()+"/-");
			}
			System.out.println();
			System.out.println("\t\tPIZZA\t\t");
			for(Map.Entry<String, Integer> display : pizza.entrySet()) {
				System.out.println("\t"+display.getKey()+"\t\t"+display.getValue()+"/-");
			}
			System.out.println();
			System.out.println("\t\tSANDWICHES\t\t");
			for(Map.Entry<String, Integer> display : sandwiches.entrySet()) {
				System.out.println("\t"+display.getKey()+"\t\t"+display.getValue()+"/-");
			}
			System.out.println();
			System.out.println("\t\tSHAWARMAS\t\t");
			for(Map.Entry<String, Integer> display : shawarmas.entrySet()) {
				System.out.println("\t"+display.getKey()+"\t\t"+display.getValue()+"/-");
			}
			System.out.println();
			System.out.println("\t\tFRIES\t\t");
			for(Map.Entry<String, Integer> display : fries.entrySet()) {
				System.out.println("\t"+display.getKey()+"\t\t"+display.getValue()+"/-");
			}
			System.out.println();
			System.out.println("\t\tDESSERTS & BEVERAGES\t\t");
			for(Map.Entry<String, Integer> display : dessertsBeverages.entrySet()) {
				System.out.println("\t"+display.getKey()+"\t\t"+display.getValue()+"/-");
			}
		}

		public void orderBurger() {
			System.out.println();
			int indexNum = 1;
			for(Map.Entry<String, Integer> display : burger.entrySet()) {
				System.out.println(" "+indexNum++ +" : "+display.getKey());
			}
			System.out.println();
			Set<String> keySet = burger.keySet();
			ArrayList<String> keyList = new ArrayList<String>(keySet);
			System.out.println("What do you want to order?");
			int order = scanner.nextInt();
			String key=keyList.get(order-1);	
			System.out.println("Enter the Desiered Quantity");
			int quantity = scanner.nextInt();
			System.out.println();
			System.out.println( "You Have Selected : "+quantity+" x "+keyList.get(order-1));
			resultantMap.put(key, quantity);
			amount =  (burger.get(key))*quantity;
			totalList.add(amount);
			total += (burger.get(key))*quantity;
			System.out.println();
			
		}

		public void orderPizza() {
			System.out.println();
			int indexNum = 1;
			for(Map.Entry<String, Integer> display : pizza.entrySet()) {
				System.out.println(" "+indexNum++ +" : "+display.getKey());
			}
			System.out.println();
			Set<String> keySet = pizza.keySet();
			ArrayList<String> keyList = new ArrayList<String>(keySet);
			System.out.println("What do you want to order?");
			int order = scanner.nextInt();
			String key=keyList.get(order-1);	
			System.out.println("Enter the Desiered Quantity");
			int quantity = scanner.nextInt();
			System.out.println();
			System.out.println( "You Have Selected : "+quantity+" x " + keyList.get(order-1));
			resultantMap.put(key, quantity);
			amount = (pizza.get(key))*quantity;
			total += (pizza.get(key))*quantity;
			totalList.add(amount);
			System.out.println();
		}

		public void orderSandwiches() {
			System.out.println();
			int indexNum = 1;
			for(Map.Entry<String, Integer> display : sandwiches.entrySet()) {
				System.out.println(" "+indexNum++ +" : "+display.getKey());
			}
			System.out.println();
			Set<String> keySet = sandwiches.keySet();
			ArrayList<String> keyList = new ArrayList<String>(keySet);
			System.out.println("What do you want to order?");
			int order = scanner.nextInt();
			String key=keyList.get(order-1);	
			System.out.println("Enter the Desiered Quantity");
			int quantity = scanner.nextInt();
			System.out.println();
			System.out.println( "You Have Selected : "+quantity+" x " + keyList.get(order-1));
			resultantMap.put(key, quantity);
			amount = (sandwiches.get(key))*quantity;
			total += (sandwiches.get(key))*quantity;
			totalList.add(amount);
			System.out.println();
		}

		public void orderShawarmas() {
			System.out.println();
			int indexNum = 1;
			for(Map.Entry<String, Integer> display : shawarmas.entrySet()) {
				System.out.println(" "+indexNum++ +" : "+display.getKey());
			}
			System.out.println();
			Set<String> keySet = shawarmas.keySet();
			ArrayList<String> keyList = new ArrayList<String>(keySet);
			System.out.println("What do you want to order?");
			int order = scanner.nextInt();
			String key=keyList.get(order-1);	
			System.out.println("Enter the Desiered Quantity");
			int quantity = scanner.nextInt();
			System.out.println();
			System.out.println( "You Have Selected : "+quantity+" x " + keyList.get(order-1));
			resultantMap.put(key, quantity);
			amount = (shawarmas.get(key))*quantity;
			total += (shawarmas.get(key))*quantity;
			totalList.add(amount);
			System.out.println();
		}

		public void orderFries() {
			System.out.println();
			int indexNum = 1;
			for(Map.Entry<String, Integer> display : fries.entrySet()) {
				System.out.println(" "+indexNum++ +" : "+display.getKey());
			}
			System.out.println();
			Set<String> keySet = fries.keySet();
			ArrayList<String> keyList = new ArrayList<String>(keySet);
			System.out.println("What do you want to order?");
			int order = scanner.nextInt();
			String key=keyList.get(order-1);	
			System.out.println("Enter the Desiered Quantity");
			int quantity = scanner.nextInt();
			System.out.println();
			System.out.println( "You Have Selected : "+quantity+" x " + keyList.get(order-1));
			resultantMap.put(key, quantity);
			amount = (fries.get(key))*quantity;
			total += (fries.get(key))*quantity;
			totalList.add(amount);
			System.out.println();
		}

		public void orderDessertsBeverages() {
			System.out.println();
			int indexNum = 1;
			for(Map.Entry<String, Integer> display : dessertsBeverages.entrySet()) {
				System.out.println(" "+indexNum++ +" : "+display.getKey());
			}
			System.out.println();
			Set<String> keySet = dessertsBeverages.keySet();
			ArrayList<String> keyList = new ArrayList<String>(keySet);
			System.out.println("What do you want to order?");
			int order = scanner.nextInt();
			String key=keyList.get(order-1);	
			System.out.println("Enter the Desiered Quantity");
			int quantity = scanner.nextInt();
			System.out.println();
			System.out.println( "You Have Selected : "+quantity+" x " + keyList.get(order-1));
			resultantMap.put(key, quantity);
			amount = (dessertsBeverages.get(key))*quantity;
			total += (dessertsBeverages.get(key))*quantity;
			totalList.add(amount);
			System.out.println();
		}

		public void bill() {
			int index=0;
			float gst = ((total*5.0f)/100);
			float netAmount = total+gst;
			for(Map.Entry<String, Integer> display : resultantMap.entrySet()) {
				System.out.println(display.getKey()+"\t\t"+display.getValue()+"\t\t"+totalList.get(index++));
		}
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Taxes \t\t\t\t5.0% \t\t"+gst);
			System.out.println("Total Bill \t\t\t\t\t"+netAmount);
		}
}
