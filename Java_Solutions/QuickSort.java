package codes;

import java.util.Scanner;

public class QuickSort {
	
	
	public void sort(int[] arr, int left, int right){
		System.out.print(left+"-"+right+ " ");
		int pivotPos = partition(arr,left,right);
		if (pivotPos-left>1){
			sort(arr,left,pivotPos-1);
		}
		if (right-pivotPos>1){
			sort(arr,pivotPos+1,right);
		}
	}
	
	public int partition(int[] arr,int left,int right){
		int lt = left;
		int rt = right;
		String dir = "left";
		int pivot = arr[left];
		while (lt<rt){
			if (dir.equals("left")){
				if(arr[rt] > pivot){
					rt = rt-1;
				}else{
					arr[lt] = arr[rt];
					lt = lt + 1;
					dir = "right";
				}
			}else{
				if(arr[lt]<pivot){
					lt = lt + 1;
				}else{
					arr[rt] = arr[lt];
					rt = rt-1;
					dir = "left";
				}
			}
		}
		arr[lt] = pivot;
		return lt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int[] arr = new int[range];
		for(int i =0; i<range;i++){
			arr[i] = sc.nextInt();
		}
		
		(new QuickSort()).sort(arr,0,range-1);

	}

}
