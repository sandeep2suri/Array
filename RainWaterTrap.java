
public class RainWaterTrap {

	public static void main(String[] args) {
		//int arr[] = {2,0,1,0,2,2,1,2};
		//int arr[] = {3,0,2,0,4};
		int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 3};
		System.out.println(calWater(arr));
	}
	
	private static int getMax(int arr[], int fromPos, int toPos) {
		int max = arr[fromPos];
		for (int l = fromPos; l < toPos; ++l)
			max = arr[l] > arr[max] ? l : max;
		return max;
	}
	
	private static int calWater(int arr[]) {
		int water = 0;
		int i = 0;
		
		for (int o = i; o < arr.length - 1; o = i) {
			 int m = getMax(arr, o + 1, arr.length);
			 int t = Math.min(arr[m], arr[o]);
			for (i = o + 1; i < arr.length; ++i)
				if (t > arr[i])
					water += t - arr[i];
				else
					break;
		}
		
		return water;
	}
}
