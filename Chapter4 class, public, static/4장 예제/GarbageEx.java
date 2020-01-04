public class GarbageEx {

	public static void main(String[] args) {
		String a = new String("Good");  // a -> Good
		String b = new String("Bad");   // b -> Bad
		String c = new String("Nomal"); // c -> Nomal
		String d,e;
		
		a = null;  // a -> NULL
		d = c;     // d -> Nomal
		c = null;  // c -> NULL
		
		// Good  <- x
		// Bad   <- b
		// Nomal <- d
	}
}
