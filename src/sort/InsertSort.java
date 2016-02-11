package sort;

import sort.base.BaseSort;
import utils.L;
import utils.Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 插入排序
 * <p>
 * 插入排序原理
 * 1. 讲一个元素插入到其他已经有序的队列中
 * 2. 为了给插入的元素腾出空间，其余所有的元素在插入之前都向右移动一位
 * <p>
 * 与选择排序一样，当前索引左边的所有元素都是有序的，但它们的最终位置还不确定，为了给更小的元素腾出空间，它们可能会被移动，
 * 当索引值到达数组右端时，数组排序就完成了
 * Created by Bowen on 2016-02-09.
 */
public class InsertSort extends BaseSort {

    public static void main(String[] args) throws IOException {

        /*BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");*/

        InsertSort insertSort = new InsertSort();
       /* insertSort.sort(a);
        insertSort.show(a);
        L.l(String.valueOf(insertSort.isSorted(a)));*/

        //随机生成
        for (int i = 0; i < 10; i++) {
            String[] a = new String[10];
            Random.Strings(10, a);
            insertSort.sort(a);
            insertSort.show(a);
            L.l(String.valueOf(insertSort.isSorted(a)));

        }
    }

    @Override
    public void sort(Comparable[] a) {
        super.sort(a);

        int length = a.length;

        for (int i = 1; i < length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (less(a[i], a[j])) {
                    exch(a, i, j);
                    i = j;
                } else {
                    break;
                }
            }
        }

    }
}
