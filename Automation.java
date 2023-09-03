package week3.assignment;

public class Automation  extends MultipleLanguage implements Testtool{

	public void java() {
		System.out.println("Java");
		
	}
	public void selenium() {
		System.out.println("Selenium");
		
	}
	public static void main(String[] args) {
		Automation a=new Automation();
		a.java();
		a.python();
		a.ruby();
		a.selenium();
		
	}
	
	
	

}
