import java.util.Scanner; 
import java.util.LinkedList;



public class hw4 {

    public static void main(String[] args) {
        LinkedList<String[]>storage = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[]strings = input.split(" ");


        Scanner s = new Scanner(System.in);
        String inputs = s.nextLine();
        for (int i = strings.length-1; i > -1; i--) {
            System.out.print(strings[i] + " ");
        }
        LinkedList.removeLast();
        System.exit(0);

            s.close();

    }
}

 
        
