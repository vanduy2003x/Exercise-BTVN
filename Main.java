import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Câu 1
       /* String name = "You only live once, but if you do it right, once is enough";
        System.out.println(name);
        char next = scanner.next().charAt(0);
        int back = 0;

        int n;
        for(n = 0; n < name.length(); ++n) {
            if (name.charAt(n) == next) {
                ++back;
            }
        }

        System.out.println("Số lần xuất hiện của" + next + " là " + back);
        System.out.println("Nhap n =");
        n = scanner.nextInt();
        System.out.println("so nguyen to dau tien la: \n" + n);
        int dem = 0;

        for(int i = 2; dem < n; ++i) {
            if (n > 10) {
                System.out.print("" + i + " ");
                ++dem;
            }
        }*/
        // Câu 2
        System.out.println("Nhập một số nguyên n có giá trị từ 0 -> 9");
        int kenny = scanner.nextInt();
        for (int j = 1; j <= 9; j++) {
            for (int i = 0; i < 1; i++) {
                System.out.println(kenny + "x" + j + "=" + (kenny * j));
            }
            if (kenny > 9 || kenny < 0) {
                System.out.println("nhập lại");
                int chon = scanner.nextInt();
                for (int a = 1; a < 10; a++) {
                    for (int b = 0; b < 1; b++) {
                        System.out.println(chon + "x" + a + "=" + (chon * a));
                    }
                }
            } else if (kenny == 0) {
                System.out.println("Thoát chương trình");
            }
        }
    }
            /* else if (kenny < 0 || kenny > 9) {
                System.out.println("nhập lại");
                int chon = scanner.nextInt();
                for (int a = 1; a < 10; a++) {
                    for (int b = 0; b < 1; b++) {
                        System.out.println(chon + "x" + a + "=" + (chon * a));
                    }
                }
            }*/
        }
