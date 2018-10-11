
/**
 * Write a description of class ShoppingCart here.
 *
 * @author (Rory Ward)
 * @version (11/10/18)
 */
import java.util.ArrayList;
public class ShoppingCart
{
    // instance variables - replace the example below with your own
    private String timeStamp;
    private final long cartID;
    private ArrayList<Item> items;
    private int total;
    private Customer customer;
    private boolean closed;
    
    /**
     * Constructor for objects of class ShoppingCart
     */
    public ShoppingCart(Customer customer)
    {
        this.timeStamp = timeStamp;
        this.cartID = makeItemID(); 
        this.customer = customer;
        items = new ArrayList<>();
        closed = false;
    }
    
	public long makeItemID() {
		return cartID;

	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public boolean close(boolean closed) {
		if(closed = false) {
		return false;
		}
		
		else {
			System.out.println("Sorry The Shopping Cart is closed");
		return true;
		}
	}
}

