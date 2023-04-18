
public class StringVsStringBuilderPerformance {
	public static void main(String[] args) {
		String s = "test String";
		StringBuilder sb = new StringBuilder("test Stringbuilder");

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s += "test";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("String concatenation time: " + (endTime - startTime) + " ms");

		long startTimesb = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			sb.append("test");
		}
		long endTimesb = System.currentTimeMillis();
		System.out.println("StringBuilder append time: " + (endTimesb - startTimesb) + " ms");

	}
}
