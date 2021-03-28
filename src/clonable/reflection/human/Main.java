package clonable.reflection.human;

public class Main {
    public static void main(String[] args) {
Human human1 = new Human("Andrei","black",23);
Human human2 = Human.clonReflexion(human1);

        System.out.println(human2);
        System.out.println(human1);

    }
}
