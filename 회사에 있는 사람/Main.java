//  회사에 있는 사람

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int entryHistroy = Integer.parseInt(br.readLine());
        Set<String> result = new HashSet<>();

        while (entryHistroy-- > 0) {
            StringTokenizer log = new StringTokenizer(br.readLine(), " ");
            String name = log.nextToken();
            String status = log.nextToken();

            if (status.equals("enter")) {
                result.add(name);
            } else if (status.equals("leave")) {
                result.remove(name);
            }
        }

        List<String> sortResult = new ArrayList<>(result);
        sortResult.sort(Collections.reverseOrder());

        for (String name : sortResult) {
            System.out.println(name);
        }
    }
}