
public class TestThamtriVsThamChieu {
	public static void main(String[] args) {
		int a = 5;
		String s = "hello";
		StringBuilder sb = new StringBuilder("Word");
		change(a, s, sb);
		System.out.println(a);
		System.out.println(s);
		System.out.println(sb);
	}

	public static void change(int a, String s, StringBuilder sb) {
		a = 10;
		s = "Word";
		sb.append(" changge");
	}
}
