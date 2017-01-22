package ncr.practice.String;

public class FindWordInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source="rxxrjxxajxxaxxneee";
		String matcher="rajan";
		int j=0;
		char[] matcher_char=matcher.toCharArray();
		char[] src_arr=source.toCharArray();
		for(int i=0; i< source.length(); i++){
			if(matcher_char[j] == src_arr[i]  ){
				if(j== matcher.length()-1){
					System.out.println("matched");
					break;	
				}
				j=j+1;
			}
			
			
		}

	}
	
	/*public static void main(String[] arr){
		String source="rxxjjjjjxajxxaxxn";
		String matcher="rajan";
		char[] mat_arr = matcher.toCharArray();
		char[] src_arr= source.toCharArray();
		int i = 0;
		for(int k=0; k<mat_arr.length;k++){
			
			for(int j = i ; j<src_arr.length ; j++){
				if(mat_arr[k] == src_arr[j]){
					i=j;
					if(k== mat_arr.length -1)
						System.out.println("matched");
					break;
				}
			}
		}
	}*/

}
