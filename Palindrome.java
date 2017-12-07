
public class Palindrome {
	public static void main(String[] args){
		int i,m,n,temp,num,temp2=0;
		int product;
		int unit,ten,hun,th,tenth,hunth;
		for(m=999; m>=100; m--){
			for(n=999; n>=100; n--){
				product=m*n;
				
				temp = product;
				
				
				unit = temp%10;
				temp = (int)(temp/10);
				ten = (int)(temp%10);
				temp = (int)(temp/10);
				hun = (int)(temp%10);
				temp = (int)(temp/10);
				th = (int)(temp%10);
				temp = (int)(temp/10);
				tenth = (int)(temp%10);
				temp = (int)(temp/10);
				hunth = (int)(temp%10);
				
				num=unit*100000 + ten*10000 + hun*1000 + th*100 + tenth*10 + hunth;
				if(product>temp2){
				if(num==product){
					
					temp2 = product;
					break;
					
			}
				}
			}
			
		}
		System.out.println(temp2);
	}
}
