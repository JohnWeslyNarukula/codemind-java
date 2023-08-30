import java.util.Scanner;
public class VolumeOfCube {
	public static void main(String[] args) {
		int  length, SA,Volume;
		Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		SA = 6 * (length * length);
		Volume = length * length * length;
		System.out.println("Surface area = "+SA+" and Volume = "+Volume);
	}
}
