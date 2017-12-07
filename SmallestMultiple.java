
public class SmallestMultiple {
	public static void main(String[] args){
		int i,m,temp,num;
		long temp2=0;
		long product;
		
		for(m=2; m<=1000000; m++){
			
				product=16628040*m; //16628040 = 20*19*17*13*11
				
				
if(product%20==0 && product%19==0 && product%18==0 && product%17==0 && product%16==0 && product%15==0 && product%14==0 && product%13==0 && product%12==0 && product%11==0 && product%10==0){
					
					temp2 = product;
					break;
					
			}
				
			
		

		}
		System.out.println(temp2);
	}
}

