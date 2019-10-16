public class DiscountRate {

    private static double serviceDiscountPremiun=0.2;
    private static double serviceDiscountGold=0.15;
    private static double serviceDiscountSilver=0.1;
    private static double productDiscountPremiun=0.1;
    private static double productDiscountGold=0.1;
    private static double productDiscountSilver=0.1;

    public static double getServiceDiscountRate(String type){

        if(type.equals("Gold") || type.equals("gold")){

            return serviceDiscountGold;

        }else if(type.equals("Silver") || type.equals("gold") ){

            return serviceDiscountSilver;

        }else if(type.equals("Premiun") || type.equals("gold") ){

            return serviceDiscountPremiun;
        }

        return 0 ;
    }

    public static double getProductDiscountRate(String type){

        if(type.equals("Gold") || type.equals("gold")){
            return productDiscountGold;

        }else if(type.equals("Silver") || type.equals("silver")){

            return productDiscountSilver;

        }else if(type.equals("Premiun") || type.equals("premium")){

            return productDiscountPremiun;
        }

        return 0 ;

    }





}
