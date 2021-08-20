package j2ee.lab02.ex04;

import java.util.Arrays;

public class DataReverser {

	public static <E> void reverse(E[] arr)
	{
		for(int i=0; i<arr.length/2; i++)
		{
			E temp = arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
	}
	
	public static void main(String[] args)
	{
		Integer[] iarr = {1,2,3,4,5};
		Double[] darr = {1.0, 4.56, 6.76, 10.0, 45.0};
		String[] sarr = {"hi", "hey", "hello"};
		reverse(iarr);
		reverse(darr);
		reverse(sarr);
		System.out.println(Arrays.toString(iarr));
		System.out.println(Arrays.toString(darr));
		System.out.println(Arrays.toString(sarr));		
	}
}
