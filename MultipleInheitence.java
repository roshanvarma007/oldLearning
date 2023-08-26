
//Multiple inheritence ke liye interface ka use karna padta hai

interface itServices{
  public void getItServicesDetails();
}

interface hardwearServices{
public void  getHardwearServicesDetails();
}

interface allBranch{
    public void getAllBranch();
}
class CompanyType implements itServices , hardwearServices , allBranch{
     public void getItServicesDetails() {
         System.out.println("Get IT Services Details");
    }

   public void getHardwearServicesDetails() {
       System.out.println("Get Hardwear Services");
    }

    public void getAllBranch() {
        System.out.println("Your all branch are here");
    }
}





public class MultipleInheitence {
    public static void main(String[] args) {

        CompanyType ct1 = new CompanyType();
        ct1.getItServicesDetails();
        ct1.getHardwearServicesDetails();
        ct1.getAllBranch();
    }
}
