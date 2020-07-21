/*
 * we need to check the number is the square of another integer
 * function returning false if our number haven't a true square, else true when number has
 */
import java.util.Scanner;
import java.math.*;

public class CodeWars1{
    public static void main(String[] arg){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Put in a number: ");
        int number = myObj.nextInt();
        if((isSquare(number)) == true){
            System.out.println("number is a square of number");
        }
        else{
            System.out.println("number isn't a square of another number");
        }
    }

    public static boolean isSquare(int n){
        var square = Math.sqrt(n);
        if(square % 1 == 0){
            return true;
        }
        return false;
    }
}
