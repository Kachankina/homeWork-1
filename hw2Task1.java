 public class hw2Task1 {
    public static void main(String[] args) {

        char[] tc = {'a', 'b'};
            int len = 20;
            char[] buf = new char[len];
     
            for ( int i = 0; i < len; ++i )
                buf[i] = tc[i & 1];
            
            System.out.println(new String(buf));
        }
 }
    
    
        
        
        
     // 1 Дано четное число N (>0) и символы c1 и c2.
    // Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
    
    // Пример. (n = 6, c1='a', c2='b') -> "ababab"
    // (n = 8, c1='x', c2='y') -> "xyxyxyxy"   
        
        
    
