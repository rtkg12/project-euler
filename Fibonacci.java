
public class Fibonacci{
	public static void main(String[] args){
		int sum=0;
		int i=1;
		int ib = 0;
		int ia = 0;

		while(i<=100) {
			ib = i;
			i = ia;
			ia = i + ib;
			System.out.println(ia);
		}
	}
}