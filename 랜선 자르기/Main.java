//  랜선 자르기

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[K];
        long hi = 0;

        for(int i = 0; i < K; i++){
            int v = Integer.parseInt(br.readLine());
            arr[i] = v;
            if (v >= hi) {
                hi = v;
            }
        }

        long lo = 1;
        long ans = 0;

        while (lo <= hi) {
            long mid = lo + ((hi - lo) >>> 1);
            long pieces = 0;
            for (int len : arr) {
                pieces += (len / mid);
                if (pieces >= N) {
                    break;
                }
            }

            if (pieces >= N) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        System.out.println(ans);
    }
}