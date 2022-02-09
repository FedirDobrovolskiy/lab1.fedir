import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int C2, C3, C5, C7, C = 1, m, n, zalikova;
//            String O1, O2;
            float ans = 0.0F;
            double i, j;
//            zalikova = 1210;
//            C2 = zalikova % 2;
//            C3 = zalikova % 3;
//            C5 = zalikova % 5;
//            C7 = zalikova % 7;
//
//            switch (C2){
//                case 0: O1 = "+"; break;
//                case 1: O1 = "-"; break;
//            }
//            C = C3;
//            switch (C5){
//                case 0: O2 = "*"; break;
//                case 1: O2 = "/"; break;
//                case 2: O2 = "%"; break;
//                case 3: O2 = "+"; break;
//                case 4: O2 = "-"; break;
//            }


            try {
                System.out.print("i = ");
                i = in.nextDouble();
                System.out.print("j = ");
                j = in.nextDouble();
                if(i == -1){
                    throw new NumberFormatException();
                }
            }
            catch (Exception wrongnumber){
                System.out.print("index must be integer and in double range and i must not be -1");
                break;
            }
            try {
                System.out.print("n = ");
                n = in.nextInt();
                System.out.print("m = ");
                m = in.nextInt();
            }
            catch (Exception wrongnumber){
                System.out.print("numbers must be integer and in int range");
                break;
            }


            in.close();

            for (double a = i; a <= n; a++) {
                for (double b = j; b <= m; b++) {
                    try {
                        ans += (i * j) / (i + C);
                    }
                    catch (Exception dividingbyzero){
                        System.out.print("i must not be -1, dividingbyzero error");
                        return;
                    }
                }
            }

            System.out.printf("Answer is: %f \n", ans);
            break;
        }
    }
}
