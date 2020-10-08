package Ponyville;

import java.util.Date;

public class WishListItem {

	private String item;
	private String description;
	private WishList wishList;
	private Date dateAndTimeAdded;
	

	public WishListItem(String name, WishList list, String description) {
		this.item = name;
		this.description = description;
		this.wishList = list;
		this.dateAndTimeAdded = new Date(System.currentTimeMillis());
	}
	
	public String getName() {
		return this.item;
	}
	public void setName(String itemName) {
		this.item = itemName;
		this.dateAndTimeAdded = new Date(System.currentTimeMillis());
	}
	
	public String getDescription(String item) {
		return this.description;
	}
	
	public WishList getList() {
		return this.wishList;
	}
	
	public void setList(WishList newList) {
		this.wishList = newList;
		this.dateAndTimeAdded = new Date(System.currentTimeMillis());
	}
	public void setDescription(String d) {
		this.description = d;
	}

}
