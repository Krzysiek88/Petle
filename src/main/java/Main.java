import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Podaj rozmiar pętli");
        int n = scanner.nextInt();
        for (int i = 0; i <n; i++) {
            System.out.println(i);

        }
    }
}
