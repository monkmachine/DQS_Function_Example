package baeDateConvert;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.TimeZone;

public class BAEDateConvert {
	public static String func(String a, int i, Date d, boolean b, BigInteger l, BigDecimal f) {
		return a + i + d + b + l + f;

	}
	public static String func1(String a, String b) {
		return a + b;
	}
	public static int func2(int a, int b) {
		return a + b;
	}
	public static Date baeDateConvert(Date date, String InTimezone, String OutTimeZone) {
		TimeZone tz = TimeZone.getTimeZone(InTimezone);
		return date;

	}
}

