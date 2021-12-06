package practice;

import java.util.HashMap;

public class Java_HomeWork {

    public java.util.HashMap<String, Integer> wordO(String[] str) {
        java.util.HashMap<String, Integer> hashMap = new java.util.HashMap<>();
        for (String arr: str){
            if(!hashMap.containsKey(arr)) {
                hashMap.put(arr, 0);
            }

        }
        return hashMap;
    }

    public java.util.HashMap<String, Integer> WordLen(String[] str) {
        java.util.HashMap<String, Integer> hashMap = new HashMap<>();
        for (String arr: str){
            if(!hashMap.containsKey(arr)) {
                hashMap.put(arr, arr.length());
            }

        }
        return hashMap;
    }

    public int[] fizzArray(int n){
        int[] array = new  int[n];
        if(n==0){
            return array;
        }
        for (int i=0; i < n; i++){
            array[i] =i;
        }
        return array;
    }

    public int countHi(String str){
        int counter = 0;
        for (int i= 0; i< str.length()-1; i++){
            String name = str.substring(i, i+2);
            if(name.equals("hi")){
                counter++;
            }
        }
        return counter;
    }

    public int loanSum( int a, int b, int c){
        int sum = 0;
        if(a != b && a!=c){
            sum +=a;
        }
        if(b != c && b!=a){
            sum +=b;
        }
        if(c != b && c!=a){
            sum +=c;
        }
        return sum;
    }

    public int[] arrayFirstElement(int[] a, int[] b){
        return new int[]{a[0], b[0]};
        }

         public int[] arrayMiddle(int[] a){  //[1,2,3,4]=[2,3]
             int  middleIndex = a.length/2;
             return new int[]{ a[middleIndex -1], a[middleIndex]};
        }

        public int arraySummation(int [] a){
            int sum = 0;
            for (int result : a) {
                sum += result;
            }
            return  sum;
        }





}
