package Ponyville;

public class testClass {
	public static void main(String[] arg) {
		helloEquestria hE = new helloEquestria();
		hE.setName("Twilight Sparkle");
		hE.setGreeting("Hi, my name is Twilight Sparkle");
		hE.setId(42);
		System.out.println(hE.getName()+" [resident #"+hE.getId()+"]:\n"+hE.getGreeting());
	}
}
