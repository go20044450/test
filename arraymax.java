public class arraymax{
	public static void main(String[]args){
		int[]a={10,20,302,2,7,80};
		int max= a[0];
		for(int i=0;i<a.length;i++){
			if (a[i]>max){
				max=a[i];
			}
		}
		System.out.println("max value is" +max);
		
	}
}