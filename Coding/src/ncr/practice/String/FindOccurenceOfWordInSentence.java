package ncr.practice.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindOccurenceOfWordInSentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FindOccurenceOfWordInSentence().maxOccurence("rajan    is a good boy rajan is      not a good boy");
	}

	public void maxOccurence(String str){
		
		String[] s=str.split("\\s+");
		Set<String> set= new HashSet<String>(Arrays.asList(s));
		/*for(Iterator i=set.iterator(); i.hasNext();){
			System.out.println(i.next());
		}*/
		for(String sr: set){
			System.out.println(sr + "  " + Collections.frequency(Arrays.asList(s), sr));
			
		}
	}
}
