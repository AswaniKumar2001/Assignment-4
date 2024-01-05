package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Three {
    public void Element() {
        PriorityQueue<Integer> arr1 = new PriorityQueue<>();
        PriorityQueue<Integer> arr2 = new PriorityQueue<>();
        Scanner Three = new Scanner(System.in);
        System.out.println("Enter no of elements in 1st PQ: ");
        int x = Three.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < x; i++) {
            arr1.add(Three.nextInt());
        }
        System.out.println("Enter no of elements in 2nd PQ: ");
        int y = Three.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < y; i++) {
            arr2.add(Three.nextInt());
        }
        arr2.addAll(arr1);
        System.out.println("after adding elements from PQ1 to PQ2, updated PQ2 : " + arr2);
    }

    public static void main(String[] args) {
        Three obj = new Three();
        obj.Element();
    }
}
