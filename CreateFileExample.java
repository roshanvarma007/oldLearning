import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample {  //file create code
//    public static void main(String[] args) throws IOException {
//        File myFile = new File("apple.txt");
//        myFile.createNewFile();   //now add above exception handling
//
//        if(myFile.createNewFile()){
//            System.out.println("File has created");
//        }else {
//            System.out.println("File adready exist");
//        }
//    }

    //file write code

    public static void main(String[] args) {
        try{
            FileWriter myFileWritter = new FileWriter("appleW.txt");
            myFileWritter.write("thid id apple txt file");
            myFileWritter.close();
        }catch (Exception e){
            System.out.println("some error" + e);
        }
    }
}
