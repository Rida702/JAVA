public class This_4 {
    private int x;
    public int getX () {
		return this.x;
	}
    class Inner {
        public void setX(int x) {
            This_4.this.x = x;
        }
    }
    public static void main (String[] args) {
	This_4 t1 = new This_4();
	This_4.Inner i = t1.new Inner();
	i.setX(45);
	System.out.println("Value of X is: " +  t1.getX());
	}
}
//The "this" keyword can be used in nested classes to refer to the current instance of the outer class