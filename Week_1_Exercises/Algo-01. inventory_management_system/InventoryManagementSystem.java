/*
	You are developing an inventory management system for a warehouse. Efficient data storage and retrieval are crucial.
Steps:
1.	Understand the Problem:
o	Explain why data structures and algorithms are essential in handling large inventories.
o	Discuss the types of data structures suitable for this problem.
2.	Setup:
o	Create a new project for the inventory management system.
3.	Implementation:
o	Define a class Product with attributes like productId, productName, quantity, and price.
o	Choose an appropriate data structure to store the products (e.g., ArrayList, HashMap).
o	Implement methods to add, update, and delete products from the inventory.
4.	Analysis:
o	Analyze the time complexity of each operation (add, update, delete) in your chosen data structure.
o	Discuss how you can optimize these operations.

*/

package inventory_management_system;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManagementSystem {

	private static Map<String, Product> inventory=new HashMap<String,Product>();
	
	static Scanner scStr=new Scanner(System.in);//for string inputs
	static Scanner scInt=new Scanner(System.in);//for integer inputs
	
	public static void main(String[] args) {

		doInventoryManagement();
		
		scStr.close();
		scInt.close();
	}
	
	
	
	public static void doInventoryManagement() {
		
		System.out.println("\n-------Welcome to Inventory Management System-------");
		
		String exit;
		do {
			System.out.print("\nChoose -> \n1. Add Product \n2. Update Product \n3. Delete Product \n4. Show Product Details \nEnter choice number : ");
			int choice=scInt.nextInt();
			
			switch(choice) {
				case 1 :
					addProduct();
					break;
				case 2 :
					updateProduct();
					break;
				case 3 :
					deleteProduct();
					break;
				case 4 :
					showProductDetails();
					break;
				default :
					System.out.println("\nWrong Choice !!");
			}
			
			System.out.print("\nDo you want to exit from Inventory Management System ? (Y/N) : ");
			exit=scStr.nextLine();
		}while(exit.equals("n"));
		
		System.out.print("\n-------Thank You-------");
	}

	
	 // Method to add a product
    public static void addProduct() {
    	
    	System.out.print("\nEnter product id : ");
        String id = scStr.nextLine();
        System.out.print("\nEnter product name : ");
        String name = scStr.nextLine();
        System.out.print("\nEnter product quantity : ");
        int quantity = scInt.nextInt();
        System.out.print("\nEnter product price : ");
        double price = scInt.nextDouble();
        
        Product p= new Product(id,name,quantity,price);
    	
        inventory.put(p.getProductId(), p);
        System.out.println("\nProduct added successfully !!");

    }

    // Method to update a product
    public static void updateProduct() {
    	
    	System.out.print("\nEnter product id : ");
        String id = scStr.nextLine();
        System.out.print("\nEnter product's new name : ");
        String name = scStr.nextLine();
        System.out.print("\nEnter product's updated quantity : ");
        int quantity = scInt.nextInt();
        System.out.print("\nEnter product's new price : ");
        double price = scInt.nextDouble();
    	
        Product p= new Product(id,name,quantity,price);
        
        if (inventory.containsKey(p.getProductId())) {
            inventory.put(p.getProductId(), p);
            System.out.println("\nProduct updated successfully !!");
        } 
        else 
        {
            System.out.println("\nProduct not found in inventory !!");
        }
    }

    // Method to delete a product
    public static void deleteProduct() {
    	
    	System.out.print("\nEnter product id : ");
        String id = scStr.nextLine();
        
        if (inventory.containsKey(id)) {
            inventory.remove(id);
            System.out.println("\nProduct deleted successfully !!");
        } 
        else 
        {
            System.out.println("\nProduct not found in inventory !!");
        }
    }
    
  //Method to show product details
    public static void showProductDetails() {
    	
    	System.out.print("\nEnter product id : ");
        String id = scStr.nextLine();
        
        if (inventory.containsKey(id)) {
            
        	Product p=inventory.get(id);
        	
        	System.out.println("\nProduct details -> ");

        	System.out.print("\nProduct id : "+p.getProductId());
        	System.out.print("\nProduct name : "+p.getProductName());
        	System.out.print("\nProduct quantity : "+p.getQuantity());
        	System.out.print("\nProduct price : "+p.getPrice());
        } 
        else 
        {
            System.out.println("\nProduct not found in inventory !!");
        }
    }
}
