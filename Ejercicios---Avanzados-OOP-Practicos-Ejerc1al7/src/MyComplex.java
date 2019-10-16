public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;


    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }


    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real,double imag){

        setReal(real);
        setImag(imag);

    }

    //ToString Consultar en clases, no estoy seguro del formato en el cual se debe imprimir el mensaje

    @Override
    public String toString() {
        return "(" + real +
                "+" + imag +
                "i)";
    }


    public boolean isReal(){
        if(imag==0){
            return true;
        }
        return false;
    }

    public boolean isImaginary(){


        if(real==0){
            return true;
        }
        return false;

    }

   public boolean equals(double real, double imag){

            return real==this.real && imag==this.imag;

   }

/*import com.google.gson.Gson;


Object a = // ...;
Object b = //...;
String objectString1 = new Gson().toJson(a);
String objectString2 = new Gson().toJson(b);

if(objectString1.equals(objectString2)){
    //do this
}*/

    public boolean equals(MyComplex another) {



        return this.real==another.getReal() && this.imag==another.getImag();

    }

    //https://introcs.cs.princeton.edu/java/32class/Complex.java.html
    /* // return abs/modulus/magnitude
    public double abs() {
        return Math.hypot(re, im);
    }

    // return angle/phase/argument, normalized to be between -pi and pi
    public double phase() {
        return Math.atan2(im, re);
    }*/

   public double magnitude(){

       return Math.hypot(this.real,this.imag);

   }

   public double argument(){


       return Math.atan2(this.imag,this.real);
   }

   


   public MyComplex add(MyComplex right){

        this.real+=right.getReal();
        this.imag+=right.getImag();

        return this;
   }

   public MyComplex addNew(MyComplex right){



   return new MyComplex(this.real+right.getReal(),this.imag+right.getImag());

   }

   public MyComplex subtract(MyComplex right){

       this.real-=right.getReal();
       this.imag-=right.getImag();

       return this;

   }

   public MyComplex subtractNew(MyComplex right){


       return new MyComplex(this.real-right.getReal(),this.imag-right.getImag());

   }

   public MyComplex multiply(MyComplex right){

       this.real*=right.getReal();
       this.imag*=right.getImag();

       return this;

   }

   public MyComplex divide(MyComplex right){
       this.real/=right.getReal();
       this.imag/=right.getImag();

       return this;
   }

   public MyComplex conjugate(){

        if(this.imag<0){
            this.imag=imag-imag-imag;
        }

        return this;
   }


}
