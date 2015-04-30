package p150414_Chapter11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* DateFormat ¿¹Á¦
 * */
public class Ex11_00_10_FormatEx2 {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(today));
		try{
			Date date = sdf.parse("2015-04-15 12:10:35");
			System.out.println(date);
		}catch(ParseException e){
			e.printStackTrace();
		}		
	}
}
//2015-04-14 04:23:16
//Wed Apr 15 00:10:35 KST 2015
