package algo001;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Solution230124_baek2178 {
		/**\
		N��Mũ���� �迭�� ǥ���Ǵ� �̷ΰ� �ִ�.

1	0	1	1	1	1
1	0	1	0	1	0
1	0	1	0	1	1
1	1	1	0	1	1
�̷ο��� 1�� �̵��� �� �ִ� ĭ�� ��Ÿ����, 0�� �̵��� �� ���� ĭ�� ��Ÿ����.
 �̷��� �̷ΰ� �־����� ��, (1, 1)���� ����Ͽ� 
 (N, M)�� ��ġ�� �̵��� �� ������ �ϴ� �ּ��� ĭ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
  �� ĭ���� �ٸ� ĭ���� �̵��� ��, ���� ������ ĭ���θ� �̵��� �� �ִ�.

���� �������� 15ĭ�� ������ (N, M)�� ��ġ�� �̵��� �� �ִ�. 
ĭ�� �� ������ ���� ��ġ�� ���� ��ġ�� �����Ѵ�.

		 */
		static int[][] map;
		//�����¿�
		static int[][] direction = {{-1,0},{1,0},{0,-1},{0,1}};
		static int n;
		static int m;
		static boolean[][] visited;

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			/*  N M ������ �ޱ� */
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			/*  �̷ιޱ�  */
			map = new int[n][m];
			for(int i=0; i<n; i++) {
				System.out.println("LINE:"+i);
				String s = br.readLine();
				for(int j=0; j<m; j++) {
					map[i][j] = s.charAt(j) - '0';
					//System.out.println(map[i][j]);
				}
			}
			/*  ��湮�� üũ�� > �������� ALL false   */
			visited = new boolean[n][m];
			//System.out.println(visited[0][0]);
			// �ϰ͵� ���� �� 
			visited[0][0] = true;
			bfs(0, 0);// ���� 
			System.out.println(map[n-1][m-1]);
		}

		public static void bfs(int x, int y) {
			// ť���� 
			Queue<int[]> myQueue = new LinkedList<>();
			myQueue.add(new int[] {x,y});
			//������� - ť���ִ� ���� �������
			while(!myQueue.isEmpty()) {
				int now[] = myQueue.poll();// ť�� �� �հ� �����Ͷ� 
				System.out.println(Arrays.toString(now));
				int nowX = now[0];
				int nowY = now[1];
				
				for(int i=0; i<4; i++) {//4���
					int nextX = nowX + direction[i][0];
					int nextY = nowY + direction[i][1];
					//��ġ�� ����
	                if (
	                		(nextX >= 0 && nextY >= 0 && nextX < n && nextY < m)
	                		&&  !visited[nextX][nextY]
	                				&&   map[nextX][nextY] != 0
	                				) {
	    		        //��ǥ°�� add 
	    		        myQueue.add(new int[] {nextX, nextY});
	    		        // Ƚ��
	    		        // Max 1��ĭ - 100 * 100  
	    		        
	    		        map[nextX][nextY] = map[nowX][nowY] + 1; 
	            		visited[nextX][nextY] = true;
	                }


				}
			}
		}
	}
