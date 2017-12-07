
import java.util.Arrays;

import java.util.List;

public class QuadraticPrimes {
	public static boolean contains(final int[] array, final int v) {

        boolean result = false;

        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }

        return result;
    }

	
	public static void main(String[] args){
		int a=0,b,i,j,k,l=0,m=0,n=0,num=0,afinal=0,bfinal=0;
		int[] primes = new int[100000];
		k=0;
		for(i=2; i<=1000000; i++){
			for(j=2; j<=Math.sqrt(i); j++){
				if(i%j==0){
					l++;
					break;
				}
			}
			
			if(l==0){
				primes[k]=i;
				
				k++;
				
			}
			l=0;
		}
		
		for(a=-1000; a<=1000; a++){
			for(b=-1000; b<=1000; b++){
				n=0;
				num = (int)(Math.pow(n, 2) + (a*n) + b);
				num = (int)num;
				System.out.println("b= " + b);
				if(contains(primes, num)){
					while(contains(primes, num)){
						n++;
						num = (int)(Math.pow(n, 2) + (a*n) + b);
						num = (int)num;
					}
					
					if(n>m){
						System.out.println("n		 = " + n);
						m = n;
						afinal = a;
						bfinal = b;
					}
				
				}
			}
			System.out.println("a			 = " + a);
		}
		System.out.println("m = " + m);
		System.out.println("a = " + afinal);
		System.out.println("b = " + bfinal);
	}
}
