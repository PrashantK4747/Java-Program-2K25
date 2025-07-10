import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class Exp13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hashMap=new HashMap();
		hashMap.put("kk", 10);
		hashMap.put("aa", 20);
		hashMap.put("mm", "jj");
		System.out.println(hashMap);
		//Set s=hashMap.entrySet();	
		Set set=hashMap.keySet();
		List lst=new ArrayList(set);
		Collections.sort(lst);
		System.out.println(lst);
		LinkedHashMap hashMap2=new LinkedHashMap();
		Iterator itr=lst.iterator();
		while(itr.hasNext())
		{
			Object object=itr.next();
		    hashMap2.put(object, hashMap.get(object));
		}
		
		System.out.println(hashMap2);
		//Iterator itr=s.iterator();
		
	}

}

