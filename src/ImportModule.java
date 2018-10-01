import java.util.Arrays;
import java.util.List;

import jep.Jep;

public class ImportModule {
    public static void main(String argv[]) throws Throwable {
        try (Jep jep = new Jep()) {
            jep.eval("import my_module1");

            int x = 5;
            jep.set("x", x);
            int y = 3;
            jep.set("y", y);

            jep.eval("result1 = my_module1.add(x, y)");
            Integer result1 = jep.getValue("result1", Integer.class);
            System.out.println("add(" + x + ", " + y + ") = " + result1);

            jep.eval("result2 = my_module1.sub(x, y)");
            Integer result2 = jep.getValue("result2", Integer.class);
            System.out.println("sub(" + x + ", " + y + ") = " + result2);

            List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
            jep.set("nums", nums);
            jep.eval("result3 = my_module1.calc(nums)");
            Integer result3 = jep.getValue("result3", Integer.class);
            System.out.println("cals(" + nums.toString() + ") = " + result3);
        }
    }
}