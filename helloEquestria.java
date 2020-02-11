import java.util.ArrayList;
import java.util.Arrays;

public class hello {
	
	String Hello;
	int a;
	public void SayHello() {
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		
//		Book people = new Book("Bokun", "3510 Av Lionel-Groulx");
//		System.out.println(people.getName());
//		System.out.println(people.getAddress());
//		people.addCourseGrade("MATH 240", 85);
//		people.addCourseGrade("COMP 251", 0);
//		people.addCourseGrade("ECSE 202", 79);
//		people.printGrades();
//		System.out.println(people.getAverage());
		
		hello a = new hello();
		ArrayList<String> Mane_6 = new ArrayList<String>();
		Mane_6.add("Twilight Sparkle");
		Mane_6.add("Pinkie Pie");
		Mane_6.add("Applejack");
		Mane_6.add("Rainbow Dash");
		Mane_6.add("Rarity");
		Mane_6.add("Fluttershy");
		
		//for(int i = 0; i < Mane_6.size(); i++) System.out.println(Mane_6.get(i));
		ArrayList<String> ponies = new ArrayList<String>(Arrays.asList("Lyra Heartstring", "Bon Bon", "Derpy Hooves"));
		Mane_6.addAll(ponies);
		//System.out.print(Arrays.toString(Mane_6.toArray()) + ' ');
		//a.SayHello();
		int x = 7;
		int y = 8;
		int x_to_use = x%(1<<31);
		int y_to_use = y%(1<<31);
		//System.out.println(x_to_use + "*" + y_to_use);
		int XnoOfBits = Integer.SIZE-Integer.numberOfLeadingZeros(x);
		int YnoOfBits = Integer.SIZE-Integer.numberOfLeadingZeros(y);
		//System.out.println(XnoOfBits);
		//System.out.println(YnoOfBits);
		int[] bi = new int[2];
		bi[0] += 1;
		int c[] = {1,3, 5, 6, 15, 5};
		c[0] += 1;
		int[] par = new int[10];

		//System.out.println(Arrays.toString(c));
		//System.out.println(probe(2));
		//System.out.print("after dosomething c[0] will be " + c[0]);
		
		
	}

}

//public class hello {
//	public static void main(String[] args) {
//		Book mybook = new Book();
//		mybook.setTitle("Twilight");
//		System.out.println(mybook.getTitle());
//	}
//}