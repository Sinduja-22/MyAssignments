package week1.day2;

public class TwoWheeler {
	
	public int noofwheels(int front, int back)
	{
		return front+back;
	}
public short noofmirrors(int left, int right)
{
	return  (short) (left+right);
	}
public long chasisNumber(long num1)
{
	return num1;
	}
public boolean isPunctured(String n)
{
	if (n=="yes")
	{
	return true;
	}
	else {
		return false;
	}
	}
	
public String bikeName()
{
	
	return "hero";
	}

public double runningKM(double runningKM)
{
	return runningKM;
	}
public static void main(String[] args) {
	TwoWheeler tw= new TwoWheeler();
	System.out.println(tw.noofwheels(2,2));
	System.out.println(tw.noofmirrors(35000, 1));
	System.out.println(tw.chasisNumber(987654321L));
	System.out.println(tw.isPunctured("yes"));
	System.out.println(tw.bikeName());
	System.out.println(tw.runningKM(123456.789));
	
}

}



