import java.util.StringTokenizer;
public class TokenizerBasic {
public static void main(String[] args) {


String sentence = "Java is a powerful programming language";

StringTokenizer st = new StringTokenizer(sentence);

System.out.println("Total tokens: " + st.countTokens());
System.out.println("length : " + sentence.length());
System.out.println("upper case : " + sentence.toUpperCase());
System.out.println("lower case : " + sentence.toLowerCase());
System.out.println("char at: " + sentence.charAt(6));
System.out.println("substring: " + sentence.substring(38));
System.out.println("substring: " + sentence.substring(0,8));
System.out.println("contain: " + sentence.contains("Java"));
System.out.println("equal: " + sentence.equals("Java is a powerful programming language"));


while(st.hasMoreTokens()) {

System.out.println(st.nextToken());
}
}
}
