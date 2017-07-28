package com.brianway.learning.java.base;


/**
 * Created by brian on 16/11/10.
 *
 * TODO 琛ョ爜/鍙嶇爜鐩稿叧鐭ヨ瘑
 * https://www.cnblogs.com/zhangziqiu/archive/2011/03/30/ComputerCode.html
 * http://weihe6666.iteye.com/blog/1190033
 *
 * 鍦ㄨ绠楁満涓紝璐熸暟浠ュ師鐮佺殑琛ョ爜褰㈠紡琛ㄨ揪銆� */
public class Binary {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        System.out.println(i + ~j);

        int[] arr = new int[] {3, -2};
        for (int a : arr) {
            //鍘熸暟
            System.out.println("a:" + a + "  HELO" + Integer.toBinaryString(a));
            // 鎸変綅鍙栧弽
            System.out.println("~a:" + ~a + "  WOLD" + Integer.toBinaryString(~a));
            // 鐩稿弽鏁�            System.out.println("-a:" + -a + "  浜岃繘鍒�" + Integer.toBinaryString(-a));

            System.out.println(-a == ~a + 1);
            System.out.println(~a == -a - 1);
        }

    }
}
