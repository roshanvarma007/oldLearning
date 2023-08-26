
class Company{
   void getTotalManpower(){
        System.out.println("Total Manpower is 10000");
    }
}

class CountryBranch extends Company{
    void totalManPCountry(){
        System.out.println("Total Country Man Power are 1000");
    }
}

class LocalBrach extends CountryBranch{
    void totalManPower(){
        System.out.println("Total Local Branch Employe are 1000");
    }
}

public class MultiLevalInheritence {
    public static void main(String[] args) {
        LocalBrach lb = new LocalBrach();
        lb.totalManPower();
        lb.totalManPCountry();
        lb.getTotalManpower();

        System.out.println("Here Are new object we are calling");
        CountryBranch cb = new CountryBranch();
        cb.totalManPCountry();
        cb.getTotalManpower();
    }
}
