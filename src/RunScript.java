import jep.Jep;

public class RunScript {
    public static void main(String argv[]) throws Throwable {
        try (Jep jep = new Jep()) {
            jep.runScript("./myscript.py");
        }
    }
}