import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter N (0 to 12): ");
int n = sc.nextInt();

int factorial = 1;
for (int i = 1; i <= n; i++) {
   factorial = factorial * i;
}
System.out.println("Factorial = " + factorial);
}
}