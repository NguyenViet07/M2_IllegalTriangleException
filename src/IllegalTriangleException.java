import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("nhập độ dài cạnh 1: ");
            int a = input.nextInt();
            System.out.println("nhập độ dài cạnh 2: ");
            int b = input.nextInt();
            System.out.println("nhập độ dài cạnh 3: ");
            int c = input.nextInt();

            if (a<=0 || b<=0 || c<=0 ||a + b <= c || a + c <= b || b + c <= a){
                int temp = 0/0;
            }
            System.out.printf("dung");
        } catch (Exception e){
            System.err.print("sai");
        }
    }
}
