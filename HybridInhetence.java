//Hybrid Inheritence , we are using two type of inhetence at ones

interface ownCompany{
    public void getOwnCompany();

}
class BaseCompany implements ownCompany{
    void getBasECompanyDetails(){
        System.out.println("Base compnay printed");
    }

    public void getOwnCompany() {
        System.out.println("Main Company of base company");
    }
}
class chieldCompany extends BaseCompany{

}

class LocalCompany extends chieldCompany{

}

class SharedCompany extends BaseCompany{

}



public class HybridInhetence {
    public static void main(String[] args) {
       LocalCompany lc = new LocalCompany();
       lc.getBasECompanyDetails();
       SharedCompany sc = new SharedCompany();
       sc.getBasECompanyDetails();
       sc.getOwnCompany();
    }
}
