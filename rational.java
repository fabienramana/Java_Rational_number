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

    /*@Override
    String toString(rational r3){
        System.out.println(r3.numerator + "/" + r3.denominator);
    }*/

    public static void  show (rational r3){
        System.out.println(r3.numerator + "/" + r3.denominator);
    }

    public static void main (String[] args){
        int argc = args.length;
        if(argc == 4){
            int n1 = 0;
            int d1 = 0;
            int n2 = 0;
            int d2 = 0;

            try{

                n1 = Integer.parseInt(args[0]);
                d1 = Integer.parseInt(args[1]);
                n2 = Integer.parseInt(args[2]);
                d2 = Integer.parseInt(args[3]);

                rational r1 = new rational(n1, d1);
                rational r2 = new rational(n2, d2);
                rational r3 = new rational(0, 0);

                r3 = rational.add(r1, r2);
                rational.show(r3);

            }
            catch(NumberFormatException e){
                System.out.println("Les arguments entrés ne sont pas valides !");
            }
        }else{
            System.out.println("Le nombre d'arguments est incorrect");
        }
    }
}