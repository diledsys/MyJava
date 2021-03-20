package Variables;

public class Variables {


    public static void main(String[] args) {
        //-------------byte-----------------------
        byte bMax=Byte.MAX_VALUE;
        System.out.println("byteMax ="+bMax);     //127  1 байт
        //-----------byte-----------------------
        byte bMin=Byte.MIN_VALUE;     //-128
        System.out.println("byteMin="+bMin);
        //-----------shot-------------------------
        short sMin=Short.MIN_VALUE;
        System.out.println("shot_min ="+sMin); //-32768  2 байта
        //-----------shot-------------------------
        short sMax=Short.MAX_VALUE;
        System.out.println("shot_max ="+sMax); //32767
        //-----------int-----------------------
        int aMax=Integer.MAX_VALUE;  //2147483647  4 байта
        System.out.println("intMax ="+aMax);
        //-----------int-----------------------
        int aMin=Integer.MIN_VALUE; //-2147483648
        System.out.println("intMin= "+aMin);
        //-------------long---------------------
        long lMax=Long.MAX_VALUE;
        System.out.println("longMax ="+lMax); //9223372036854775807  8 байт
        //------------long---------------------
        long lMin=Long.MIN_VALUE;
        System.out.println("longMin ="+lMin); //-9223372036854775808
        //---------------float------------------
        float fMax=Float.MAX_VALUE;
        System.out.println("floatMax="+fMax); //3.4028235E38 8 байт
        //---------------float------------------
        float fMin=Float.MIN_VALUE;
        System.out.println("floatMin="+fMin); //1.4E-45   4 байт
        //-------------------------------------
        double dMax=Double.MAX_VALUE;
        System.out.println("doubleMax ="+dMax);//1.7976931348623157E308      8 байт

        //-------------------------------------
        double dMin=Double.MIN_VALUE;
        System.out.println("doubleMin ="+dMin);//4.9E-324
        //-------------------------------------
        char a='A';
        char b= 0x0041;
        //char c='\U265E';
        String string="String";

    }
}
