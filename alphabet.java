public class alphabet{
	public static void main(String[]args){
		char a='i';
		if(Character.isUpperCase(a)){
			System.out.println(a+"->"+Character.toLowerCase(a));
		}
		else if(Character.isLowerCase(a)){
			System.out.println(a+"->"+Character.toUpperCase(a));
		}
	}
}