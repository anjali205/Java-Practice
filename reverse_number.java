import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Reverse of " + n + " is ");
        
        String s = "";
        while(n != 0) {
            int last_num = n % 10;
            s = s + Integer.toString(last_num);
            n = n / 10;
        }
        int reversed_num = Integer.parseInt(s);
        System.out.println(reversed_num);
    }
}
