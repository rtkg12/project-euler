
public class SumSquareDifference {
	public static void main(String[] args){
		int num, sumOfSquares=0, squareOfSum=0, sum=0,square=0,difference;
		
		for(num=1; num<=100; num++){
			square=num*num;
			sumOfSquares=sumOfSquares+square;
			sum=sum+num;
		}
		squareOfSum=sum*sum;
		difference=squareOfSum-sumOfSquares;
		System.out.println("Sum of Squares= " + sumOfSquares);
		System.out.println("Square of sum= " + squareOfSum);
		System.out.println("Difference= " + difference );
	}
}
