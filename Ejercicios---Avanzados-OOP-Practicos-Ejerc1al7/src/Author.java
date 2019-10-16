public class Author {

    private String name;
    private String emaail;
    private char gender; /* en el enunciado dice "char of 'm' or 'f'" pero a su ves en un recuadro superior especifica "No defuault values for the variables"
                            se podria crear un arreglo de char y un metod para comprobar si 'm' o 'f' fue ingresado, CONSULTAR en clases*/


    public Author(String name, String emaail, char gender) {
        this.name = name;
        this.emaail = emaail;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmaail() {
        return emaail;
    }

    public void setEmaail(String emaail) {
        this.emaail = emaail;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name='" + name + '\'' +
                ", emaail='" + emaail + '\'' +
                ", gender=" + gender +
                ']';
    }

}
