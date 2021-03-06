package j2ee.lab02.ex04;

import java.util.Arrays;
import java.util.Random;

public class FrequencyCalculator {
	public static int[] calculateFrequencies(int[] arr)
	{
		int[] count = new int[11];
		Arrays.fill(count, 0);
		for(int item: arr)
		{
			System.out.print(item+", ");
			count[item] = count[item] + 1;
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		Random random = new Random(55);   
		int[] arr = new int[10];
		for(int i=0; i<10; i++)
			 arr[i]=random.nextInt(11);
		System.out.println(Arrays.toString(arr));
		int[] freq = calculateFrequencies(arr);
		for(int i=0; i<freq.length; i++)
			System.out.println(i + ": " + freq[0]);
	}
}
