import java.util.ArrayList;

public class Digits
{

	

	public Digits(int num)
	{ 
	digitList=new Arraylist<Integer>();
		if(num==0)
		{
digitList.add(new Integer(0));
		}
		while(num>0)
			{
digitList.add(0,new Integer(num%10));
				num/=10;
			}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i=0;i<digitList.size()-1;i++)
			{
				if(digitList.get(i)>digitList.get(i+1)){return false;}

	}
		return true;
	}
	public String toString()
	{
		return digitList.toString();
	}
}
