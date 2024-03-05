// import java.text.Collator;
// import java.util.Arrays;
// import java.util.Locale;

// public class SortSentences {
//     public static String sortSentences(String input) {
//         String[] sentences = input.split("\\. ");
//         Arrays.sort(sentences, Collator.getInstance(Locale.getDefault()));

//         StringBuilder result = new StringBuilder();
//         for (String sentence : sentences) {
//             result.append(sentence).append(". ");
//         }

//         // Remove the trailing space and return the result
//         return result.toString().trim();
//     }

//     public static void main(String[] args) {
//         String input = "I am living in Aligarh. Aligarh Muslim University is situated in Aligarh. Aligarh is also famous for Lock industry.";
//         String output = sortSentences(input);
//         System.out.println(output);
//     }
// }



// import java.text.Collator;
// import java.util.Arrays;
// import java.util.Locale;

// public class SortSentences {
//     public static String sortSentence(String input){
//         String[] sentences= input.split("\\.");
//         Arrays.sort(sentences,Collator.getInstance(Locale.getDefault()));

//         StringBuilder result=new StringBuilder();
//         for(String sentence: sentences){
//             result.append(sentence).append(".");
//         }

//         return result.toString().trim();
//     }
//     public static void main(String[] args) {
//         String input="I am living in aligarh. My name is shuja . I am in department of computer Science";
//         String output=sortSentence(input);
//         System.out.println(output);
//     }
// }


import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class SortSentences {

    public static String sortSentence(String input){
        String[] sentences=input.split("\\.\\s");
        Arrays.sort(sentences,Collator.getInstance(Locale.getDefault()));

        StringBuilder result= new StringBuilder();
        for(String sentence: sentences){
            result.append(sentence).append(".");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
                    String input="My name is shuja. I live in Aligarh. And i love cats";
                    String output=sortSentence(input);
                    System.out.println(output);
                
    }
}