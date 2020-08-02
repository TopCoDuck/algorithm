package findpath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * BOJ#2098 ���ǿ� ��ȸ
 * https://www.acmicpc.net/problem/2098
 */

public class Main {

    static int N;
    static int[][] W = new int[16][16];

    static final int INF = 100000000;
    static final int SOURCE = 0;
    static final int NOT_CONNECTED = 0;
    static final int NOT_VISITED = -1;

    // dp[N][B] : ���� N �������� B�� ���� �������� �湮���� ��, ������ �������� �湮 �� ���������� ���ư��� �ּ� cost
    static int[][] dp = new int[16][1 << 16];

    static {

        for (int i = 0; i < 16; i++) {

            Arrays.fill(dp[i], NOT_VISITED);
        }
    }

    public static void main(String[] args) throws IOException {

        // input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {

                W[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // solve, ������ & ������ : 0
        System.out.println(solve(SOURCE, 1 << SOURCE));
    }

    static int solve(int cur, int B) {

        // memoization
        if (dp[cur][B] != NOT_VISITED) return dp[cur][B];

        // ���� ����, ��� ������ �湮�ϰ� ������(0)���� �ǵ��ư��� �ϴ� ���
        if (B == (1 << N) - 1) {

            return dp[cur][B] = W[cur][SOURCE] != NOT_CONNECTED ? W[cur][SOURCE] : INF;
        }

        // ���� ����
        dp[cur][B] = INF;
        for (int i = 0; i < N; i++) {

            // �� �� ���ų�, �湮�ߴ� �����̶��
            if (W[cur][i] == NOT_CONNECTED || (B & (1 << i)) > 0) continue;

            dp[cur][B] = Math.min(dp[cur][B], solve(i, B | (1 << i)) + W[cur][i]);
        }

        return dp[cur][B];
    }
}