import java.util.Arrays;
//This doesn't work properly to calculate sum of nos which cannot be written as a sum of abundant nos
public class Abundance {
	public static void main(String[] args){
		int b=0,i,j,k,l=0,m,n=0,a,totalsum=0,x=0,y=0,ysum=0;
		int[] Abundantnos = new int[6970];
		int[] Abundantsum = new int[29124];
		int[] Abundantsum2 = new int[28124];
		
		for(b=1; b<=28123; b++){
			totalsum = totalsum + b;
			
		}
		System.out.println("Initial totalsum = "+ totalsum);
		
		for (y = 2;  y < 28123; y++) {
			ysum=0;
			for (i = 1; i <= (int)(y/2); i++) {
				if (y % i == 0) {
					ysum = ysum + i;
				}
			} 
			
			if(ysum>y){
				Abundantnos[x] = y;
				
				x++;
			}
		}
		
		for(j=0; j<Abundantnos.length; j++){
			System.out.println("j = " + j);
			System.out.println("	");

			for(m=j; m<Abundantnos.length; m++){
				System.out.println("m = " + m);

				a = Abundantnos[j] + Abundantnos[m];
				
				if(a<=28123){
					for(k=0; k<Abundantsum.length; k++){
						if(a==Abundantsum2[k] || a>Abundantsum2[k]){
							l++;
							break;
						}
						
						
					}
					if(l==0){
						Abundantsum[n]=a;
						System.out.println("a = 				" + a);
						totalsum = totalsum - a;
						n++;
					}
					l=0;
				}
				Abundantsum2 = Abundantsum;
				Arrays.sort(Abundantsum2);
			}
			
		}
		System.out.println(totalsum);
		
	
}
}
