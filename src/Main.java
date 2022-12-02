/*

                   ArminMalekMohammadiBidhendi     39912330117022    The encrypt decrypt practice

 */

public class Main {
    public static void main(String[] args) {
        double k = 20;
        double x = 14;
        final  double pi = 3.14;
        double tetta = 0;
        double radian = (tetta/180)*pi;


        // sin!
        System.out.println("Sin! | " + Math.sin(radian) + " | " + k + " | " + macSin(tetta,k));

        //cos!
        System.out.println("Cos! | " + Math.cos(radian) + " | " + k + " | " + macCos(tetta,k));

        //ln(x)
        System.out.println("Ln! | " + Math.log(x) + " | " + k + " | " + macLn(x,k));


    }
    public static double fact(double number){
        double res = 1;
        if (number> 1){
            for(double x = 1; x <= number; x++){
                res *=  x;
            }
        }

        return res;
    }

    public static double macSin(double tetta, double k){
        double res = 0;
        final  double pi = 3.14;
        double radian = (tetta/180)*pi;

        for(double n= 0; n<=k; n++){
            double formulaRez = (Math.pow(-1, n))*((Math.pow(radian,(2*n)+1)/
                                                   (fact((2*n)+1))));
            res += formulaRez;
        }

        return res;
    }

    public static double macCos(double tetta, double k){
        double res = 0;
        final  double pi = 3.14;
        double radian = (tetta/180)*pi;

        for(double n= 0; n <= k; n++) {
            double formulaRes = ((Math.pow(-1,n))*(Math.pow(radian,2*n))/
                                                  (fact((2*n))));

            res += formulaRes;
        }


        return res;
    }

    public static double macLn(double x, double k){
        double res = 0;

        for(double n = 1; n <= k; n++){
            double formulaRes = (Math.pow((x-1),n)/n)*Math.pow(-1, n+1);
            res += formulaRes;
        }

        return res;
    }
}