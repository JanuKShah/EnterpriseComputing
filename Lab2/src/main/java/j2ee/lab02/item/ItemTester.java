package j2ee.lab02.item;

import java.util.Scanner;

public class ItemTester {

	public static void main(String[] args) {
		int item_code, qty_in_stock, min_qty_in_stock;
		String description;
		double cost;
		Scanner sc = new Scanner(System.in);
		System.out.print("Code: ");
		item_code = sc.nextInt();
		System.out.print("Description: ");
		description = sc.next();
		System.out.print("Quantity: ");
		qty_in_stock = sc.nextInt();
		System.out.print("Min Quantity: ");
		min_qty_in_stock = sc.nextInt();
		System.out.print("Cost: ");
		cost = sc.nextInt();
		
		Item it = new Item(item_code, description, qty_in_stock, min_qty_in_stock, cost);	
		System.out.println("Item Code: " + it.getItemCode() 
		+ " Desc: " + it.getItemDescription() + " Stock: " + it.getStock() 
		+ " Min Stock: " + it.getMinQty() + " Cost: " + it.getCost());
		
		boolean done = false;
		try
		{
			while (!done)  
			{
				System.out.print("Enter value, Q to quit: ");
				String input = sc.next();
				if (input.equalsIgnoreCase("Q"))
				{
					done = true;
					continue;
				}
				System.out.print("Enter value, W to Withdraw Stock and A to Add Stock: ");
				input = sc.next();
				if (input.equalsIgnoreCase("W"))
				{
					System.out.print("Items to be withdrawn: ");
					qty_in_stock = sc.nextInt();
					it.withdrawStock(qty_in_stock);
					System.out.println(it.isUnderStock()? "Under Stock!": "Stock is good!");
				}
				else if(input.equalsIgnoreCase("A"))
				{
					System.out.print("Items to be added: ");
					qty_in_stock = sc.nextInt();
					it.addStock(qty_in_stock);
					System.out.println(it.isUnderStock()? "Under Stock!": "Stock is good!");
				}
				else
				{
					System.out.println("Invalid Choice!!");
				}
			}
			System.out.println("Item Code: " + it.getItemCode() 
			+ " Desc: " + it.getItemDescription() + " Stock: " + it.getStock() 
			+ " Min Stock: " + it.getMinQty() + " Cost: " + it.getCost());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
