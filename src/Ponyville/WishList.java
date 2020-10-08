package Ponyville;

import java.util.ArrayList;

public class WishList {
	
	private People owner;
	private ArrayList<WishListItem> wishList;

	public WishList(People owner) {
		this.owner = owner;
	}
	
	public ArrayList<WishListItem> getList(){
		return this.wishList;
	}
	public People getOwner() {
		return this.owner;
	}

	public void add(String itemName) {
		this.getList().add(new WishListItem(itemName, this, "[insert description]"));
	}
	
	public void add(String itemName, String description) {
		this.getList().add(new WishListItem(itemName, this, description));
	}
	
	public boolean remove(String itemName) {
		for(WishListItem item: this.wishList) {
			if(item.getName().equals(itemName)) {
				wishList.remove(item);
				return true;
			}
		}
		return false;
	}
	

}
