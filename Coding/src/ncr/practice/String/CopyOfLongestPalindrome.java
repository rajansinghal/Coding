package ncr.practice.String;

public class CopyOfLongestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int finalsize = 0;
		int finalindex = 0;
		int startindex = 0;
		String str = "0010101";
		char[] ch = str.toCharArray();
		int zero_count = 0;
		int one_count = 0;
		for (int i = 0; i < ch.length; i++) {

			for (int j = (ch.length - 1); j > i; j--) {
				zero_count = 0;
				one_count = 0;
				for (int k = i, l = j; k <= (i) + (j - i) / 2; k++, l--) {

					if(k <= (i) + (j - i) / 2 && ch[k] == '0' ||ch[l] == '0' ){
						zero_count++;
					}else{
						if (ch[k] == '0'){
							zero_count++;
						}
						if(ch[l] == '0') {
							zero_count++;
						} 
					}
					if(k <= (i) + (j - i) / 2 && ch[k] == '1' ||ch[l] == '1'){
						one_count++;
						
					}else{
						if(ch[k] == '1'){
							one_count++;
						}
						if(ch[l] == '1'){
							one_count++;
						}
					}
				}
				if (zero_count == one_count) {
					if (zero_count > finalsize) {
						finalsize = zero_count;
						finalindex = i;
						System.out.println("finalsize =" + finalsize+ " ,finalindex=" + finalindex);
					}

				}

			}

		}

	}

}
