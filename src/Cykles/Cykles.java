package Cykles;

public class Cykles {
/*
                for  foreach  do while   goto
 */

    public static void main(String[] args) {

        for (int i=0;i<10;i++){
            System.out.println(i);
        }
        int n=5;
        while ((n-=1)>0){
            System.out.println("n="+n);
        }
        n=5;
        do {n--;
            System.out.println(n);
        }while (n>0);

        int дим=5;
        System.out.println(дим);
    }
}
