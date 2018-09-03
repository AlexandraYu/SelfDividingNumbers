import java.util.*;

public class FindSelfDividingNumbers{
    public static List<Integer> selfDividingNumbers(int left, int right) {
        boolean divisible = false;
        List<Integer> myList = new ArrayList<Integer> (); //java's List is an interface, we should use constructor "ArrayList"; 
        for(int i=left; i<=right; i++) { //for each number in the boundaries
            char[] chars = String.valueOf(i).toCharArray(); //turn each number into character array
            for (int j=0; j<chars.length; j++) { //for each character array
                int eachDigit=Character.getNumericValue(chars[j]); //turn each element into an integer

                if((eachDigit==0) || (i%eachDigit!=0)) { //any digit in a number can't be 0, and it has to be divisible
                    divisible = false;  
                    break; //important!! we make sure that as long as one digit in a number is found "disqualified", we'll break the loop of testing each digit in a number (to avoid if next digit happens to be "qualified")
                }
                else divisible = true; 
            }
            if (divisible == true) myList.add(i); 
        }
        return myList; 
    }
    public static void main(String []args){
        List<Integer> testList = new ArrayList<Integer>(); 
        testList=selfDividingNumbers(1, 22);          
        for (Integer num : testList) {
            System.out.println(num);
        }
    }
}