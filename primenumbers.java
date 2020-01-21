import java.util.*;
class primenumbers
{
primenumbers(int n)
{
for(int i=1;i<=n;i++)
{
int count=0;
	for(int j=1;j<=i;j++)
{
if(i%j==0)
count++;
}
if(count==2)
System.out.print(i+" ");
}
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("upto the number to print prime numbers");
int n=s.nextInt();
primenumbers p=new primenumbers(n);
}
}