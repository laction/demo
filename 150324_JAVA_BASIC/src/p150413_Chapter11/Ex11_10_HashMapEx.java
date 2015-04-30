package p150413_Chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* HashMap : Map ÀÎÅÍÆäÀÌ½º¸¦ ±¸ÇöÇÑ ±¸Çö Å¬·¡½º
 * 						MapÀº (Å°,°ª) ½ÖÀ¸·Î °´Ã¼¸¦ ¿©·¯°³ ÀúÀåÇÏ´Â °´Ã¼
 * */
public class Ex11_10_HashMapEx {
	public static void main(String[] args) {
		Map map = new HashMap();
									// HashTable() µµ °¡´É. ¼º´ÉÀÌ HashMapÀÌ ´õ ÁÁÀ½.
									// TreeMap()À» Á¤·ÄÀ» À§ÇØ »ç¿ë°¡´É.

		String aName [] = { "È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ","ÀÓ²©Á¤","±è»ñ°«"};
		int [] aKey = { 1234,4567,5678,7890,9870 };

		for( int i = 0 ; i < aName.length ; i ++)
			map.put(aName[i], aKey[i]	);

		System.out.println(map);			// »õ·Î¿î ±è»ñ°«ÀÇ Á¤º¸·Î ¼öÁ¤µÈ´Ù.
		System.out.println(map.get("È«±æµ¿"));	// get() : Å°·Î Value¸¦ °¡Á®¿Â´Ù.						

		for(Object obj : map.keySet())		// keySet() : Å°µé ¸¸À» °¡Á®¿À±â.
			System.out.print(obj + " " );
		System.out.println();
		for(Object obj : map.values())		// values() : °ª¸¸À» °¡Á® ¿À±â. Collection À¸·Î
			System.out.print(obj + " ");
		System.out.println();
		for(Object obj : map.entrySet()){		// entrySet : Å°¿Í °ª ¸ğµÎ °¡Á®¿À±â.
			System.out.print(obj + " ");
			System.out.println(((Map.Entry)obj).getKey()+":"+ ((Map.Entry)obj).getValue().toString() );
		}
		System.out.println();

		Iterator it ;										// Iterator·Î Á¢±ÙÇÏ±â.
		it =map.keySet().iterator();	
		while(it.hasNext())
			System.out.print(it.next()+ " ");		
		System.out.println();
		
		it = map.values().iterator();	
		while(it.hasNext())
			System.out.print(it.next()+ " ");		
		System.out.println();
		
		it = map.entrySet().iterator();	
		while(it.hasNext()){
			Object obj = it.next();
			System.out.print(obj + " ");
			System.out.println(((Map.Entry)obj).getKey()+":"+ ((Map.Entry)obj).getValue().toString() );
		}
		System.out.println();	
	}
}
//{±è»ñ°«=9870, È«±æµ¿=1234, ÀÌ¸ù·æ=5678, ÀÓ²©Á¤=7890}
//1234
//±è»ñ°« È«±æµ¿ ÀÌ¸ù·æ ÀÓ²©Á¤ 
//9870 1234 5678 7890 
//±è»ñ°«=9870 ±è»ñ°«:9870
//È«±æµ¿=1234 È«±æµ¿:1234
//ÀÌ¸ù·æ=5678 ÀÌ¸ù·æ:5678
//ÀÓ²©Á¤=7890 ÀÓ²©Á¤:7890
//
//±è»ñ°« È«±æµ¿ ÀÌ¸ù·æ ÀÓ²©Á¤ 
//9870 1234 5678 7890 
//±è»ñ°«=9870 ±è»ñ°«:9870
//È«±æµ¿=1234 È«±æµ¿:1234
//ÀÌ¸ù·æ=5678 ÀÌ¸ù·æ:5678
//ÀÓ²©Á¤=7890 ÀÓ²©Á¤:7890
//

