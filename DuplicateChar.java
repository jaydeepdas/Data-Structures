import java.util.*;
class DuplicateChar
{
	public static void countDuplicateChar(String str)
	{
		map<Character,Integer>map=new HashMap<Character,Integer>();
		Char[] charArray=str.toCharArray();
		for(char c:charArray)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}
		}
		for(map.Entry<character,Integer>entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getkey()+":"+entry.getValue());
			}
		}
	}
	public static void main(String args[])
	{
		String str="Jaydeep Das";
		countDuplicateChar(str);
	}
}