package algo001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution230125_IntTriangle {
	
	public static void main(String[] args) {
		int[][] a = {{7}, {3, 8},{8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		System.out.println(solution( a   ));;
	}
	/***
	 DP�� ö��(?) : ��� �Ķ������ ���Ϻ����� ������ ����.  
	  �� �Ź� ��� ���ؾ��ϳ� !! 
	  
 ���� ���� �ﰢ���� ����⿡�� �ٴڱ��� �̾����� ��� ��,
  ���İ� ������ ���� ���� ū ��츦 ã�ƺ����� �մϴ�.
  >> ���İ� ���� �� ����ū���! 
   �Ʒ� ĭ���� �̵��� ���� �밢�� �������� �� ĭ ������
    �Ǵ� �������θ� �̵� �����մϴ�. 
    >> �밢�����θ� �̵�. �� ���ٴ����θ� �̵��ǰ�, ����2���ϰ���������. 
    ���� ��� 3������ �� �Ʒ�ĭ�� 8 �Ǵ� 1�θ� �̵��� �����մϴ�.
 >>  ���� ������ 3��  8 1 �� �̵��ȴ�.  ( �� idx �� +0 ~ +1 �� �̵������ϴ�. )  
	�ﰢ���� ������ ��� �迭 triangle�� 
	�Ű������� �־��� ��,
	 ���İ� ������ �ִ��� return �ϵ��� 
	 solution �Լ��� �ϼ��ϼ���.
	 */
	public static int solution(int[][] triangle) {

		int answer = 0;
		int depth = triangle.length;
		// ��ū��ã�� ���ϰ� //�׾Ʒ������� ��ū��ã�ƴ��ϰ�. 
		int aaa= triangle[0][0]+ triangle[1][0];
		int bbb= triangle[0][0]+ triangle[1][1];
		int ccc= Math.max(triangle[0][0]+ triangle[1][0], triangle[0][0]+ triangle[1][1]);
		System.out.println(depth);// 1~ 500  
		System.out.println(aaa);
		System.out.println(bbb);
		System.out.println(ccc);
		//int[][] a = {{7}, {3, 8},{8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};  
		// int[][] b = {{7}, {3, 8},{8, 1, 0}};
		int tempSum;
		int finalSum; 
        
		// ��ȭ���� �׷���  . ��� �� ä���� ���ص�. 
		int[][] temp = new int[triangle.length][triangle[triangle.length - 1].length];
        // ����� ��Ҵ� �����̾�. 
		temp[0][0] = triangle[0][0];

		
        for (int i = 1; i < triangle.length; i++) {
        	System.out.println("========" + i +"===============");
        	//1��ģ�� - ����������. 
        	temp[i][0] = temp[i - 1][0] + triangle[i][0];
        	System.out.println("ù:"+temp[i][0]);
            // N��ģ�� - �ʵ� ����������.  
        	temp[i][i] = temp[i - 1][i - 1] + triangle[i][i];
        	System.out.println("��:"+temp[i][i]);
            // 2������ ~  N-1��ģ������. �ʵ� max �� �����ص� ����(�Լ�ȭ) ��������. 
        	for (int j = 1; j <= i - 1; j++) {
        		
        		System.out.println(temp[i - 1][j - 1]);
        		System.out.println(temp[i - 1][j]);
        		int myMax = Math.max(temp[i - 1][j - 1], temp[i - 1][j]);
        		System.out.println(myMax);System.out.println(triangle[i][j]);
                temp[i][j] =  triangle[i][j] +  myMax;
                
                answer = Math.max(answer, temp[i][j]);
                System.out.println("----------------");
            }
        	
        }
		
		/*
========1===============
========2===============
10
15
========3===============
18
16
16
15
========4===============
20
25
25
20
20
19
30

		*/
		return answer;

	}
	
	
	
	
}
