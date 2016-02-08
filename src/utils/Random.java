package utils;

/**
 * 生成随机数组
 *
 * Created by Bowen on 2016-02-09.
 */
public class Random {

    public static void Strings(int length,Comparable[] a){
        for (int i = 0;i<length;i++){
            a[i] = String.valueOf(Math.random());
        }
    }

}
