class rational{

    private int numerator;
    private int denominator;

    public rational(int n1, int d1){
        this.numerator = n1;
        this.denominator = d1;
    }

    public static rational add(rational r1, rational r2){
        rational toReturn = new rational((r1.numerator*r2.denominator)+(r2.numerator*r1.denominator), r1.denominator*r2.denominator);
        return toReturn;
    }

    public static rational difference(rational r1, rational r2){
        rational toReturn = new rational((r1.numerator*r2.denominator)-(r2.numerator*r1.denominator), r1.denominator*r2.denominator);
        return toReturn;
    }

    public static int calculatePGCD(int a, int b){
        int reste = 0;
        reste = a % b;
        if(reste != 0){
        return calculatePGCD(b,reste);
        }
        else{
            return java.lang.Math.abs(b);
        }
    }

    public static rational divideByPGCD(rational r3, int pgcd){
        r3.numerator = r3.numerator/ pgcd;
        r3.denominator = r3.denominator/ pgcd;
        return r3;
    }


    /*@Override
    String toString(rational r3){
        System.out.println(r3.numerator + "/" + r3.denominator);
    }*/

    public static void  show (rational r3){
        System.out.println(r3.numerator + "/" + r3.denominator);
    }

    public static void main (String[] args){
        int n1 = 0;
        int d1 = 0;
        int n2 = 0;
        int d2 = 0;
        int pgcd = 0;

        try{

            String[] firstRational = args[0].split("/");
            String operator = args[1];
            String[] secondRational = args[2].split("/");

            n1 = Integer.parseInt(firstRational[0]);
            d1 = Integer.parseInt(firstRational[1]);
            n2 = Integer.parseInt(secondRational[0]);
            d2 = Integer.parseInt(secondRational[1]);

            rational r1 = new rational(n1, d1);
            rational r2 = new rational(n2, d2);
            rational r3 = new rational(0, 0);

            if(operator == "-"){
                r3 = rational.difference(r1, r2);
            }
            else if(operator == "+"){
                r3 = rational.add(r1, r2);
            }

            pgcd = calculatePGCD(r3.numerator, r3.denominator);
            r3 = divideByPGCD(r3, pgcd);
            rational.show(r3);

        }
        catch(NumberFormatException e){
            System.out.println("Les arguments entrés ne sont pas valides !");
        }
    }
}