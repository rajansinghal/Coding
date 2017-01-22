package ncr.practice.String;

public class ReversingOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="welcome to coding algorithms";
		new ReversingOfString().reverseString(str);

	}

	
	public void reverseString(String str){
		char[] c= str.toCharArray();
		System.out.println(new String(c));
		for(int i=0,j=c.length-1; i<=c.length/2; i++,j--){
			
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			//System.out.println("****    " + new String(c));
		}
		System.out.println(new String(c));
		
	}
}
