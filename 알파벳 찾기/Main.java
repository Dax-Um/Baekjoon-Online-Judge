//  알파벳 찾기

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        StringBuilder result = new StringBuilder();

        for(char c = 'a'; c <= 'z'; c++) {
            result.append(word.indexOf(c)).append(" ");
        }

        System.out.println(result.toString());
    }
}