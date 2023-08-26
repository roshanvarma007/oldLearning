//java 5 ke baad introduce hua tha
// ye allow karta hai method ko override karne me
//return type differnt hai fir covariat ka use karte hai
//niche return type ist ki user hai 2nd ki clint

class reUsre{
   reUsre login (){
        System.out.println("login in user");
        return this;
    }
}
class cLinet extends reUsre{
  cLinet  login (){
        System.out.println("Clint login");
        return this;
    }
}
public class CovarinatWithJava {
    public static void main(String[] args) {
        cLinet c1 = new cLinet();
        c1.login();
    }
}
