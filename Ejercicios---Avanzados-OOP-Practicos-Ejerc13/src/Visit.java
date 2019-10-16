import java.util.Date;

public class Visit {

    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;


    public void setCustomer(String memberType){


        this.customer.setMemberType(memberType);


        if(this.customer.getMemberType().equals(null)){
            this.customer.setMember(false);
        }else{

            this.customer.setMember(true);

        }



    }

    public Visit(String name, Date date) {
        this.date = date;
        this.customer= new Customer(name);
    }


    public String getName() {

        return this.customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getServiceExpenseDisc() {


        return this.serviceExpense-(DiscountRate.getServiceDiscountRate(this.customer.getMemberType())*this.serviceExpense);
    }

    public void setServiceExpense(double ex) {
        this.serviceExpense = ex ;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public double getProductExpenseDisc() {

        if(this.customer.isMember()){
            return this.productExpense-(this.productExpense*0.1);//Verifico si el cliente es miembro o no, si es miembro 10% de descuento
        }

        return productExpense;
    }

    public void setProductExpense(double ex) {
        this.productExpense = ex;
    }

    public double getTotalExpense(){

        return getProductExpense()+getServiceExpense();

    }

    public double getTotalExpenseDis(){

        return getProductExpenseDisc()+getServiceExpenseDisc();

    }


    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                "} " + super.toString();
    }
}
