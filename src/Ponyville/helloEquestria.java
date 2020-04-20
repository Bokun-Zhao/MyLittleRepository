package Ponyville;

public class helloEquestria {
	
	String name;
	String greeting;
	Integer id;
	
	//constructor(s)
	public helloEquestria() {
		name = null;
		greeting = null;
		id =null;
	}
	
	public helloEquestria(String name, String greeting, int id) {
		this.name = name;
		this.greeting = greeting;
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGreeting() {
		return this.greeting;
	}
	
	public int getId() {
		return this.id;
	}
	
	public boolean setName(String aName) {
		boolean wasSet = false;
		if (aName.length() > 30) return wasSet;
		this.name = aName;
		return true;
	}
	
	public boolean setGreeting(String aGreeting) {
		boolean wasSet = false;
		if (aGreeting.length() > 100) return wasSet;
		this.greeting = aGreeting;
		return true;
	}
	
	public boolean setId(int aId) {
		boolean wasSet = false;
		if (aId < 0) return wasSet;
		this.id = aId;
		return true;
	}

}