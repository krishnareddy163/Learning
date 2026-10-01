package ArrayProgramming;

public class ReverseWordSentence {

  public static void main(String[] args) {
    String str = "I am krishna";
    System.out.println(reverseString(str));
  }
  public static String reverseString(String st) {
    String[] words = st.split(" ");
    StringBuilder finalAppendString = new StringBuilder();
    for (String word : words){
      String reverseWord = new StringBuilder(word).reverse().toString();
      finalAppendString.append(reverseWord).append(" ");
    }
    return finalAppendString.toString().trim();
  }

}
