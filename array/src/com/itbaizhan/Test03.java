package com.itbaizhan;

import java.util.Arrays;

/**
 * 数组的拷贝
 */
public class Test03 {
    public static void main(String[] args) {
        String[] a = {"阿里","尚学堂","京东","搜狐","网易"};
        String[] b = new String[6];

        System.arraycopy(a,0,b,0,a.length);

        for(String temp:b) {
            System.out.println(temp);
        }

    }
}
