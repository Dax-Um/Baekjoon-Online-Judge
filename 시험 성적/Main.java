//  시험 성적

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    /* 87ms */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int score = sc.nextInt();
//        String result = "";
//        if (score >= 90 && score <= 100) {
//            result = "A";
//        } else if (score >= 80) {
//            result = "B";
//        } else if (score >= 70) {
//            result = "C";
//        } else if (score >= 60) {
//            result = "D";
//        } else if (score >= 0){
//            result = "F";
//        }
//        System.out.println(result);
//    }

    /* 61ms */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        String result = "";

        if (score >= 90 && score <= 100) {
            result = "A";
        } else if (score >= 80) {
            result = "B";
        } else if (score >= 70) {
            result = "C";
        } else if (score >= 60) {
            result = "D";
        } else if (score >= 0){
            result = "F";
        }
        System.out.println(result);
    }
}