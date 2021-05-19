import java.util.ArrayList;

public class Sorting {


    public void sort(ArrayList<Integer> arr, int n) {
        for (int i = 0; i < n; i++) {
            int pos = i;
            for (int j = i; j < n; j++) {
                if (arr.get(j) < arr.get(pos)) {
                    pos = j;
                }
            }
            // store the current min value in variable
            int min = arr.get(pos);
            //swap
            arr.set(pos, arr.get(i));
            arr.set(i, min);
        }
    }
}