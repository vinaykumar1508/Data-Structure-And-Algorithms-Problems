package blackRock;

public class QuickSort {

//http://javarevisited.blogspot.com/2014/08/quicksort-sorting-algorithm-in-java-in-place-example.html
	
	
// find a pivot element and compare the left with [pivot till you find bigger than pivot
	//find a pivot element and compare the right with [pivot till you find smaller than pivot  then replace

	// do this activity for left sub array and right sub array
	
	
public static void main(String[] args) {
		
		int arr[]={12, 11, 13, 5, 6, 7,8,22,23};
		System.out.println();
		sort(arr, 0,arr.length-1);
		print(arr);
	}
 
public static void sort(int[] arr,int low, int high){
	
	int pivot=arr[low+(high-low)/2];
	int i=low;
	int j=high;
	
	while(i<=j){
		while(arr[i]<pivot) i++;
		while(arr[j]>pivot) j--;
		if(i<=j){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		
	}
	if(low<j)
	sort(arr,low,j);
	
	if(i<high)
	sort(arr,i,high);
}


	public static void print(int []arr){
		for(int i=0 ;i<arr.length;i++){
			System.out.println("-->"+arr[i]);
		}
	}
}
