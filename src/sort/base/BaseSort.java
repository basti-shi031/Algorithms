package sort.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Bowen on 2016-02-08.
 */
public class BaseSort {

    //排序
    public void sort(Comparable[] a) {
    }

    //比较
    public boolean less(Comparable first, Comparable second) {
        return first.compareTo(second) < 0;
    }

    //交换
    public void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    //打印
    public void show(Comparable[] a) {
        for (Comparable item : a) {
            System.out.println(item + " ");
        }
    }

    //检查是否有序
    public boolean isSorted(Comparable[] a) {

        int length = a.length;

        for (int i = 1; i < length; i++) {
            if (less(a[i], a[i + 1])) {
                return true;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");

    }
}
