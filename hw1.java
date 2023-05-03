
// public class hw1 {

//     /**
//      * @param args
//      */
//     public static void main(String[] args) {
//         int[][] arr = new int[3][3];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
//                 if (i == j || i == x) arr[i][j] = 1;
//                 else arr[i][j] = 0;
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.print("\n");
//         }
//     }
// }
//  *
//  * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//  * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).

    
    //        printArrayInConsole(changeArray(13));
    // }
    //     printArrayInConsole(invertArrayVar1(10));
    // }


//         printArrayInConsole(retLenArr(6, 2));
//     }
        
        
    
        //     System.out.println(isLeapYear(1223));
    // }

    //     System.out.println(isSumBetween10And20(5, 15)); // true
    //     System.out.println(isSumBetween10And20(7, 15)); // false
    //     System.out.println(isSumBetween10And20(2, 6)); // false
    // }
    //     System.out.println(isPositive(5)); // true
    //     System.out.println(isPositive(-3)); // false
    // }
    //     printString("abcd", 5); // abcdabcdabcdabcdabcd
    // }
           
        // int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        // int x = array[2][3];
    
    
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    // private static boolean isSumBetween10And20(int a, int b) {
    //     int s = a + b;
    //     return (10 <= s) && (s <= 20);
    // }
        // проверить, что сумма a и b лежит между 10 и 20
        // return false;
    // }
    
    // private static boolean isPositive(int x) {
        // проверить, что х положительное
         
        // return (x >= 0);
    // }

    
//     private static void printString(String source, int repeat) {
//         // напечатать строку source repeat раз
//         for (int i = 1; i <= repeat; i++){
//             System.out.println("[" + repeat + "]" + source);

//             }
//         }
// }
    
//     private static boolean isLeapYear(int year) {
//         // проверить, является ли год високосным. если да - return true
//         // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
//         if (year % 400 == 0){
//             return true;
//         } else if (year % 100 == 0) {
//             return false;
//         } else {
//             return year % 4 == 0;
//         }
       
//     }
// }
//     public static int[] retLenArr (int len, int initialValue){
//         int arr[] = new int[len];
//         for (int i = 0; i < arr.length; i++){
//             arr[i] = initialValue;
//         }
//         return arr;
//     }
    
//     private static void printArrayInConsole(int[] inputArray) {
//         for (int i = 0; i < inputArray.length; i++) {
//             System.out.print(inputArray[i] + " ");
//         }
//         System.out.println();
//     }

// }


    
    //     // должен вернуть массив длины len, каждое значение которого равно initialValue
    //     return null;
    // }

//     1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//  * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        // private static int [] invertArrayVar1(int len) {
        //     int arr [] = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; 
        //     for (int i = 0; i < arr.length; i++) {
        //         if(arr[i] == 1){
        //             arr[i] = 0;
        //         }
        //         else{
        //             arr[i] = 1;
        //         }
        //     }  
        //     return arr;
        // }


        // private static void printArrayInConsole(int[]invertArrayVar1 ) {
        //             for (int i = 0; i < invertArrayVar1.length; i++) {
        //                 System.out.print(invertArrayVar1[i] + " ");
        //             }
        //             System.out.println();
        //         }
            
        // }
    



//  *
//  * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

//         private static int [] changeArray(int len) {
//             int arr [] = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//             for (int i = 0; i < arr.length; i++) {
//                  if (arr[i] < 6) {
//                      arr[i] *= 2;
//                     }

//                 }
//             return arr;
//         }
           
//         private static void printArrayInConsole(int[]changeArray) {
//             for (int i = 0; i < changeArray.length; i++) {
//                 System.out.print(changeArray[i] + " ");
//             }
//             System.out.println();
//         }
    
// }
        



    
        

    




//  * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
//  * * Также заполнить элементы побочной диагонали
//  */