package homeWorks_first;

import java.util.Arrays;

public class HomeWork_first {

    public void run() {
        int[] arr = {1, 3, 1, 5, 7, 7, 3, 2, 5, 7};
        System.out.println(Arrays.toString(this.calculate(arr)));
    }

    public int[] calculate(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        int[] count = new int[max + 1];
        for (int num : arr) {
            count[num]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[index++] = i;
            }
        }
        return arr;
    }
}
