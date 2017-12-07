
public class IntegerRightTriangles {
	public static void main(String[] args){
		int a=1, b=1, c=1, p,l,m,n,x=0,y=0,d,e,f,q=0;
		
		for(p=3; p<=1000;p++){
			for(a=1; a<=(int)(p/2); a++){
				for(b=1; b<=(p-a); b++){
					for(c=1; c<=(p-a-b); c++){
						l=(int)Math.pow(a, 2);
						m=(int)Math.pow(b, 2);
						n=(int)Math.pow(c, 2);
						
						if((a+b+c)==p){
							if(l == m+n){
								x++;
							}
						}
						
						
					}
				}
			}
			if(x>y){
				y=x;
				q=p;
				System.out.println("p = " + q + " x = " + (int)y/2);
			}
			x=0;
		}
		y/=2;
		System.out.println("The perimeter is: " + q);
		System.out.println("No of triplets is: " + y);
	}
}
