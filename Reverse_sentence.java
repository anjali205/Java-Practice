package demo;
import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String[] arr = str1.split(" ");
		String rev = " ";
		
		for(int i =  arr.length -1; i >= 0;i--) {
			rev += arr[i]+" ";
		}
		System.out.println(rev.trim());
	}
}
