import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        Scanner sc = new Scanner(System.in);
        String userInput = "";

        System.out.print("Enter a string: ");
        userInput = sc.nextLine();
        
        System.out.println(app.checkPalindrome(userInput.trim()));

        sc.close();
    }

    // Simplified method
    public String checkIfPalindrome(String userInput){
        String lowerCasedString = userInput.toLowerCase().replaceAll(" ", "");
        StringBuilder sb = new StringBuilder(lowerCasedString);

        if(sb.reverse().toString().equals(lowerCasedString)){
            return "Palindrome!";
        }else{
            return "Not a palindrome";
        }
    }

    // Array demonstrated method
    public String checkPalindrome(String userInput){
        String lowerCasedString = userInput.toLowerCase().replaceAll(" ", "");
        char[] ch = lowerCasedString.toCharArray();
        char[] ch2 = new char[ch.length];

        int chIndex = ch.length - 1;

        for(int i = 0; i < ch.length; i++){
            ch2[i] = ch[chIndex];
            chIndex--;
        }

        boolean palindrome = false;

        for(int i = 0; i < ch.length; i++){
            if(ch[i] == ch2[i]){
                palindrome = true;
            }else{
                break;
            }
        }

        return palindrome ? "Palindrome!" : "Not a Palindrome";
    }
}
