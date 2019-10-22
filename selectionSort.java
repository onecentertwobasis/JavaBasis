package task001;
import java.util.Scanner;
public class SeletionSort {
	//选择排序算法 
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void selectSort(int[] arr) {
		for(int n=0;n<arr.length-1;n++) {
			for(int k=n+1;k<arr.length;k++) {
				if(arr[n]>arr[k]) {
					int temp = arr[n];
					arr[n] = arr[k];
					arr[k] = temp;
				
				}
			}
		}
	}
	public static void main(String[] args) {
		
		// TODO 自动生成的方法存根
		System.out.print("请输入要排序的数组的组数：");
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		for(int i=0;i<T;i++) {
			System.out.print("请输入这组数组的个数：");
			int max = sc.nextInt();
			int[] arr = new int[max];
			
			for(int j=0;j<max;j++) {
				arr[j]=sc.nextInt();
			}
			/*for(int n=0;n<max-1;n++) {
				for(int k=n+1;k<max;k++) {
					if(arr[n]>arr[k]) {
						int temp = arr[n];
						arr[n] = arr[k];
						arr[k] = temp;
					}				
				}
			}*/
			SeletionSort.selectSort(arr);
			System.out.println("选择排序后：");
			SeletionSort.printArray(arr);
			System.out.println();
		}		
	}
	

}
