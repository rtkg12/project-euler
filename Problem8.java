import java.util.*;
public class Problem8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        stringToArraylist(input);
    }

    public static String singleLine(Scanner input){
        System.out.println("Enter the number");
        String singleline = input.nextLine();

        singleline = singleline.replace("\n","" );
        singleline = singleline.replace(" ", "");
        return singleline;
    }

    public static ArrayList<Integer> stringToArraylist(Scanner input){
        String inputstring = input.next();
        ArrayList<Integer> arraylist = new ArrayList<Integer>();

        for(int i=0; i<inputstring.length(); i++){
            //String numberString = inputstring.substring(i, i+1);
            int numberInt = Integer.parseInt(inputstring.substring(i, i+1));
            arraylist.add(numberInt);
        }
        System.out.print(arraylist.toString());
        return arraylist;

    }
}
