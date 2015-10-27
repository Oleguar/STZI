package info.teib.lab.oleguar.lab1.tailorin;

/**
 * Created by Олег on 26.10.2015.
 */
public class tailorinApp {
    public static void main(String[] arg) {
        double precision = 0.00001;
        double x = 0.64;
        double sum = 1;
        double prevChiselnik = x;
        long prevZnamennik = 1;


        for (int n = 1; ; n++) {

            prevChiselnik = prevChiselnik * x;
            prevZnamennik = prevZnamennik * 1;
            double dodanok = prevChiselnik / prevZnamennik;
            if (Math.abs(dodanok) <= precision) {
                break;
            }

            if (n % 2 == 0) {
                sum = sum + dodanok;
            } else {
                sum = sum - dodanok;

            }

            System.out.println(sum);
        }

    }


}
