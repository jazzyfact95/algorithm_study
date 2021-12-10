package study.algorithm.kijeong.p1205;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class kj_solution_3_1205 {
    public static void solution() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine(), " ");

            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st.nextToken());


            Arrays.sort(arr);
            int total = 0;
            int before = 0;

            for(int i = 0; i < n; i++) {
                total += before + arr[i];

                before += arr[i];
            }

            System.out.println(total);

            br.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
