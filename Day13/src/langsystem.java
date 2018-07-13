
public class langsystem {

	public static void main(String[] args) {
		long timestamp = System.currentTimeMillis();
		System.out.println("timestamp: " +timestamp);
		for (int i =0; i<timestamp; i++) {
			
		}
		long timestampAfter = System.currentTimeMillis();
		System.out.println("timestamp: " + timestampAfter);
		System.out.println("diff: "+ (timestampAfter-timestamp));

	}

}
