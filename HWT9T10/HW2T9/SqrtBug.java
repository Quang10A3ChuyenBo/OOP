public class SqrtBug {
    public static void main(String[] args) {

        // read in the command-line argument
        double c = Double.parseDouble(args[0]);

        double t = c;              // estimate of the square root of c
        double EPSILON = 1e-15;    // relative error tolerance

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t*t - c) > EPSILON) {
            t = (c/t + t) / 2.0;
        }

        // print out the estimate of the square root of c
        System.out.println(t);
    }

}
