package com.hyx.arithmetic;
/**
 * 大正整数的相乘
 * @author sewef
 *
 */
public class BigNumberMult {
	public static void main(String[] args) {
		//20的阶乘
		int [] arr = new int[30];
		int bigNum = 20;
		arr[arr.length-1]=1;
		for(int i=1;i<=bigNum;i++) {
			bigNumMult(arr, i);
		}
		//输出
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"   ");
		}
	}

	private static void bigNumMult(int[] arr, int mult) {
		for(int i=0;i<arr.length;i++) {
			arr[i] *= mult;
		}
		for(int j=arr.length-1;j>0;j--) {
			int temp = arr[j]%10;
			arr[j-1] += arr[j]/10;
			arr[j] = temp;
		}
	}
}
