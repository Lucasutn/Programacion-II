public class Employee {

    private int id;
    private String firstName;
    private String lastNme;
    private int salary;


    public Employee(int id, String firstName, String lastNme, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastNme = lastNme;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNme() {
        return lastNme;
    }

    public String getName(){
        return getFirstName()+ " " + getLastNme();
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return this.salary*12;
    }

    public int raiseSalary(int percent){

        return ((this.salary*percent)/100)+this.salary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastNme='" + lastNme + '\'' +
                ", salary=" + salary +
                ']';
    }
}
