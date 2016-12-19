
public class EditDistance {
	
	/* 
		Time Complexity: O(3^m)
	*/
	public static int findDistance(String s1, String s2, int m, int n){
		//System.out.println("s1:"+s1+":s2:"+s2);
		if(m==0) return n; // base case when first string is null then to make first string equal to second need to insert all chars of second string which will take n iterations.
		if(n==0) return m; // base case when second string is null then to make first string equal to second(null) need to delete all chars which of first string which will take m iterations.
		
		
		/* if chars are same then no extra operation is required. */
		if(s1.charAt(m-1)==s2.charAt(n-1)){
			return findDistance(s1, s2, m-1,n-1);
		}
		
		int replace=findDistance(s1, s2, m-1,n-1);
		int delete = findDistance(s1,s2,m-1,n);
		int insert = findDistance(s1, s2,m,n-1);
		
		return min(replace, delete, insert)+1;
		
	}
	
	/* 
		Time Complexity: O(m x n)
		Auxiliary Space: O(m x n)
	*/
	public static int findDistanceTempArray(String s1, String s2, int m , int n){
		
		int[][] li = new int[m+1][n+1];
		for (int i=0;i<=m;i++)
			for(int j=0;j<=n;j++){
				
				/* base case when first string is null then to make first string equal to second need to 
				 * insert all chars of second string which will take n iterations.*/
				if(i==0){    
					li[i][j]=j;
				}
				/* base case when second string is null then to make first string equal to second(null) need 
				 * to delete all chars which of first string which will take m iterations.*/
				else if (j==0){
					li[i][j]=i;
				}
				/* if chars are same then no extra operation is required. */
				else if(s1.charAt(i-1)==s2.charAt(j-1)){
					li[i][j]=li[i-1][j-1];
				}
				
				else{
					li[i][j]= 1+min(li[i-1][j-1],li[i][j-1],li[i-1][j]);
				}
				
			}
		
		
		return li[m][n];
	}
	
	public static int min(int x, int y, int z){
		
		return (  x > (y>z ?z:y) ? (y>z ?z:y) :x );
	}
	
	public static void main(String[] args) {
	
		String s1="sunday";
		String s2="saturday";
		//System.out.println(findDistance(s1,s2,s1.length(),s2.length() ));
		System.out.println(findDistanceTempArray(s1,s2,s1.length(),s2.length() ));
	}
}
