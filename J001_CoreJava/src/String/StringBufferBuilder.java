package String;

public class StringBufferBuilder {

	public static void main(String[] args) {

		// String Buffer
		StringBuffer buffer = new StringBuffer();
		long start = System.currentTimeMillis();

		for (int i = 1; i < 1000000; i++) {
			buffer.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Difference Buffer:" + (end - start));

		// String Builder
		StringBuilder builder = new StringBuilder();
		start = System.currentTimeMillis();

		for (int i = 1; i < 1000000; i++) {
			builder.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Difference Buider:" + (end - start));
	}
}
