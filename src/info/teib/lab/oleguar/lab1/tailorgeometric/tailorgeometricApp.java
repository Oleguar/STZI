package info.teib.lab.oleguar.lab1.tailorgeometric;

/**
 * Created by Олег on 25.10.2015.
 */
public class tailorgeometricApp {

    /**
     * Created by Олег on 26.10.2015.
     */
    public static void main(String[] args) {

        double precision = 0.00001;

        double x = 0.64;
        double sum = 1;

        double prevChiselnik = 1;


        for (int n = 1; ; n++) {

            prevChiselnik = prevChiselnik * x;

            double dodanok = prevChiselnik;
            if (Math.abs(dodanok) <= precision) {
                break;
            }


            sum = sum + dodanok;


        }

        System.out.println(sum);

    }

}


