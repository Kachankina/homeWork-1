
import java.io.File;


public class hw2Task2 {

    public static void main(String[] args) {
        try{
            
        
            String path="C:\\Users\\User\\java\\file.txt";
            File file = new File(path);

            
            if (!file.exists()) {
                file.createNewFile();
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}