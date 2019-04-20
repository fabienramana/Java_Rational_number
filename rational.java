class rational{

    private int numerator;
    private int denominator;

    public rational(int n1, int d1){
        this.numerator = n1;
        this.denominator = d1;
    }

    public static void main(String[] args){
        int argc = args.length;
        if(argc == 4){
            int n1 = 0;
            int d1 = 0;
            int n2 = 0;
            int d2 = 0;

            try{
                int numerator1;
                int numerator2;
                int denominator;

                n1 = Integer.parseInt(args[0]);
                d1 = Integer.parseInt(args[1]);
                n2 = Integer.parseInt(args[2]);
                d2 = Integer.parseInt(args[3]);

                numerator1 = n1*d2;
                numerator2 = d1*n2;
                denominator = d1*d2;

                StringBuilder s = new StringBuilder();
                s.append(numerator1 + numerator2);
                s.append("/");
                s.append(denominator);
                System.out.println(s);

            }
            catch(NumberFormatException e){
                System.out.println("Les arguments entrés ne sont pas valides !");
            }
        }else{
            System.out.println("Le nombre d'arguments est incorrect");
        }
    }
}