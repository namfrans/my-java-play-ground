import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer3 {
    public static void main(String[] args) {
        //Lab i
        StringTokenizer st = new StringTokenizer("Hello Everyone Have A Nice Day");

        while(st.hasMoreTokens()){
            System.out.println(st.nextElement());
        }
        //Lab ii
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        StringTokenizer st1 = new StringTokenizer(sentence);
        while(st1.hasMoreTokens()){
            String myToken = st.nextElement().toString();
            String attribute = "";
            switch (myToken) {
                case "(":
                        attribute = "symbol";
                        break;
                case ")":
                    attribute = "symbol";
                    break;
                case "Main":
                    attribute = "keyword";
                    break;
                case "k"  :
                    attribute = "keyword";
                    break;
                case "=":
                    attribute = "operator";
                    break;
                case "*":
                    attribute = "operator";
                    break;
                case "{":
                    attribute = "symbol";
                    break;
                case "+":
                    attribute = "operator";
                    break;
            }
            System.out.println("Token: "+myToken+ ", Attribute: "+attribute);
        }
        System.out.print("Number of tokens detected is: "+ st1.countTokens());
        }
}
