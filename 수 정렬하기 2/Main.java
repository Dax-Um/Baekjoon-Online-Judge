//  수 정렬하기 2

import java.util.Arrays;
import java.lang.System;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /* Counting Sort 672ms */
        boolean[] arr = new boolean[2000001];

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]) {
                sb.append((i - 1000000)).append('\n');
            }
        }

        System.out.print(sb);


        /* Array sort (Dual-Pivot Quicksort)
        int count = Integer.parseInt(br.readLine());
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            int value = Integer.parseInt(br.readLine());
            numbers[i] = value;
        }

        Arrays.sort(numbers);

        StringBuilder result = new StringBuilder();
        for (int value: numbers) {
            result.append(value).append("\n");
        }

        /*
        1356ms
        System.out.print(result);

        1468ms
        System.out.println(result.toString());

        4930ms
        for (int output: numbers) {
            System.out.println(output);
        }
         */
    }
}