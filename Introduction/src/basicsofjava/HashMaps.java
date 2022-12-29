package basicsofjava;

import java.util.HashMap;

import org.testng.annotations.DataProvider;

public class HashMaps {

	

        @DataProvider
		public Object [] [] getData(){
			HashMap<Object, Object> map = new HashMap <Object,Object>();
			map.put("email", "bloodywitchmm@gmail.com");
			map.put("password", "Ucenjenapredovanje5!");
			
			HashMap<Object, Object> map2 = new HashMap <Object,Object>();
			map.put("email", "bloodywitchmm@gmail.com");
			map.put("password", "Ucenjenapredovanje5!");
			
			return new Object [] [] {{map}, {map2}};
			
		}

	

}
