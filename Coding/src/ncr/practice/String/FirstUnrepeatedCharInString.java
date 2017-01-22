package ncr.practice.String;

public class FirstUnrepeatedCharInString {

	public static void main(String arr[]){
		String str="rajanrnigingahhll";
		new FirstUnrepeatedCharInString().firstUnrepeatedChar(str);
	}
	
	public void firstUnrepeatedChar(String str){
		
		char[] c=str.toCharArray();
		int[] i=new int[256];
		for(char ch: c){
			
			i[ch]++;
		}
		for(char ch: c){
			
			if(i[ch] == 1)
				System.out.println("Answer is:: " +ch);
		}
		
	}
	
}
