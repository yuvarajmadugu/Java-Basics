import java.util.Arrays;

public class CodingExercisesStrings {
    static void countVowelsnConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        System.out.println("No.of Vowels= " + vowels + "\nNo.of Consonants= " + consonants);
    }
    static void removeDuplicate(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (sb.toString().indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    static boolean StringAnagramOrNot(String str1, String str2){
        String str3= str1.replaceAll("\\s+","");
        String str4= str2.replaceAll("\\s+","");
        if (str3.length() != str4.length()){
            System.out.println("Entered Strings aren't Anagram");
            return false;
        }
        char[] charArray1=str3.toCharArray();
        char[] charArray2=str4.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
//count number of vowels and consonants:
        //refer method: countVowelsnConsonants
        //Case Sensitive even it is A, it isn't considered as vowel
        /*countVowelsnConsonants("YuvaRaj".toLowerCase());  */

//Reverse the string:
        //not reversing just printing:
        /*String str="Jenny";
        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }*/

        //using builtin StringBuilder function:
        /*String str="Jenny";
        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);  */

        //using another string:
        /*String str="Jenny";
        String str1="";
        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }*/

        //two pointer approach:
        /*String str="Jenny";
        StringBuilder sb=new StringBuilder(str);
        int left=0;
        int right=str.length()-1;
        while(left<right){
            char leftchar= sb.charAt(left);
            char rightchar= sb.charAt(right);

            sb.setCharAt(left,rightchar);
            sb.setCharAt(right,leftchar);

            left++;
            right--;
        }
        System.out.println(sb);  */

//Check if String is palindrome (Ex:civic):
        /*String str="Jenny"; //case sensitive charAt(right)==charAt(left);
        int left=0;
        int right=str.length()-1;
        boolean isPalindrome=true;
        while(left<right){
            if (str.charAt(left)!=str.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if (!isPalindrome){
            System.out.println("String is not Palindrome");
        }else {
            System.out.println("String is Palindrome");
        } */

//remove White Spaces:
        /*String str="     Welcome to my You        \s tube Chan\tnel\n ";
        String replacedStr=str.replaceAll("\\s+","");
        System.out.println(replacedStr);  */

//remove duplicate characters:
        //refer method: removeDuplicate
        /* String str="JennyYj";
        removeDuplicate(str.toLowerCase());  */

//ToggleCase of each Character:
        /*String str="JeNNyYuVI";
        StringBuilder sb=new StringBuilder();
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if (Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb);  */

//StringLongestWord:
        //Approach 1 using split method:
        /*String sentences="Welcome to my Youtube Channel.";
        String lonestWord="";
        String[] words=sentences.split(" ");
        for(String word: words){
            if (word.length()>lonestWord.length()){
                lonestWord=word;
            }
        }
        System.out.println(lonestWord);   */

        //Approach 2 without using any in-built method:
        /*String str="Yuvaraj Madugujhgfdd ";
        //should add space at end because,
        // if no space cursor doesn't enter else block
        // and never update longest word & never print longest word
        String longestWord="";
        String word="";
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch!= ' '){
                word+=ch;
            }else {
                if(word.length()>longestWord.length()){
                    longestWord=word;
                }
                word="";
            }
        }
        System.out.println(longestWord);   */

//check if Two Strings are anagrams (listen and silent (both have same words) ):
        //refer method: StringAnagramOrNot
       System.out.println(StringAnagramOrNot("yu  va ra\tj             ","rajyuva"));
        }
    }