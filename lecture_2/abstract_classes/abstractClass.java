abstract class HEC {
	public final void Rules (){
		System.out.println("Same Rules for all Universities");
	}
	public void Roadmap () {
	}
	public abstract void Fees ();
}

class PUCIT extends HEC {
	public void Fees (){
			System.out.println("Rules For PUCIT fee structure");
	}
}

public class abstractClass {
	public static void main (String[] args){
	//HEC h = new HEC();
	PUCIT pu = new PUCIT();

	pu.Roadmap();
	pu.Fees();
	}
}