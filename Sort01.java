package com.Array1D;


import java.util.Arrays;

public class Sort01 {

    //do not take any extra space and consider time in o(n) will be the best to solve this questions
    public static void main(String[] args) {
    int a [] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
  //  countAllOne(a);
        WithONTimeComplexity(a);
    }

    /**
     *  Logic Implemented -  Two Pointer approached
     *  Take a first at 0 and second at last, now compare the values
     *  3 conditions have to take care of
     *  if s ==1 and e == 0 then swap it
     *  else if, you have to do if s == 0 , s++
     *  else if, if e == 1 , e--
     *  Time   - o(n)
     *  Space  - o(1)
     */
    public static void WithONTimeComplexity(int [] a) {
        int s = 0;
        int e =  a.length-1;
        while(s <= e) {
            if( a[s] == 1 && a[e] == 0) {
                //swap it
                int temp =  a[s];
                a[s] = a[e];
                a[e] = temp;
                s++ ;
                e--;
            }
            else if (a[s] == 0) {
                s++;
            }
            else if( a[s] == 1){
                e--;
            }

        }
        Arrays.stream(a).forEach(x-> System.out.println(x));
    }



    /**
     * Count all 1
     * Make the whole array as 0
     * Now insert the one from the last index to the counted 1
     * Time  -- o(n) + o(n) + o(n-c) == o(n)
     * Space -- o(1)
     */
    public static void  countAllOne(int a[]) {
        Arrays.stream(a).forEach(x-> System.out.print(x));
        System.out.println();
        int totalOne = 0;
        long count = Arrays.stream(a).filter(x -> x == 1).count();
        a = Arrays.stream(a).map(x-> x=0).toArray();
        int c = (int) count;
        for ( int i = a.length - c ; i < a.length ;i++){
            a[i] = 1;
        }
        Arrays.stream(a).forEach(x-> System.out.print(x));
    }

}
