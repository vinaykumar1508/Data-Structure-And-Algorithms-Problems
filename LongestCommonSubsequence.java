package testPackageOne;

public class LongestCommonSubsequence {
	
	public static void main(String[] args) {
		
		String x="ABCDGH";
		String y="AEDFHR";
		
		System.out.println(LCS(x,y));
		
 	}
	
	public static int LCS(String x , String y ){
		
		if(x.length()==0 || y.length()==0) return 0;
		
		if( (x.substring(x.length()-1)).equalsIgnoreCase(y.substring(y.length()-1))){
			
			return 1+ LCS( (x.substring(0, x.length()-1)) , (y.substring(0, y.length()-1)) );
		}else{
			 if( LCS( x.substring(0, x.length()-1) , y.substring(0, y.length()))  >= LCS( x.substring(0, x.length()) , y.substring(0, y.length()-1))  ){
				 return LCS( (x.substring(0, x.length()-1)) , (y.substring(0, y.length())));
			 }else{
				 return LCS( (x.substring(0, x.length())) , (y.substring(0, y.length()-1)));
			 }
		}
				
		
	}

}
