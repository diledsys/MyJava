package Timer;

public class TypeData {


    public static void main(String[] args) {

        byte b =10;
        int a =0;
        a=b;        //не явный кастинг
        System.out.println(a);
        a=257;
        b=(byte) a;// явный кастинг  b=1 произошла потеря данных
        System.out.println(b);
        //-----------------------------------------------------
        float f=12.55f;
        a=(int) f;
        System.out.println(a);// явный кастинг при преоброзование типо a=12
        //-----------------------------------------------------
        int k=5;  int n=3;

        double c= ++k + n++;
        c+=n;
        System.out.println("c ="+c);
        //-----------------------------------------------------
        System.out.println("Пример с постинкриментом");
        k=1;c=k++;//тут к =1
        System.out.println("k= "+k);// а тут инкрементируеться k+1
        System.out.println("c= "+c);
        //-----------------------------------------------------
        System.out.println("Пример с преинкриментом");
        ++k;c=k;
        System.out.println("k= "+k);
        System.out.println("с= "+c);
        //-----------------------------------------------------
        final int CONST_PI= 254;//                              254-127=127
        byte j=0;//                                          byte  127 + 1=-128 +126=-2
        j=(byte) CONST_PI;//                                 j=-2
        System.out.println(j);
        //-----------------------------------------------------
        a=5;b=7;
        a=b;
        System.out.println(a<b);
        String s=(a>b)?"yes":"no";
        System.out.println(s);
        s=(a<b)?"yes":"no";
        System.out.println(s);



    }
}
