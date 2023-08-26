

class Empl{
    String name;
    String houseNumb;
    String city;
    String country;

    public Empl(String name,String houseNumb,String city,String country){
        this.name = name;
        this.houseNumb = houseNumb;
        this.city = city;
        this.country = country;
    }

    public void displayDetails(){
        System.out.println(this.name);
        System.out.println(this.houseNumb+ " " +this.city+ " " + this.country);
    }
}



public class AggregationExample {
    public static void main(String[] args) {
        Empl e1 = new Empl("Raam","Raghav418","Ayodhya","India");
        e1.displayDetails();
    }
}
