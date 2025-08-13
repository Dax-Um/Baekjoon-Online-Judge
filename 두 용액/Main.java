//  두 용액

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        // 입력(한 줄이 아닐 수도 있으니 안전하게)
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;

        long bestAbs = Long.MAX_VALUE; // 최소 |sum|
        int ansL = arr[left], ansR = arr[right];

        while (left < right) {
            long sum = (long) arr[left] + arr[right];
            long curAbs = Math.abs(sum);

            if (curAbs < bestAbs) {
                bestAbs = curAbs;
                ansL = arr[left];
                ansR = arr[right];
                if (bestAbs == 0) break;
            }

            if (sum < 0) {
                left++;     // 합을 키워야 0에 가까워짐
            } else {
                right--;    // 합을 줄여야 0에 가까워짐
            }
        }

        // 문제 요구: 두 값을 오름차순으로 출력
        if (ansL <= ansR) {
            System.out.println(ansL + " " + ansR);
        } else {
            System.out.println(ansR + " " + ansL);
        }
    }
}