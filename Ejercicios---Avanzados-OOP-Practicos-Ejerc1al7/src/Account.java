public class Account {

    private String id;
    private String name;
    private int balance=0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    //Consultar en clases, si asi era la aplicaicon del metodo, el cual modifica balance dentro del objeto, despues de la suma con ammont
    // Preguntar lo mismo para el metodo debit.


    public int credit(int amount){

        balance=balance+amount;

        return balance;
    }

    public int debit(int amount){

        if(amount<=balance){
            balance=balance-amount;
        }else{
            System.out.println("Amount exceeded balance");
        }

        return balance;
    }

    public int transferTo(Account another,int amount){

        if(amount<=balance){

            another.credit(amount);
            balance=balance-amount;

        }else{
            System.out.println("Amount exceeded balance");
        }

        return balance;

    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }
}
