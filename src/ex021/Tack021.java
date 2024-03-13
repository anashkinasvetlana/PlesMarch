package ex021;
//Перебрать все элементы массива вывести их в консоль
// при помощи do....while, while, for, foreach
public class Tack021 {
    public static void main(String[] args) {
       /* int[] array = new int[] { 1, 2, 3, 4, 5};
        System.out.println("Foreach: ");
        for (int numb: array) {
            System.out.println(numb);
        }*/
  /*      int[] arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println("DoWhile: ");
        int x = 5;
        do {
            x--;
            System.out.println(x);
        }
        while (x >= 5);


    } */
       /* int[] array = new int[] { 1 ,2 ,3 ,9 ,6 };
        System.out.println("For: ");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
      }*/
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println("While: ");
        int x = 5;
        while (x <= 5) {
        x++;}
        System.out.println(x);
    }
}
