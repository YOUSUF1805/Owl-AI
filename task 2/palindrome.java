import java.util.Scanner;

public class palindrome{

    public static String reversedString(String str){
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        return reversed;
    }
    public static void checkPalindrome(String str){
        String original=str.replaceAll("\\s+","").toLowerCase();
        String reverse=reversedString(original);
        if(original.equals(reverse)){
            System.out.println("The String "+str+" is palindrome!");
        }
        else{
             System.out.println("The String "+str+" is not palindrome!");
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        checkPalindrome(str);
        sc.close();
    }
}