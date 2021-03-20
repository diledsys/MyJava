package ConditionalOperator;

public class ConditionalOperator {
    //условные  операторы
    /*
    if else
     f=(a<0)? 1:0;
     */

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        if (a < b) {
            System.out.println("a=" + a);
        } else System.out.println("b=" + b);

        System.out.println(a < b);

        int c = (a < b) ? a : b;
        System.out.println("c="+c);

    }
}
