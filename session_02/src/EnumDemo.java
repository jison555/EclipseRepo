

public class EnumDemo {
	
	enum Seasons{WINTER,SUMMER,AUTUMN};
	
	public static void main(String[] args) {
		Seasons s = Seasons.AUTUMN;
		System.out.println(s);
		
		Seasons s2[] = Seasons.values();       //value method is no where present.it is special method provided by java
		for(Seasons s1:s2) {
			System.out.println(s1+" "+s1.ordinal());  //enum extends Enum class and ordinal is method inside it
		}
	}

}
