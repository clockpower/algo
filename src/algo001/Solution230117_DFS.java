package algo001;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution230117_DFS {
	public static void main(String[] args) {
		int[] ar = {5,0,1,2,3,4};
		System.out.println(Arrays.toString(buildArray(ar)));
	}
    public static int[] buildArray(int[] nums) {
        // �����κ��� �迭�� �����ϱ� 
        // ���� �迭 NUMS �� �޾Ƽ� >  �� ��° �ε����� �� �迭�� �籸���ϴ°�. 

        //The elements in nums are distinct. 

        /* ��Ʈ ���� �Ѵٸ� .  */
        // ���� ���縦 �Ѵ�?  ���� ���� 
        int[] copynums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
			copynums[i] = nums[nums[i]];
		}
        return copynums;
        
    }
}




