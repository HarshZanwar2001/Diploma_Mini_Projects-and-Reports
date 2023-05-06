import java.util.*;
class StudentInfo
{
	int rollno;
	String name="  ";
	Scanner s1=new Scanner(System.in);
	public void getinfo()
	{
	try{
	System.out.println("Enter student rollno and name");
	rollno=s1.nextInt();
	name=s1.next();
	}catch(Exception e){}
	}
}
 class Marks extends StudentInfo
{
	int a[]=new int[6];
	int total,less,i;
	public void getmarks()
	{
	System.out.println("Enter 10th marks\n 1.Marathi\n2.Sanskrit/Hindi\n3.English\n4.mathematics\n5.Science\n6.history/geo/civics");
	for( i=0;i<6;i++)
	try{
		a[i]=s1.nextInt();
		total=total+a[i];
	}catch(ArrayIndexOutOfBoundsException ae){}
	{
	System.out.println("Total ia="+total);
	}
	less=a[0];
	for(i=0;i<6;i++)
	{         
		if(less>a[i])
		{
			less=a[i];
		}	
	}
	System.out.println("Best of five"+less);
	}
}
interface Per
{             
    String spgread="A";
    public void display();
}
class DisplayResult extends Marks implements Per
{
	int only;
	float persentage;
	public void display()
	{
    System.out.println("Sportgreade="+spgread);
	}
	public void displayresult()
	{
	only=total-less;
	persentage=(float)only/500*100;
	System.out.println("Persentage=\t"+persentage);
		if(less<35)
		{
		System.out.println("Result FAIL OR NAPASS");
		}
		else if(persentage>75)
		{
			System.out.println("Destination");
		}
		else
		{
			System.out.println("Pass");
		}
	}
}
public class Test786U1  extends DisplayResult
{	
	public static void main(String args[])
	{
	Test786U1 t=new Test786U1();
	t.getinfo();
	t.getmarks();
	t.display();
	t.displayresult();
	}
}

	
	

	
	