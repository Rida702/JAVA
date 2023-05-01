abstract class HEC{
	public abstract void fees();
	public void rules(){
		System.out.println("HEC Rules");
	}
}
class PUCIT extends HEC{
	public void fees(){
		System.out.println("PUCIT Fees Structure");
	}
}
class DemoAbstract{

	public static void main(String[] args){
		//HEC a = new HEC();
		PUCIT b = new PUCIT();
		b.fees();
		b.rules();

	}
}