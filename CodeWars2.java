/*In this little assignment 
 * you are given a string of space separated numbers,
 * and have to return the highest and lowest number.
 * highAndLow("1 2 3 4 5")  // return "5 1
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 */
import java.io.*; 
import java.util.*; 

public class CodeWars2{
       public static String highAndLow(String numbers){
            int highNum, lowNum, iterator = 0;
            String[] nums = numbers.split(" ");
            Integer[] intArr = new Integer[nums.length];
            String answer = new String();

            while(iterator < nums.length){
                String num = nums[iterator];
                intArr[iterator] = Integer.parseInt(num); 
                System.out.printf("%d\n",intArr[iterator]);
                iterator += 1;
            }
            lowNum = Collections.min(Arrays.asList(intArr));
            highNum = Collections.max(Arrays.asList(intArr));

            answer = (Integer.toString(highNum) +" "+ 
                    Integer.toString(lowNum));
            
            return answer;
       }


        
        
       
       public static void main(String args[]){
           highAndLow("7 10 -1 4");  // return "10 -1"
       }
}
