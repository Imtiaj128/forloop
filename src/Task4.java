public class Task4 {
public static void main(String[] args) {

for (int n = 10; n <= 99; n++) {
int tens = n / 10;
int ones = n % 10;

if (ones == 2 * tens) {
int reversed = ones * 10 + tens;

if (reversed - n == 36) {
System.out.println("Number = " + n);
}
}
}
}
}