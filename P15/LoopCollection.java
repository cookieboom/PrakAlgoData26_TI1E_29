package P15;

import java.util.Stack;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        fruits.push("Melon");
        fruits.push("Durian");
        System.out.println("");
        for(Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        
        fruits.set(fruits.size() - 1, "Strawberry");
        System.out.println("Setelah mengganti elemen terakhir dengan 'Strawberry':");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
        System.out.println("");
        
        fruits.add("Mango");
        fruits.add("guava");
        fruits.add("avocado");
        
        List<String> fruitsList = new ArrayList<>(fruits);
        Collections.sort(fruitsList);
        
        System.out.println("\nSetelah menambah 'Mango', 'guava', 'avocado' dan melakukan sorting:");
        for (String fruit : fruitsList) {
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
    }
}
