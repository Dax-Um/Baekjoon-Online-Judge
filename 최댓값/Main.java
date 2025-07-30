//  최댓값

import java.lang.System;
import java.lang.String;
import java.lang.Integer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        int count = 0;
        String raw;

        while ((raw = br.readLine()) != null && !raw.isEmpty()) {
            int v = Integer.parseInt(raw);
            if(v > max) {
                max = v;
                maxIndex = count;
            }
            count++;
        }

        System.out.println(max);
        System.out.println(maxIndex + 1);
    }
}