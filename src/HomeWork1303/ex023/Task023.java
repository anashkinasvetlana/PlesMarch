package HomeWork1303.ex023;

public class Task023 {
    public static void main(String[] args) {

        String[] num = {"dog","cat","bird",null,"pig","deer"};
        int x = num.length;
        for (int i=1;i<x;i=i+2) {
            if (num [i]==null) {
                break;
            }
            System.out.printf(" i = " +num[i]);
        }
        }
    }