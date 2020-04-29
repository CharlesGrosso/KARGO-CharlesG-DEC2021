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
public class Solution 
{
     static boolean one2one(String s1, String s2) 
     {
	     HashMap<Character, Character> hmap = new HashMap<Character, Character>();
		for(int i = 0; i < s1.length();i++) 
		{
		  char key1 = s1.charAt(i);
		  char key2 = s2.charAt(i);
		  if(hmap.containsKey(key1))
		  {
		    if(hmap.get(key1).equals(key2)) 
		    {
		      continue;
		    }
		    return false;
		  }
		  else 
		  {
		    if(!hmap.containsKey(key2)) 
		    {
		      hmap.put(key1, key2);
		    }
		    else return false;
		  }
		 }
		 return true;
    }
		public static void main(String[] args) 
		{
			boolean res = one2one(args[0],args[1]);
			 System.out.println(res);
	 	}
}
