package string;

public class Main_String {

    public static void main(String[] args) {
        String string ="Вертикальная черта разделяет допустимые варианты. Например, gray|grey соответствует gray или grey. Следует помнить, что перебор вариантов выполняется слева направо, как они указаны.";

        int length=string.length();
        System.out.println(string.substring(0,length/2));
        System.out.println(string.substring(length/2));


    }
}
