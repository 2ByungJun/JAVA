package d_Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue
 * 1. 먼저 들어간 자료가 먼저 나오는 구조 FIFO(First In FIrst Out) 구조 
 * 2. 큐는 한 쪽 끝은 프런트(front)로 정하여 삭제 연산만 수행함
 * 3. 다른 한 쪽 끝은 리어(rear)로 정하여 삽입 연산만 수행함  
 * 4. 그래프의 넓이 우선 탐색(BFS)에서 사용
 * 5. 컴퓨터 버퍼에서 주로 사용, 마구 입력이 되었으나 처리를 하지 못할 때, 버퍼(큐)를 만들어 대기 시킴
 */

public class d_Queue {
    
    
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>(); //int형 queue 선언, linkedlist 이용
        
        queue.add(1);       // queue에 값 1 추가
        queue.add(2);       // queue에 값 2 추가
        queue.offer(3);     // queue에 값 3 추가

        System.out.println(queue.size());

        queue.poll();       // queue에 첫번째 값을 반환하고 제거 비어있다면 null
        queue.remove();     // queue에 첫번째 값 제거
        queue.clear();      // queue 초기화

        System.out.println(queue.size());
        
        queue.offer(1);     // queue에 값 1 추가
        queue.offer(2);     // queue에 값 2 추가
        queue.offer(3);     // queue에 값 3 추가
        queue.peek();       // queue의 첫번째 값 참조

        System.out.println(queue.size());
    }
}
