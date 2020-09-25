import java.util.Arrays;

public class KClosestNum {

	public static void main(String[] args) {
		int arr[] = {10, 2, 14, 4, 7, 6};
		int num = 4;
		int count = 3;
		int closest[] = new int [count];
		for (int loop = 0; loop < arr.length; ++loop) {
			if (loop < count) {
				closest[loop]=arr[loop];
				continue;
			}
			for (int inner=0; inner<count; ++inner) {
				if (Math.abs(num - closest[inner]) < (Math.abs(num - arr[loop]))) {
					closest[inner] = arr[loop];
					break;
				}
			}
		}
		for (int i = 0; i < closest.length; i++)
			System.out.println(Arrays.toString(closest));
	}
}
