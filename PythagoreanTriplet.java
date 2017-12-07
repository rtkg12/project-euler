
public class PythagoreanTriplet {
	public static void main(String[] args){
		int a,b,c,x,y,z,d=0,e=0,f=0;
		int product=0;
		for(a=1;a<=1000; a++){
			for(b=1; b<=1000;b++){
				for(c=1;c<=1000;c++){
					x=a*a;
					y=b*b;
					z=c*c;
					
					if(x+y==z && a+b+c==1000){
						d=a;
						e=b;
						f=c;
						break;
					}
				}
			}
		}
		product=d*e*f;
		System.out.println("The Pythagorean Triplet is: " + d + " "+ e + " "+ f + " ");
		System.out.println("Their Product is: " + product);
	}
	
}
