
public class CoinSums {
	public static void main(String[] args){
		int a,b,c,d,e,f,g,h,total=200;
		int l=0;
		
		for(a=0; a<=1; a++){
			for(b=0; b<=((int)(total - (200*a))/100); b++){
				for(c=0; c<=((int)(total - (100*b) - (200*a))/50); c++){
					for(d=0; d<=((int)(total - (100*b) - (200*a) - (50*c))/20); d++ ){
						for(e=0; e<=((int)(total - (100*b) - (200*a) - (50*c) - (20*d))/10); e++){
							for(f=0; f<=((int)(total - (100*b) - (200*a) - (50*c) - (20*d) - (10*e))/5); f++){
								for(g=0; g<=((int)(total - (100*b) - (200*a) - (50*c) - (20*d) - (10*e) - (5*f))/2); g++){
									for(h=0; h<=((int)(total - (100*b) - (200*a) - (50*c) - (20*d) - (10*e) - (5*f) - (2*g))); h++){
										
										total = (100*b) + (200*a) + (50*c) + (20*d) + (10*e) + (5*f) + (2*g) + h;
										
										if(total == 200){
											
											l++;
											System.out.println(l + "  " +a+"  "+b+"  "+c+"  "+d+"  "+e+"  "+f+"  "+g+"  "+h);
										}
										total=200;
									}
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println("No. of ways to make $2 in change is: " + l);
	}
}
