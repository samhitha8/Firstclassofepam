import java.util.Scanner;
public class displayprime 
{
public static void main(String args[ ])
{
Scanner s=new Scanner(System.in);
int n,count;
System.out.println("enter the number upto:");
n=s.nextInt();
System.out.println("All the prime numbers upto the given number are:");
       int num =0;
       //Empty String
       String  primeNumbers = "";

       for (int i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to "+n+" are :");
       System.out.println(primeNumbers);

}
}



