import jep.Jep;

public class HelloWorld {
	public static void main(String argv[]) throws Throwable {
		try (Jep jep = new Jep()) {
			jep.eval("from java.lang import System");
			jep.eval("s = 'Hello World'");
			jep.eval("System.out.println(s)");
			jep.eval("print(s)");
			jep.eval("print(s[1:-1])");
		}
	}

}