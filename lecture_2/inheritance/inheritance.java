package inheritance;

public class Bird extends Animal {
	public Bird (){
		System.out.println("A bird has been created");
	}
	public void voice (){
		System.out.println("Bird has Voice");
	}
	public void eat (){
			System.out.println("Bird can Eat");
	}
	public void sleep (){
			System.out.println("Bird can sleep");
	}
}