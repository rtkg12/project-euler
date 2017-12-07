import java.lang.reflect.Array;
import java.util.*;
public class Problem18 {
    static int numofrows=100;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [][] TriangularArray = new int[numofrows][numofrows];
        int [][] TriangularArraySum = new int[numofrows][numofrows];

        TriangularArray = stringToArray(input);
        System.out.println(Arrays.deepToString(TriangularArray));

        TriangularArraySum = layerAdd(TriangularArray);
        /*
        System.out.println(TriangularArray[2][2]);
        System.out.println(TriangularArray[0][0]);
        System.out.println(TriangularArray[0][1]);
        System.out.println(TriangularArray[3][2]);
        */
        System.out.println(Arrays.deepToString(TriangularArray));
        System.out.println(Arrays.deepToString(TriangularArraySum));

    }

    public static int[][] stringToArray(Scanner input){
        String numbers = input.next();

        int[][] TriangularArray = new int[numofrows][numofrows];
        int count = 1;
        int beginIndex = 0;
        for(int i=0; i<numofrows; i++){
            for (int j=0; j<count;j++){
                String numberString = numbers.substring(beginIndex, beginIndex+2);
                int numberInt = Integer.parseInt(numberString);
                TriangularArray[i][j]=numberInt;
                beginIndex+=2;
                if(count>numofrows){break;}
            }
            count++;
        }
        return TriangularArray;
    }

    public static int[][] layerAdd(int[][] array){
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        int sum1=0;
        int sum2=0;
        int count=1;
        for(int i=0; i<numofrows; i++){
            for(int j=0; j<count; j++){
                if(count>numofrows){break;}
                if(i==numofrows || j==numofrows){break;}
                sum1=array[i][j]+array[i+1][j];
                sum2 = array[i][j]+array[i+1][j+1];
                arraylist.add(sum1);
                arraylist.add(sum2);
            }
            int[] finalRow = shorten(arraylist);
            System.out.println(Arrays.toString(finalRow));

            for(int k=0; k<finalRow.length; k++){
                array[i+1][k] = finalRow[k];
            }
            count++;
            arraylist.clear();
        }
        return array;
    }

    public static int[] shorten(ArrayList<Integer> arraylist){
        int[] finalRow = new int[(arraylist.size()+2)/2];
        finalRow[0]=arraylist.get(0);
        int count =1;

        if(finalRow.length==2){
            finalRow[0]=arraylist.get(0);
            finalRow[1]=arraylist.get(1);

        }
        else {
            for (int i = 1; i <= arraylist.size() - 3; i += 2) {
                if (arraylist.get(i) < arraylist.get(i + 1)) {
                    finalRow[count] = arraylist.get(i + 1);
                } else {
                    finalRow[count] = arraylist.get(i);
                }
                count++;
            }
        }
        finalRow[finalRow.length-1] = arraylist.get(arraylist.size()-1);
        return finalRow;

    }


}
