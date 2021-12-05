package study.algorithm.kijeong.p1205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class kj_solution_1_1205 {
    public static void solution() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int k = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[k];

            st = new StringTokenizer(br.readLine());

            for(int i = 0; i < k; i++)
                arr[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);
            System.out.println(arr[n - 1]);
            br.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
