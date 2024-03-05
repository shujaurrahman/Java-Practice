// import java.util.Arrays;
// import java.util.Scanner;

// public class SortCharactersInWords {
//     public static void main(String[] args) {
//         // Get input from the user
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a sentence: ");
//         String inputSentence = scanner.nextLine();

//         // Process the input sentence
//         String outputSentence = sortCharactersInWords(inputSentence);

//         // Display the output sentence
//         System.out.println("Output: " + outputSentence);

//         // Close the scanner
//         scanner.close();
//     }

//     private static String sortCharactersInWords(String sentence) {
//         // Split the sentence into words
//         String[] words = sentence.split("\\s+");

//         // Sort characters in each word
//         for (int i = 0; i < words.length; i++) {
//             words[i] = sortCharacters(words[i]);
//         }

//         // Join the sorted words back into a sentence
//         return String.join(" ", words);
//     }

//     private static String sortCharacters(String word) {
//         // Convert the word to a character array for sorting
//         char[] charArray = word.toCharArray();

//         // Sort the character array
//         Arrays.sort(charArray);

//         // Convert the sorted character array back to a string
//         return new String(charArray);
//     }
// }

// Shuja practice 
// import java.util.Arrays;
// import java.util.Scanner;

// public class SortCharactersInWords {
//     public static String  Sortwords(String sentence){
//         String[] words=sentence.split("\\s");
//         for(int i=0;i<words.length;i++){
//             words[i]=sortCharacters(words[i]);
//         }
//         return String.join(" ",words);
//     }

//     public static String  sortCharacters(String word){
//         char[] ch=word.toCharArray();
//         Arrays.sort(ch);
//         return new String(ch);
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter Input : ");
//         Scanner sc=new Scanner(System.in);
//         String inputdaal=sc.nextLine();
        
//         String Outputagyabhayye=Sortwords(inputdaal);
//         System.out.println(Outputagyabhayye);


//     }

// }


import java.util.Arrays;
import java.util.Scanner;

public class SortCharactersInWords {
    public static String sortwords(String sentence){
        String[] words=sentence.split("\\s");
        for(int i=0;i<words.length;i++){
            words[i]=sortcharacter(words[i]);
        }
        return sentence.join(" ",words);
    }
    public static String sortcharacter(String word){
        char[] ch=word.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public static void main(String[] args) {
        System.out.println("Enter the Sentence:  ");
        Scanner sc=new Scanner(System.in);
        String Input=sc.nextLine();
        String Output=sortwords(Input);
        System.out.println(Output);
    }

}