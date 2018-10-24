import java.util.*;
public class add{
	public static void main(String[]args){
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num=sc.nextInt();
		int a=1;
		while(num>=Math.pow(10,a)){
			a++;	
		}
		a--;
		int sum=0,rest=num;
		for(int i=a;i>=0;i--){
			sum=sum+(int)(rest/Math.pow(10,i));
			rest=rest%(int)(Math.pow(10,i));
		}
		System.out.println(sum);
		
		
			
			
	}
}