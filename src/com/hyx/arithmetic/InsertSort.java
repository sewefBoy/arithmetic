package com.hyx.arithmetic;

/**
 * 插入排序
 * @author sewef
 *
 */
public class InsertSort {
	public static void main(String[] args) {
		int [] arr = {1,3,5,7,9,2,4,6,8};
		sortByThreeFor(arr);
		int [] arr1 = {1,3,5,7,9,2,4,6,8};
		sortByTwoFor(arr1);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr1[i]+"  ");
		}
	}
	/**
	 * 两层for循环
	 * @param arr
	 */
	private static void sortByTwoFor(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0 ;j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]= temp;
				}
			}
		}
	}

	/**
	 * 三层for循环
	 * @param arr
	 */
	private static void sortByThreeFor(int[] arr) {
		for(int i=1;i<arr.length;i++){
			if(arr[i] < arr[i-1]){
				for(int j=0;j<i;j++){
					if(arr[j] > arr[i]){
						int temp = arr[i];
						for(int k=i;k>=j;k--){
							arr[k] = arr[k-1];
						}
						arr[j] = temp;
					}
				}
			}
		}
	}
}
