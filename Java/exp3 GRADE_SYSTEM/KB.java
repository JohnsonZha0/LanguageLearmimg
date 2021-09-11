import java.io.*;
import java.util.*;

//从键盘输入数据
class KB {
	public static String scan()	{
		String str ="";
		try {
			BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
			str=buf.readLine();
		}
		catch(Exception e){
		}
		return str;
	}
}
