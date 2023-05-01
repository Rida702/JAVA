public class interfaceExp implements Football, Basketball{

public void printBasketball(){
	System.out.println("printBasketball");
}

public void printFootball(){
	System.out.println("printFootball");
}

 public static void main(String[] args) {
	 interfaceExp a = new interfaceExp();
	 a.printBasketball();
	 a.printFootball();

}
}