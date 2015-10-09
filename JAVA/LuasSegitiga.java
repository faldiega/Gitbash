import java.util.Scanner;

public class LuasSegitiga{
	public static void main(String[]args){
	
	int a, t, luas;
	
	Scanner input = new Scanner(System.in);
	System.out.print("Masukan alas: ");
	a = input.nextInt();
	System.out.print("Masukan tinggi: ");
	t = input.nextInt();
	luas = a * (t / 2);
	System.out.println("Luasnya adalah " + luas);
	
	}
}