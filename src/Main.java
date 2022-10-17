import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập cạnh A");
        int sideA = input.nextInt();
        System.out.println("Nhập cạnh B");
        int sideB = input.nextInt();
        System.out.println("Nhập cạnh C");
        int sideC = input.nextInt();

        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        System.out.println(result);
    }
}
