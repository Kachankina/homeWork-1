
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner; 



public class hw3 {

    public static void main(String[] args) {
        List<String> allEl = new ArrayList<>();
        allEl.add("string");
        allEl.add("40");
        allEl.add("-5");
        allEl.add("my_string");
        
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        ListIterator<String> iter = allEl.listIterator();
        while(iter.hasNext()){
            iter.next();
            iter.remove();
            if (iter.hasNext()) {
                iter.next();
            }
         System.out.println(allEl);
           
    }

    }
     

 // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
    Scanner scan = new Scanner(System.in);{
        while (true) {
            String line = scan.nextLine();
            try {
                int num = Integer.parseInt(line);
                    for(Iterator<String> iter = allEl.iterator(); iter.hasNext(); ) {
                        Object o = iter.next();
                            if ((o instanceof Integer) && (Integer) o == num) {
                                allEl.remove(o); break;
                             }
                    }
            } catch (Exception ex) {
                char c = line.charAt(0);
                for(Iterator<Object> iter = allEl.iterator(); iter.hasNext(); ) {
                    Object o = iter.next();
                        if ((o instanceof Character) && (Character) o == c) {
                            allEl.remove(o); break;
                        }
                    }
            }
        }
    }
}
