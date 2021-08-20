package j2ee.lab02.item;

import java.util.Scanner;

public class Item {

	private int item_code;
	private String description;
	private int qty_in_stock;
	private int min_qty_in_stock;
	private double cost;
	
	public Item(int code,String description,int qty,int min_qty,double cost)
	{
		this.item_code = code;
		this.description = description;
		this.qty_in_stock = qty;
		this.min_qty_in_stock = min_qty;
		this.cost = cost;
	}
	public Item(int code, String description, double cost)
	{
		this.item_code = code;
		this.description = description;
		this.cost = cost;
	}
	int getItemCode()
	{
		return item_code;
	}
	String getItemDescription()
	{
		return description;
	}
	int getCost()
	{
		return (int)cost;
	}
	void setCost(double cost)
	{
		this.cost = cost;
	}
	int getStock()
	{
		return qty_in_stock;
	}
	int getMinQty()
	{
		return min_qty_in_stock;
	}
	void addStock(int qty)
	{
		qty_in_stock += qty;
	}
	void withdrawStock(int qty) throws InSufficientStock
	{
		try
		{
			if(qty_in_stock<qty)
				throw new InSufficientStock("InSufficientStock exception occured!!");
			qty_in_stock-=qty;
		}
		catch (InSufficientStock e) {
			throw e;
		}
	}
	boolean isUnderStock()
	{
		return qty_in_stock<min_qty_in_stock;
	}
}	

class InSufficientStock extends Exception
{
    public InSufficientStock(String s)
    {
        super(s);
    }
}
