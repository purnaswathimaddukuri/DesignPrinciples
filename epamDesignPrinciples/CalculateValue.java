package epamDesignPrinciples;

public class CalculateValue {
    double a,b;
	public CalculateValue(double x,double y) {
		// TODO Auto-generated constructor stub
		a=x;
		b=y;
	}
	public void addition (){
		System.out.println(a + " + " +b +" = "+(a+b));
	}
	public void subtraction (){
		System.out.println(a + " - " +b +" = "+(a-b));
	}

	public void  multiplication(){
		System.out.println(a + " * " +b +" = "+(a*b));
	}

	public void division (){
		if(b==0){
			System.out.println("Second number should be greater than zero...");
		}
		else{
		System.out.println(a + " / " +b +" = "+(a/b));
		}
	}

}
