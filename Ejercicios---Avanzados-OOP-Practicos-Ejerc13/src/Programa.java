import java.util.Calendar;
import java.util.Date;

public class Programa {



    public static void main(String[] args) {



//        public class JavaGetTodaysDateNow
//        {
//
//            public static void main(String[] args)
//            {
//                // create a calendar instance, and get the date from that
//                // instance; it defaults to "today", or more accurately,
//                // "now".
//                Date today = Calendar.getInstance().getTime();
//
//                // print out today's date
//                System.out.println(today);
//            }
//
//        }

        Date today = Calendar.getInstance().getTime();


        Visit visit1 = new Visit("Lucas",today);

        visit1.setCustomer("Gold");
        visit1.setServiceExpense(1000);
        visit1.setProductExpense(1000);







        System.out.println(visit1.getTotalExpense());


        System.out.println(visit1.getTotalExpenseDis());





    }




}
