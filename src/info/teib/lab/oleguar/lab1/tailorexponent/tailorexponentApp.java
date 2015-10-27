package info.teib.lab.oleguar.lab1.tailorexponent;

/**
 * Created by Олег on 26.10.2015.
 */
public class tailorexponentApp {
    public static void main(String[] arg) {
        double precision = 0.00001;
        double x = Math.PI / 3;
        double sum = 1;
        double prevChiselnik = 1;
        long prevZnamennik = 1;

        for (int n = 1; ; n++) {

            prevChiselnik = prevChiselnik * x;
            prevZnamennik = prevZnamennik * 1 * n * (2 * n + 1);
            double dodanok = prevChiselnik / prevZnamennik;
            if (Math.abs(dodanok) <= precision)
                break;

            sum = sum + dodanok;

            System.out.println(sum);
        }
    }
}