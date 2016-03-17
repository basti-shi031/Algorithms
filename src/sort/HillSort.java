package sort;

import sort.base.BaseSort;
import utils.L;

import java.io.IOException;

/**
 * 希尔排序
 * <p>
 * Created by Bowen on 2016-02-11.
 */
public class HillSort extends BaseSort {

    public static void main(String[] args) throws IOException {
        String[] a = {"S", "H", "E", "L", "L", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};

        HillSort hillSort = new HillSort();
        hillSort.sort(a);
        hillSort.show(a);
        L.l(String.valueOf(hillSort.isSorted(a)));
    }

    @Override
    public void sort(Comparable[] a) {
        super.sort(a);
        int N = a.length;
        int h = 1;
        while (h < N / 3) h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
