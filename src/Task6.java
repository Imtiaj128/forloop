import java.util.Scanner;

public class Task6 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter N (at least 2): ");
int n = sc.nextInt();

for (int i = 2; i <= n; i++) {
boolean prime = true;

for (int j = 2; j < i; j++) {
if (i % j == 0) {
prime = false;
break;
}
}
if (prime) {
System.out.print(i + " ");
}
}
}
}