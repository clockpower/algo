package algo001;

import java.util.Arrays;
import java.util.List;

public class Solution230116 {
	public static void main(String[] args) {
		System.out.println(minPartitions("27346209830709182346"));
	}
	public static int minPartitions(String n) {
		 // �ٽ��� deci binary �� ���� ������ ���ʿ� ���� �����ٴ°�. 
        // 1�� 0 ���� �����Ǿ��ְ�  0�̳� 1 ���°��� �����Ӵٴ°�.
        // 32�� �ƴ϶� 29�� �����غ���.  11 11 + 1,1,1,1,1,1,1 �� 
        // 10^5 �ڸ� ���� �ϴ���,  �� �ڸ����߿��� ���� ū ����ŭ��
        // deci binary �� �ִٸ�,  ǥ���� �����ϴٴ� ��п� �̸��� 
        // ���̵�� ��ü�� �����̴�.  
        int maxNum = -1;
		List<String> strArr = Arrays.asList(n.split(""));
		for (String t : strArr) {
			maxNum = Math.max(maxNum, Integer.parseInt(t));
			
		}
		return maxNum;
    }
}




