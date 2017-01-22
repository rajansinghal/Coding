package ncr.practice.String;

public class UniqueSubstrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hello";
		StringBuilder stbr=new StringBuilder();
		char[] ch=new String(str).toCharArray();
		for(int i=0;i<=ch.length-1;i++){
			int k=i;
			while(k != ch.length){
				for(int j=i;j<=k;j++){
					stbr.append(ch[j]);
				}
				stbr.append(",");
				k++;
				
			}
		}
		
		
		System.out.println(stbr.toString());
		
		//output- h,he,hel,hell,hello,e,el,ell,ello,l,ll,llo,l,lo,o,
	}

}
