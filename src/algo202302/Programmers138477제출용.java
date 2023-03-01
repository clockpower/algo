package algo202302;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Programmers138477����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrr = { 1, 3, 2, 5, 4, 5, 2, 3 };
		System.out.println("anser: " + solution(6, arrr));
	}

	public static int solution(int k, int[] tangerine) {
		int answer = 0;

		// ��Ȯ �ϴ� �� ������ ����� �޶�����.
		// "���δٸ�����" �� �ּ�ȭ�ϴ� ���.

		// Map ������ �Ѷ��Ѷ� ��� .
		HashMap<Integer, Integer> myMap = new HashMap<>();
		for (int i : tangerine) {
			if (myMap.keySet().contains(Integer.valueOf(i))) {
				Integer currVar = myMap.get(Integer.valueOf(i)) + 1;
				myMap.put(Integer.valueOf(i), currVar);
			} else {
				// �ű԰��̸�
				myMap.put(Integer.valueOf(i), 1);
			}
		}

		// keySet ���� �ϳ��� �� ū���� �� �����̶� while �ٱ��� ���� .
		// Set<Integer> mapSet = myMap.keySet();

		// keySet ����ٷ��̿��� �ִ���� ���� - ����(idx)
		// �ϳ��� ������. set.remove(obj)

		ArrayList<Integer> list = new ArrayList<>(myMap.keySet());

		
		
		// list -map �ѳ���鼭 sorting �� �ٽ�
		list.sort((o1, o2) -> myMap.get(o2) - myMap.get(o1));
		// ������������

		// answer ����
		int i = 0;
		while (k > 0) {
			k -= myMap.get(list.get(i));
			answer++;
			i++;
		}

		return answer;
	}

}
