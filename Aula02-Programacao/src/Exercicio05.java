import java.util.regex.Pattern;

public class Exercicio05 {
    public static void main(String[] args) {
        String string1 = "Geracão-Caldeira";
        String[] result = string1.split("-");


        string1.split(Pattern.quote("."));
        System.out.println(result[0]);




    }
}

