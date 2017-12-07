import java.util.Arrays;

import java.util.List;

public class AbundantSum {
	public static boolean contains(final int[] array, final int v) {

        boolean result = false;

        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }

        return result;
    }
	
	public static void main(String[] args) {
		int i, m = 0, a, totalsum = 1, x = 0, y = 0, ysum = 0, xsum = 0;
		int b,c=0,bsum=0;
		int[] Abundantnos = new int[6970];
		
		
		for (b = 2;  b < 28123; b++) {
			bsum=0;
			for (i = 1; i <= (int)(b/2); i++) {
				if (b % i == 0) {
					bsum = bsum + i;
				}
			} 
			
			if(bsum>b){
				Abundantnos[c] = b;
				
				c++;
			}
		}
		
		for (a = 2; a <= 28123; a++) {
			for (x = 1; x < a; x++) {
				y = a - x;
				xsum = 0;
				ysum = 0;
				m = 0;
				y = (int)y;
				x = (int)x;
				if (contains(Abundantnos, x) && contains(Abundantnos, y)) {
					m++;
					break;
									}

			}

			if (m == 0) {
				System.out.println(a);
				totalsum = totalsum + a;

			}
		}
		System.out.println(totalsum);

	}
}


