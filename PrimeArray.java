
public class PrimeArray {
	public static void main(String[] args){
		int num,i,a=0,index=0;
		long[] primes = new long[105000];
		
		for(num=2;num<=1000000; num++){
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
	System.out.println("10001st prime is " + primes[10000]);
}
}
