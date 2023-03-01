package algo202302;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Programmers138477�����_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrr = {1, 1, 1, 1, 2, 2, 2, 3};
		System.out.println("anser: "+solution(2,arrr));
	}
	
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // ��Ȯ �ϴ� �� ������ ����� �޶�����. 
        //  "���δٸ�����" �� �ּ�ȭ�ϴ� ���. 
        
        
        //  Map ������ �Ѷ��Ѷ� ��� . 
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for (int i : tangerine) {
        	if(myMap.keySet().contains(Integer.valueOf(i))) {
        		Integer currVar = myMap.get(Integer.valueOf(i))+1;
        		myMap.put(Integer.valueOf(i), currVar);
        	}else {
        		//�ű԰��̸� 
        		myMap.put(Integer.valueOf(i), 1);
        	}        	
		}
                
        // keySet ���� �ϳ��� �� ū���� �� �����̶� while �ٱ��� ���� . 
        Set<Integer> mapSet = myMap.keySet();
        
        // keySet ����ٷ��̿��� �ִ���� ���� - ����(idx)
        //�ϳ��� ������.   set.remove(obj)
        while (k > 0) {
        	LinkedList<Integer> list = new LinkedList<>();
        	Integer maxIdx = 0;
        	Integer compared = 1;        	
			for (Integer i : mapSet) {
				list.add(myMap.get(i));
					if( myMap.get(compared) <= 
							myMap.get(i)) {						
						maxIdx = i;
					}					
				compared = i;
			}
			//������������
			k = k- myMap.get(maxIdx);
			mapSet.remove(maxIdx);
			answer++;			
		}
        
        return answer;
    }
	

}
