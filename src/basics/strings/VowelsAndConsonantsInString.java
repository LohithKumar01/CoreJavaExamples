package basics.strings;

public class VowelsAndConsonantsInString {
    public static void main(String[] args) {
        String inputString = "Lohith";
        int vowels = 0;
        int consonants = 0;
        String lowerCaseInputString = inputString.toLowerCase();
        for(int i=0; i<lowerCaseInputString.length();i++){
            char character = inputString.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character =='u'){
                vowels+=1;
            }
            else{
                consonants+=1;
            }
        }
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);
    }
}
