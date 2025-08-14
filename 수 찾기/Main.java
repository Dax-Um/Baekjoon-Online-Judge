//  수 찾기

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder stringBuilder = new StringBuilder();

        for(int j = 0; j < M; j++) {
            int v = Integer.parseInt(st.nextToken());
            stringBuilder.append(Arrays.binarySearch(A, v) >= 0 ? 1 : 0).append("\n");
        }

        System.out.print(stringBuilder.toString());
    }
}