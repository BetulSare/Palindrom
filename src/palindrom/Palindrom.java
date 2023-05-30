
package palindrom;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number=scan.nextInt();
        String numberString=Integer.toString(number);
        boolean IsPalindrom=true;
        int digit=numberString.length()-1;
        for (int i = 0; i < numberString.length()/2; i++) {
                if(numberString.charAt(i)!=numberString.charAt(digit)){
                    IsPalindrom=false;
                    break;
                }
            digit--;
        }
        if(IsPalindrom){
            System.out.printf("%s is palindrom number",number);
        }else{
            System.out.printf("%s is not palindrom number",number);
        }

    }
    
}
