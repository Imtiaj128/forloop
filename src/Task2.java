import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a positive integer: ");
int n = sc.nextInt();

int count = 0;

System.out.println("Even numbers:");

for (int i = 2; i <= n; i = i + 2) {
System.out.print(i + " ");
count++;
}
System.out.println("\nCount: " + count);
}
}