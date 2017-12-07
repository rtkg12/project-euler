
public class TriangularNum {
	public static void main(String[] args){
		long i,m,n,a=0,num=0,trinum=0;
		
		
		for(i=1; i<=20000; i++){
			a=0;
			num=0;
			for(m=1; m<=i; m++){
				num=num+m;
			}
			
			for(n=1; n<=(int)(Math.sqrt(num)); n++){
				if(num%n==0){
					a++;
				}
			}
			a = a*2;
			if(a>=500){
				trinum=num;
				System.out.println("TriNum = " + trinum);
				System.out.println("Its: " + i + " th TriNum");
				System.out.println("No. of factors = " + a);
				break;
			}
			
			else {
				a=0;
				num=0;
			}
			
		}
	}
}
