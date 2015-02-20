import java.lang.Math;
import java.util.Scanner;
public class Assignment2 {
public static void main(String [] arg){
		
		int x1 ,x2,x4,x5,a,b,c,d,e;
		double Sum,Average,Max1,Max2,Max3,Max4,Min1,Min2,Min3,Min4,Median,Mode;
		double x3,x6,x7;
		String x8;
		
		
		x1=1/2; 
		x2=1%2;
		x3=1.0/2;
		x4=5+7/2;
		x5=6+13/5-35%3;
		x6=3.5*(5/4);
		x7=(3.5*5)/4;
		x8="Beat" + ' ' + "Army";
		System.out.println("The result is "+"\t"+ x1 +"\t"+x2 +"\t"+ x3 +"\t"+ x4 +"\t"+ x5 +"\t"+ x6 +"\t"+ x7 + "\t" + x8);
		
		Scanner keyboard=new Scanner(System.in);
		 System.out.println("Enter five numbers :");
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		c = keyboard.nextInt();
		d = keyboard.nextInt();
		e = keyboard.nextInt();
				
		Average = (a + b +c+d+e)/5;
		Sum =a +b+c+d+e;
		Max1=Math.max(a,b);
		Max2=Math.max(c,d);
		Max3=Math.max(Max1,e);
		Max4=Math.max(Max2,Max3);
		Min1=Math.min(a,b);
		Min2=Math.min(c,d);
		Min3=Math.min(Min1,e);
		Min4=Math.min(Min2,Min3);
		
		
		
		System.out.println("The average is " + Average + "\t" + "The sum is" + Sum + "\t" +
				           "The max value is " + Max4 +"\t" + "The min value is" + Min4);
	}


}
