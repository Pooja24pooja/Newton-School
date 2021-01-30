import java.io.*;
import java.util.*;
class Main()
 {
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
boolean flag=false;
for(int i=0;i<N;i++)
{
	int No=scan.nextInt();
	if(No<0)
	{
     flag=true; 
	}
}
if(flag==true)
{
	System.out.println("Yes");
}
else
{
	System.out.println("No");
}
//Your code here
 
}
 }