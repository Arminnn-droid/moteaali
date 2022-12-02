public class Main {
    public static void main(String[] args) {
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

        for(double x= 0; x<=k; x++){
            double formulaRez = 4;
            res = res + res;
        }
    }
}