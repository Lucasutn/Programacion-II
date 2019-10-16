import java.util.Calendar;

public class MyDate {

    private int year;
    private int month;
    private int day;

    private static String[] strMonths={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

    private static String[] strDays={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    private static int[] daysMonths={31,28,31,30,31,30,31,31,30,31,30,31};



//Explicacion matematica https://www.disfrutalasmatematicas.com/medida/anos-bisiestos.html

    //Los años bisiestos son los divisibles entre 4 (como 2004, 2008, etc.)

    //excepto si es divisible entre 100, entonces no es bisiesto (como 2100, 2200, etc.)

    //excepto si es divisible entre 400, entonces sí (como 2000, 2400)

    public static boolean isLeapYear(int year){

        if(year%4==0){

            if(year%100==0){

                if(year%400==0){
                    return true;
                }else{
                    return false;
                }
            }else {
                return true;
            }
        }


        return false;

    }


// metodo de clase para verificar si es una fecha valida

    public static boolean isValidDate(int year,int month,int day){

        //Comprueba si es No año bisiesto

        if(!isLeapYear(year)){

            if(month>0 && month<=12){

                if(day<=daysMonths[month-1] && day >0){

                    return true;

                }else {
                    return false;
                }
            }else{
                return false;
            }

            //Si es año bisiesto entra al else, comprueba si es el mes de febrero
        }else if(month==2){

                  if(day<=29 && day >0){

                     return true;

                  }else {

                     return false;
                  }

            //en caso de que no sea mes de febrero

            }else if(month>0 && month<=12) {

            if (day <= daysMonths[month - 1] && day > 0) {

                return true;

                 }

            }

                  return false;

    }



//Utilizo la biblioteca calendar

    public static int getDayOfWeek(int year,int month, int day){

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.DAY_OF_MONTH,month);
        calendar.set(Calendar.DAY_OF_MONTH,day);

        return  calendar.get(Calendar.DAY_OF_WEEK);

        // para obtener el nombre en  lugar del numero DateFormatSymbols dfs = new DateFormatSymbols();
        //        System.out.println("Weekday: " + dfs.getWeekdays()[weekday numero del dia]);

    }

//Constructor

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


//Metodo para setter Full Date

    public void setDate(int year,int month,int day){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

//Getter & Setter

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


//ToString resuelto utilizando metodo getDayOfWeek y los arreglos de clases para obtener los string de dias y mes
    
    @Override
    public String toString() {
        return strDays[getDayOfWeek(year,month,day)-1] +
                " " + day +
                " " + strMonths[month-1] +
                " " + year;
    }

//Calendar calendar = Calendar.getInstance();
//calendar.add(Calendar.MONTH, 1);
//calendar.set(Calendar.DATE, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
//Date nextMonthFirstDay = calendar.getTime();
//calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
//Date nextMonthLastDay = calendar.getTime();

    public MyDate nextDay(){

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.DAY_OF_MONTH,day);

        calendar.add(Calendar.DAY_OF_MONTH,1);


        MyDate myFecha = new MyDate(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));

        return  myFecha;
    }

    public MyDate nextMonth(){

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.DAY_OF_MONTH,day);

        calendar.add(Calendar.MONTH,1);


        MyDate myFecha = new MyDate(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));

        return  myFecha;
    }

    public MyDate nextYear(){
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.DAY_OF_MONTH,day);

        calendar.add(Calendar.YEAR,1);


        MyDate myFecha = new MyDate(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));

        return  myFecha;
    }

    public MyDate previousDay(){
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.DAY_OF_MONTH,day);

        calendar.roll(Calendar.DAY_OF_MONTH,-1);


        MyDate myFecha = new MyDate(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));

        return  myFecha;
    }

    public MyDate previousMonth(){
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.DAY_OF_MONTH,day);

        calendar.roll(Calendar.MONTH,-1);


        MyDate myFecha = new MyDate(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));

        return  myFecha;
    }

    public MyDate previousYear(){
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.DAY_OF_MONTH,day);

        calendar.roll(Calendar.YEAR,-1);


        MyDate myFecha = new MyDate(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));

        return  myFecha;
    }


}
