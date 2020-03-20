//Kargo question.
/*
~~Q: Determine whether a one-to-one character mapping exists from one string, s1, to another string, s2.~~

For example, given ​s1 = abc​ and ​s2 = bcd,​ print "​true" into stdout​ since we can map each
character in "abc" to a character in "bcd".

Given ​s1 = foo​ and ​s2 = bar,​ print "false"​ since the character ‘o’ cannot map to two characters.
 But given ​s1 = bar and ​s2 = foo​, print "true​"​ since each character in "bar" can be mapped to a
character in "foo".
*/
import java.util.HashMap;

public class Solution {

     static boolean one2one(String s1, String s2) {		 
    }

		public static void main(String[] args) {
		boolean res = one2one("foo", "bar");
				 System.out.println(res);

				 res = one2one("bar", "foo");
				 System.out.println(res);
	 }
}
