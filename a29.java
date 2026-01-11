//character class
public class a29{
    protected a29(){}
    public static void main(String args[]){
        int a;
        char[] values={'*','/','p','8','p'};
        for(a=0;a<values.length;a++){
            if(Character.isDigit(values[a])){
                System.out.println(values[a] + " is a digit");
            }
            if(Character.isLetter(values[a])){
                System.out.println(values[a] + " is a letter");
            }
            if(Character.isWhitespace(values[a])){
                System.out.println(values[a] + " is a whitespace");
            }
            if(Character.isUpperCase(values[a])){
                System.out.println(values[a] + " is a uppercase");
            }
            if(Character.isLowerCase(values[a])){
                System.out.println(values[a] + " is a lowercase");
            }
            if(Character.isUnicodeIdentifierStart(values[a])){
                System.out.println(values[a] + " is valid first" + "character of unicode identifier");
            }
        }
    }
}