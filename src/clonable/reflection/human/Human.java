package clonable.reflection.human;

import java.lang.reflect.Field;

public class Human {
    String name;
    String colorHear;
    int age;

    public Human(String name, String colorHear, int age) {
        this.name = name;
        this.colorHear = colorHear;
        this.age = age;
    }
    public static Human clonReflexion(Human human){
        Human clonHuman = human;
        try {
            Field name = Human.class.getDeclaredField("name");
            Field colorHear = Human.class.getDeclaredField("colorHear");
            Field age = Human.class.getDeclaredField("age");
        name.setAccessible(true);
        colorHear.setAccessible(true);
        age.setAccessible(true);
        name.set(clonHuman,"Vovan");
        colorHear.set(clonHuman,"red");
        } catch (NoSuchFieldException |IllegalAccessException e) {
            e.printStackTrace();
        }

        return  clonHuman;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", colorHear='" + colorHear + '\'' +
                ", age=" + age +
                '}';
    }
}
