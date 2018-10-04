import jep.Jep;
import jep.NDArray;

public class UseNumPy {

    private static NDArray<float[]> createNDArray(float[] data, int... dimensions) {
        NDArray<float[]> a = new NDArray<>(data, dimensions);
        System.out.println(a);
        return a;
    }

    private static void showNDArray(NDArray<double[]> array) {
        System.out.println(array);
        for (double i : array.getData()) {
            System.out.println(i);
        }
    }

    public static void main(String argv[]) throws Throwable {

        try (Jep jep = new Jep()) {
            jep.eval("import numpy_sample1");

            float[] f1 = new float[] { 3.3f, 2.2f, 1.1f, 4.4f, 5.5f, 6.6f };
            NDArray<float[]> a1 = createNDArray(f1, 3, 2);
            jep.set("array", a1);
            jep.eval("numpy_sample1.show_arrays(array)");

            jep.eval("rv = numpy_sample1.update_arrays(array)");
            NDArray<double[]> rv = jep.getValue("rv", NDArray.class);
            showNDArray(rv);
        }
    }
}