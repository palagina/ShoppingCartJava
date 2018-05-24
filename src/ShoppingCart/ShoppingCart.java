package ShoppingCart;
import java.util.ArrayList;

public class ShoppingCart {
	ArrayList<Item> itemList = new ArrayList<Item>();

public ShoppingCart(){
		this.itemList = itemList;	
	}
	
	public void add(Product product, int quantity){
		itemList.add(new Item(product, quantity));
	}
	
	public void remove(Product product) {
		for (int i = 0; i < itemList.size(); i++) {
			if(product == itemList.get(i).getProduct()){
			itemList.remove(itemList.get(i));
			}
		}
	}
	
	public double getTotalPrice() {
		double total = 0;
		for(int i = 0; i < itemList.size(); i++) {
			total +=  itemList.get(i).getSubtotal();
		}
		return total;
	}
	
	public String toString() {
	if(itemList.size() > 0){
		System.out.println("===SHOPPING CART===");
		String results = "";
			for(int i = 0; i < itemList.size(); i++) {
				results += (itemList.get(i).getProduct().getNumber()) + ": "
					+ (itemList.get(i).getProduct().getName()) + ", quantity: "
					+ (itemList.get(i).getQuantity()) + ", unit price: "
					+ (itemList.get(i).getProduct().getPrice()) + ", subtotal: "
					+ (itemList.get(i).getSubtotal()) + "\n";
			}
			return results;
	}
	else {
		return "There are no items in the shopping cart. \n";
			}
	}	
}
