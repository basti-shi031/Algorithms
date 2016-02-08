package sort;

import sort.base.BaseSort;
import utils.L;
import utils.Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 选择排序
 * <p>
 * 选择排序的原理：
 * <p>
 * 1. 首先找到最小的元素
 * 2. 将它和数组的第一元素交换位置
 * 3. 在剩下的元素中找到最小的元素，与第二个元素交换位置
 * 4. 如此往复，直到将这个数组排序完成
 * <p>
 * 之所以叫做选择排序，因为算法不断在选择剩余元素的最小者
 * <p>
 * Created by Bowen on 2016-02-08.
 */
public class SelectionSort extends BaseSort {

    @Override
    public void sort(Comparable[] a) {
        super.sort(a);

        int length = a.length;

        for (int i = 0; i < length; i++) {

            int minIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (less(a[j], a[minIndex])) {
                    minIndex = j;
                }
            }
            exch(a, minIndex, i);
        }
    }

    @Override
    public boolean less(Comparable first, Comparable second) {
        return super.less(first, second);
    }

    @Override
    public void exch(Comparable[] a, int i, int j) {
        super.exch(a, i, j);
    }

    @Override
    public void show(Comparable[] a) {
        super.show(a);
    }

    @Override
    public boolean isSorted(Comparable[] a) {
        return super.isSorted(a);
    }

    public static void main(String[] args) throws IOException {

/*        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");*/


        SelectionSort selectionSort = new SelectionSort();
        /*selectionSort.sort(a);
        selectionSort.show(a);
        L.l(String.valueOf(selectionSort.isSorted(a)));*/

        //随机生成
        for (int i = 0;i<10;i++){
            String[] a = new String[10];
            Random.Strings(10,a);
            selectionSort.sort(a);
            selectionSort.show(a);
            L.l(String.valueOf(selectionSort.isSorted(a)));

        }
    }
}
