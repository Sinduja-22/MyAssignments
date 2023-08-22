package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		int n = 8; int m = 0;
		for(int i = 2; i<n-1; i++)
		{
			if(n%i==0)
			{
				System.out.println("The given number is not a Prime number");
				m=1;
				break;
			}
			
		}
		if(m==0)
		{
			System.out.println("The given number is a Prime number");
		}
	}

}
