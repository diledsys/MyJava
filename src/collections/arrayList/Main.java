package collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList();
        arrayList.add("Fe");
        arrayList.add("Cu");
        arrayList.add("Mg");
        arrayList.add("Cr");
        arrayList.add("Si");
        int size = arrayList.size();
        String getObjectByIndex = arrayList.get(3);
        arrayList.add(8,"addElement");
        arrayList.sort(String::compareTo);
        System.out.println(Arrays.toString(arrayList.toArray()));
        arrayList.remove("Mg");
        Boolean isObject = arrayList.contains("Cr");
        arrayList.set(4,"newElement");
        int index = arrayList.indexOf("Fe");
        boolean isEmpty = arrayList.isEmpty();
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (int i = 0; i <arrayList.size() ; i++) {
            arrayList.get(i);
        }

    }
}
