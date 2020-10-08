package Ponyville;

import Ponyville.People.Tag;

public class testClass {
	
	
	public static void main(String[] arg) {
		
		
		
		
		
		
		
		
		
		
		People bokun = new People("Bokun");
		WishList wishList = bokun.getWishList();
		wishList.remove("girlfriend");
		wishList.add("cheetah");
		bokun.setStereotype(Tag.FURRY);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		helloEquestria hE = new helloEquestria();
//		hE.setName("Twilight Sparkle");
//		hE.setGreeting("Hi, my name is Twilight Sparkle");
//		hE.setId(42);
//		System.out.println(hE.getName()+" [resident #"+hE.getId()+"]:\n"+hE.getGreeting());
	}
}
