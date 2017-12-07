
public class PrimeFactor {
	public static void main(String[] args){
		long i,n;
		long num=600851475143L;
		long counter=0;
		long primefactor=0;
		for(i=2; i<=Math.sqrt(num); i++){
			if(num%i==0) {
				
				for(n=2; n<=Math.sqrt(i);n++){
					if(i%n==0){
						counter=counter+1;
						break;
					}
				}
				
				if(counter==0){
					primefactor=i;
				}
				else {counter=0;
			}
		}
	}
		System.out.println(primefactor);
		//This returns the largest prime factor of the number num
	}
}
