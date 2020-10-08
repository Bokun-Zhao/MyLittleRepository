package Ponyville;

import java.util.Date;

public class People {
	
	private String name;
	private Date birthday;
	private WishList wishlist;
	private Tag stereotype;
	public enum Tag {Null, FURRY, TULPA, NERD, BRONY};

	public People(String name) {
		this.name = name;
		this.birthday = null;
		this.stereotype = Tag.Null;
		wishlist = new WishList(this);
		wishlist.add("girlfriend");
		wishlist.add("boyfriend");
		wishlist.add("pony");
	}
	
	public WishList getWishList() {
		return this.wishlist;
	}
	
	public void setStereotype(Tag t) {
		this.stereotype = t;
	}

}
