package testPackageOne;

public class LongestIncreasingSubsequence {
	
	
	// Time complexity o(n^2)
	static void printLIS(int[] arr, int len){
		
		int[] LIS = new int[len];
		
		/* initialize LIS with default value */ 
		for(int i=0;i<len;i++){
			
			LIS[i] = 1;
		}
		
		int max=0;
		for (int i=1;i<len;i++){
			for (int j=0;j<i;j++){
				if( arr[i] >arr[j] && LIS[i] < LIS[j]+1 ){
					LIS[i] = LIS[j]+1;
				}
			}
		}
		
		for (int i=0;i<len;i++){
			
			if(max<LIS[i])
				max=LIS[i];
		}
		
		System.out.println("maximum length of LIS is :"+max);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {10, 22, 9, 33, 21, 41,50, 60, 80};
		int len=arr.length;
		
		printLIS(arr, len);

	}

}
