public class EvenOdd
{
public static void evenOdd()
{
 int num=100;
   if(num%2==0)
{
	System.out.println("this is even no");
}
else{
		System.out.println("this is even no");
}
}
public static void swap_two_no()
{
	
int num1=30;
int num2=40;
int temp;
temp=num1;
num1=num2;
num2=temp;

System.out.println(num1);
System.out.println(num2);
}
public static void swapTWoNo()
{
int a=40;
int b=30;
a=a+b;
b=a-b;
a=a-b;
System.out.println("the value of a is "+a);
System.out.println("the value of b is "+b);
}
public static void three_mutli()
{
int num=40;
if(num%3==0)
{
	System.out.println("it is a muttipleof 3");
}
else{
System.out.println("it is  not a muttipleof 3");
}
}
public static void leapYear()
{
	int year=2020;
	if(year%100==0)
	{
		System.out.println("it is a leap year");
	}
	else{
		System.out.println("it is a not leap yaer");
	}
}
public static void numberLoop()
{
	int countE=0;
	int countO=0;
	for(int i=0;i<=10;i++)
	{
		System.out.println(i);
		if(i%2==0)
		{
			//System.out.println("it is even no");
			countE++;
		}
		else{
			//System.out.println("it is  not even no");
			countO++;
		}
	}
	

			


}
public static void number_rev_loop()
{
	for (int i=10;i>=0;i--)
	{
		
		System.out.println(i);
		
	}
}


public static void sumNO()
{
	int countEven=0;
	int countOdd=0;
	
	for (int i=0;i<=100;i++){
		
		System.out.println("value is"+i);
	
		
		if(i%2==0)
		{
			countEven++;
		}
		else{
			countOdd++;
		}
		System.out.println(countEven+""+countOdd);
	
}
}
public static void checkPrime()
{
	int count =0;
	int n=8;
	if(n<2)
	{
		System.out.println("the given no is "+n+" is not a prime no");
	}
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
			count++;
	}
	if(count>2)
		System.out.println("the given is number "+n+"is not a prime no");
	else{
		System.out.println("the given is number "+n+"is  a prime no");
	}
		
}
}




	
		


		
	






	



	