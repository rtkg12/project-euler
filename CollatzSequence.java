
public class CollatzSequence {
	public static void main(String[] args){
		long i,l,n,m=1,num=0,a=1;
		
		
		for (l=1; l<=1000000; l++) {
			a=1;
			n=l;
			while (n>1) {
				if (n%2==0) {
					
					n=n/2;
					}

				else{
					
					n = (3 * n) + 1;
					}
				a++;
			}
			
			if(a>=m){
				num=l;
				m=a;
				
			}
			
		}
		System.out.println("Number is: " + num);
		System.out.println("No. of terms is: " + m);
	}
}
