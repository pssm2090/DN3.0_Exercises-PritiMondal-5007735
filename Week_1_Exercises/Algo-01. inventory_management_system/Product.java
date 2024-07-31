package inventory_management_system;

public class Product {

	private String productId;
    private String productName;
    private int quantity;
    private double price;

    
    public Product(String productId, String productName, int quantity, double price) {
        
    	this.setProductId(productId);
        this.setProductName(productName);
        this.setQuantity(quantity);
        this.setPrice(price);
    }

    
    // Getters and Setters
    public String getProductId() { 
    	return productId; 
    }
    private void setProductId(String productId) { 
    	this.productId = productId; 
    }

    public String getProductName() { 
    	return productName; 
    }
    private void setProductName(String productName) { 
    	this.productName = productName; 
    }

    public int getQuantity() { 
    	return quantity; 
    }
    private void setQuantity(int quantity) { 
    	this.quantity = quantity; 
    }

    public double getPrice() { 
    	return price; 
    }
    private void setPrice(double price) { 
    	this.price = price; 
    }
    
}
