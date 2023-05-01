public class abstractClass {
	public static void main (String[] args){
	//HEC h = new HEC();
	PUCIT pu = new PUCIT();

	pu.Roadmap();
	pu.Fees();
	pu.Rules();
	}
}

abstract class HEC {
	public final void Rules (){
		System.out.println("Same Rules for all Universities");
	}
	public void Roadmap (){
		System.out.println("Same RoadMap for all Universities");
	}
	public abstract void Fees ();
}

class PUCIT extends HEC {
	public void Fees (){
			System.out.println("PUCIT fee structure");
	}
}

//Any class with an abstract method must be declared abstract
//Abstract class or method is the one that is declared but not fully implemented and is meant to be extended and overriden by it's subclasses
//the subclass is responsible for providing the implementation for the abstract methods
//