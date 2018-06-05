package rensyu.rensyu;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); //コンストラクタ strはインスタンス
        str = str.replace(" ", "");
        str = str.replace("　", "");

        if (str.length() >= 1 && str.length() <= 100) {
            if (str.length() % 2 == 0) {
                System.out.println(str.substring(1, str.length() / 2) + str.substring(0, 1)
                        + str.substring(str.length() - 1) + str.substring(str.length() / 2, str.length() - 1));
            } else if (str.length() == 1) {
                System.out.println(str.substring(0, 1));

            } else// if (str.length() % 2 == 1) {
            {
                System.out.println(str.substring(1, (str.length() - 1) / 2)
                        + str.substring(0, 1)
                        + str.substring((str.length() - 1) / 2, ((str.length() - 1) / 2) + 1)
                        + str.substring(str.length() - 1)
                        + str.substring((str.length() / 2) + 1, str.length() - 1));

            }
        } else {
            System.out.println("文字を1文字以上、100文字以内で書いてください");
        }
    }
}
