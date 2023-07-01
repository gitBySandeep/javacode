
import java.util.Scanner;
class Add{
	   public static void main(String []args){
		   Scanner sc=new Scanner (System.in);
		   int n;
		   System.out.print("enter any number");
		   n=sc.nextInt();
		   int i=2;
		   int s=0;
		   int t=0;
		   
		   while(n!=0){
			   s=s+i;
			   i=i+2;
			   n--;
			   t=s;
		   }
		   System.out.print("sum="+t);
	}
}	