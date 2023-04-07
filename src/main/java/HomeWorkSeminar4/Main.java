package HomeWorkSeminar4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calk = new Calculator();
        List<Double> list = new ArrayList<>();
        list.add(22.0);
        list.add(2.0);
        list.add(1.0);
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(2);
        list2.add(2);
        List<String> list3 = new ArrayList<>();
        list3.add("10");
        list3.add("11");
        list3.add("3");
        System.out.println("List - " + list);
        System.out.println("List2 - " + list2);
        System.out.println("List3 - " + list3 + "\n");
        System.out.println("Sum of numbers: ");
        System.out.println("List - " + calk.sum(list));
        System.out.println("List2 - " + calk.sum(list2) + "\n");
        System.out.println("Product of numbers: ");
        System.out.println("List - " + calk.productOfNumbers(list));
        System.out.println("List2 - " + calk.productOfNumbers(list2) + "\n");
        System.out.println("Difference of numbers: ");
        System.out.println("List - " + calk.differenceOfNumbers(list));
        System.out.println("List2 - " + calk.differenceOfNumbers(list2) + "\n");
        System.out.println("From Decimal to Binary number : ");
        System.out.println("List - " + calk.binaryNumberFromDigits(list));
        System.out.println("List - " + calk.binaryNumberFromDigits(list2)+ "\n");
        System.out.println("From String to Binary number : ");
        System.out.println("List3 - " + calk.binaryNumberFromStrings(list3));

    }
}
