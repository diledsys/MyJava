package clonable.serealizable;

/**
 * клонируем с помощью сеариализации
 */
public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Burenka",5,200);
        Cow cloneCow = cow.cloneS(cow);
        System.out.println("original = " + cow);
        System.out.println("clone = " + cloneCow);
    }
}
