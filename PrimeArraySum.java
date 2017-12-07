
public class PrimeArraySum {
	public static void main(String[] args){
		int num,i,a=0,index=0,index2=0;
		long sum=0L;
		long[] primes = new long[1000001];
		
		for(num=2;num<=2000000; num++){
			for(i=2; i<=Math.sqrt(num); i++){
				
				if(num%i==0){
					a++;
					break;
				}
	
			}
			if(a==0){
				
				primes[index]=num;
				index++;
			}
			else{a=0;
		}
	}
		for(index2=0; index2<=1000000; index2++){
			sum = sum + primes[index2];
		}
	
	System.out.println("10001st prime is " + primes[10000]);
	System.out.println("Sum of primes below 2 million is: " + sum);
}
}

