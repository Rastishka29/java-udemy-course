package com.yuliiak;
import com.yuliiak.SumOddRange;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(SumOddRange.sumOdd(1,100));
        System.out.println(SumOddRange.sumOdd(-1,100));
        System.out.println(SumOddRange.sumOdd(100,100));
        System.out.println(SumOddRange.sumOdd(13,13));
        System.out.println(SumOddRange.sumOdd(100,-100));
        System.out.println(SumOddRange.sumOdd(100,1000));

    }
}