public class Animal{
	 public String name;
	 public int legs;
	public Animal(String name, int legs){
		this.name = name;
		this.legs = legs;
	}
	public String toString(){
		return name +", "+ legs;
	}
	public int getLegs(){
		return legs;
	}
}
