package com.itbaizhan;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[ ] values = { 3, 1, 6, 2, 9, 0, 7, 4, 8, 5 };
        bubbleSort(values);
        System.out.println(Arrays.toString(values));
    }

    public static void bubbleSort(int[ ] values) {
        int temp;   //用于交换的临时变量    3,1,6,2,9,0,7,4,8,5
        // 定义一个布尔类型的变量，标记数组是否已达到有序状态
        boolean flag = true;
        System.out.println("开始前,数组:"+Arrays.toString(values));
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    //本趟发生了交换，表明该数组在本趟处于无序状态，需要继续比较；
                    flag = false;
                }
                System.out.println("第"+i+"趟:第"+j+"次:"+Arrays.toString(values));
            }
            //根据标记量的值判断数组是否有序，如果有序，则退出；无序，则继续循环。
            if (flag) {
                System.out.println("结束循环！");
                break;
            }else{
                flag = true;   //重置回原值！
            }
            //打印，第i趟比较完后的数组。
            System.out.println("第"+i+"趟完成后:"+Arrays.toString(values));
        }
    }
}
