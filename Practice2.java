package rensyu.rensyu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());

        int max = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        while (n-- > 0) {
            int input = Integer.parseInt(scan.next());
            for (int i = input - 1; i <= input + 1; i++) {
                if (map.get(i) != null) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
                if (map.get(i) > max) {
                    max = map.get(i);
                }
            }
        }
        System.out.println(max);
    }

}
