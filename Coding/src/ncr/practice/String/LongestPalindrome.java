package ncr.practice.String;

public class LongestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matcher=0;
		int finalsize=0;
		int finalindex=0;
		int startindex=0;
		String str="hellollowrafafjalfjl";
		char[] ch= str.toCharArray();
		for(int i=0;i<ch.length;i++){
			
			for(int j=(ch.length-1);j>i;j--){
				
				if(ch[j] == ch[i]){
					
					matcher=0;
					//for(int k=i,l=j;k < ch.length && l >= 0;k++,l--){
					for(int k=i,l=j;k <=j && l >= i;k++,l--){
						System.out.println("ch["+k+"]=" + ch[k] + "\n ch["+l+"]=" + ch[l]);
						if(ch[k] != ch[l])
							break;
						else
						{
							System.out.println("matcher=" + matcher);
							matcher++;
							System.out.println("i=" + i);
							startindex=i;
						}
					}
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
					if(matcher > finalsize){
						
						finalsize=matcher;
						finalindex=startindex;
						System.out.println("finalsize =" + finalsize + " ,finalindex=" + finalindex);
					}
					
				}
				
			}
			
			System.out.println("--------------------------------");
		}
		 for( int z = 0 ; z < finalsize ; z++ ) {
	            System.out.print(str.charAt(finalindex+z));
	        }
	}

}
