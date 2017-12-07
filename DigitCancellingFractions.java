
public class DigitCancellingFractions {
	public static void main(String[] args){
		int a,b,c,d,i,j,k,l;
		double fraction = 0.0, fraction2=0.0;
		
		for(a=1; a<=9; a++){
			for(b=1; b<=9; b++){
				for(c=1; c<=9; c++){
					for(d=1; d<=9; d++){
						
						if(a==b && a==c && a==d){}
						else{
						fraction = (double)((a*10) + b)/((c*10) + d);
						}
						
						if (fraction < 1.0) {
							if (a == c) {
								fraction2 = (double)b/d;
								
							}
							if (a == d) {
								fraction2 = (double)b/c;
							}
							if (b == c) {
								fraction2 = (double)a/d;
							}
							if (b == d) {
								fraction2 = (double)a/c;
							} 
							
							if(fraction2==fraction){
								System.out.println(fraction2);
								System.out.println(" " + a + b + "/" +c+d );
								System.out.println(" ");
							}
						}
						fraction = 0.0;
						fraction2 = 0.0;
					}
				}
			}
		}
	}
}
