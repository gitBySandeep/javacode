
import java.util.Scanner;
class Add{
	   public static void main(String []args){
		   Scanner sc=new Scanner (System.in);
		   int n;
		   System.out.print("enter any number");
		   n=sc.nextInt();
		   int i=1;
		   int s=1;
		   int t=0;
		   
		   while(i<=n){
			   s=s*i;
			   i++;
			   
			   t=s;
		   }
		   System.out.print("factorial="+t);
	}
}	