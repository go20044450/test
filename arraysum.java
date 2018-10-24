public class arraysum{
	public static void main(String[]args){
		int[]a={10,20,30};
		int sum=0, i, avg=0;
		//int avg=0;
		for(i=0;i<a.length;i++){
			sum += a[i];
			avg = sum/a.length;
		}
		System.out.println("sum of elements in array" + sum);
		System.out.println("avg of elements in array" + avg);
		
	}
}
	