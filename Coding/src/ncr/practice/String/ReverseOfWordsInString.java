package ncr.practice.String;

public class ReverseOfWordsInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to coding algorithms";
		new ReverseOfWordsInString().reverseString(str);
	}
	
	public void reverseString(String str){
		char[] c = str.toCharArray();
		int j = -1;
		for(int i=0; i < c.length ; i++){
			
			if(c[i] == ' ' || i == c.length - 1){
				//for(int k=j+1, l=i-1;k <= l +(l-k)/2 ; k++ ,l--){
				for(int k=j+1, l=i-1;k <= j+1 +(i-j-2)/2 ; k++ ,l--){	
					System.out.println("k:" + k + ",l:"+l);
					char temp = c[k];
					c[k] = c[l];
					c[l] = temp;
					System.out.println(new String(c));
				}
				j=i;
				System.out.println("--------------------");
				
			}
			
			
		}
		
		
	}

	/*public void reverseString(String str) {
		char[] c = str.toCharArray();

		for (int i = 0, j = c.length - 1; i < c.length / 2; i++, j--) {

			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;

		}
		
		int z = 0;
		for (int k = 0; k < c.length; k++) {
			
			if (c[k] == ' ' || k == c.length - 1) {				
				if (k == c.length - 1)
					k = k + 1;
				// this for condition is important only
				for (int i = z, j = k - 1; i < z + (k - z) / 2; i++, j--) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
					System.out.println(new String(c));
				}
				z = k + 1;
			}
		}
	}*/

}
