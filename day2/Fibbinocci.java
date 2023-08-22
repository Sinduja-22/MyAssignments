package week1.day2;

public class Fibbinocci {
	public static void main(String[] args) {
		int firstNum=0;
		int secnum=1,sum=0;
		System.out.println(firstNum);
		System.out.println(secnum);
		for(int i=1; i<11 ; i++)
		{
			sum= firstNum+secnum;
			firstNum=secnum;
			secnum=sum;
	      System.out.println(sum);
		}
		
	}

}
