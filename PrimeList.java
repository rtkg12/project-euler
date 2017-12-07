
public class PrimeList {
	public static void main(String[] args){
		int m, n, i, a,r;
		a=0;
		n=100;
		r=(int)(Math.sqrt(n));

	for(m=3; m<=n; m++)
	{
		for(i=2; i<=Math.sqrt(m); i++)
		{
			if(m%i==0)
			{
				a++;
				break;
			}

			
		}

		if(a==0)
		{
			a=0;
			
		}

		else 
		{
			System.out.println(m + " ");
		}
	}

	}
	
}
