import java.util.Scanner;

class Factorialnum

{
	
	int fact(int number)
	
	{
		
		if (number==1 || number==0) // base case
		{
			return 1;
			
		}
		
		else 
		{
			
			int fact=number*fact(number-1); // General case
			return fact;
		}
		
	}


public static void main(String[] args)

{
System.out.println("Enter the number for factorial:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

Factorialnum obj=new Factorialnum();
int x=obj.fact(n);
System.out.println(x);


}




}