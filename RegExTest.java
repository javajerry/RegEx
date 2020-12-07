package x;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

	public static void main(String[] args) {
		String str = "eid:3333 fid:44443 cid:8888";
		Pattern p = Pattern.compile(".*(eid).*|.*(fid).*");
		Matcher matcher = p.matcher(str);
		
		System.out.println(matcher.groupCount());
		while ( matcher.find())
			System.out.println("Group : " + matcher.group());

	}

}
