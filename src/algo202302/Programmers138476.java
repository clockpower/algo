package algo202302;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Programmers138476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrr = {1, 1, 1, 1, 2, 2, 2, 3};
		System.out.println("anser: "+solution(2,arrr));
	}
	
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // ��Ȯ �ϴ� �� ������ ����� �޶�����. 
        //  "���δٸ�����" �� �ּ�ȭ�ϴ� ���. 
        //  
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
                
        
        Set<Integer> mapSet = myMap.keySet();
        System.out.println("k :"+k );
        System.out.println("mapSet :"+mapSet );
        System.out.println("true?"+ (k > 0) );
        while (k > 0) {
        	LinkedList<Integer> list = new LinkedList<>();
        	Integer maxIdx = 0;
        	Integer compared = 1;
        	
			for (Integer i : mapSet) {
				System.out.println("i:"+i);
				list.add(myMap.get(i));
					System.out.println("���Ѵ�.");
					System.out.println(compared+"compared. "+myMap.get(compared));
					System.out.println(i+"get(i). "+myMap.get(i));
					if( myMap.get(compared) <= 
							myMap.get(i)) {						
						maxIdx = i;
					}						
				
				compared = i;
				
				System.out.println("compared:"+compared);
				System.out.println("maxIdx:"+maxIdx);
			}
			//������������
			k = k- myMap.get(maxIdx);
			mapSet.remove(maxIdx);		
			System.out.println("last k? :"+k);
			System.out.println("removedmapset:"+mapSet);
			answer++;
			
		}
        
        //��ȸ�� ����, �ִ� ���� ������ Ű����� QUEUE�� �Է� 
        
        
        // tangerine �迭�� �ϴ� ���� �Ѵ�. 
        // map  ( key - val ) ������ ( Integer, Integer)        
        // update ���ش�.
        //  set ������ �־������. 
        // 
        
        
        
        
        
        
        return answer;
    }
	

}
