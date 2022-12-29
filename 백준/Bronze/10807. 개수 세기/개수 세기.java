import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// buffer reading
        StringTokenizer st;

        int count = 0;
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i ++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());

        for (int j = 0; j<n; j++) {
            if(numbers[j] == v) {
                count ++;
            }
        }
        System.out.println(count);
    }
}