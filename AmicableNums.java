
public class AmicableNums {
	public static void main(String[] args){
		long i,m,n,sum1=0,sum2=0,totalsum=0;
		
		for(i=1; i<=10000; i++){
			
			for(m=1; m<i; m++){
				if(i%m==0){
					sum1 = sum1 + m;
					
				}
			}
			
			for(n=1; n<sum1; n++){
				if(sum1%n==0){
					sum2 = sum2 + n;
				}
			}
			
			if(sum2==i && sum1!=sum2){
				totalsum=totalsum + sum1 + sum2;
				System.out.println(sum1);
				System.out.println(sum2);


			}
			
			
			sum1=0;
			sum2=0;
		}
		
		
		System.out.println(totalsum/2);
	}
}
