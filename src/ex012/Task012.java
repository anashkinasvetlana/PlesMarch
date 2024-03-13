package ex012;
//Перемножить числа от 1 до числа (включительно) введенного через аргумент
// к исполняемой программе Метод рекурсии
public class Task012 {
    public static void main(String[] args) {
        System.out.println(sum(5));
        }
        static int sum(int n){
            if(n==1) return 1;
            return n * sum(n-1);
        }
    }
