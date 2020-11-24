import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 자바에는 크게 Vector, ArrayList, LinkedList, CopyOnWriteArrayList 리스트를 가지고 있다.
 * 
 * CopyOnWriteArrayList 
 * - 내부를 변경하는 작업은 항상 깨끗한 복사본을 만들어 수행 - 내부의 배열은 절대 수정되지 않아
 * 락이 없어 빠름 - 수정할 일이 드물고 순회만 빈번히 일어나는 Observer리스트용으로 성능 좋음
 * 
 * @param <E>
 */
public class c_CopyOnWriteArrayList<E> {
    
    private final List<SetObserser<E>> observers = new CopyOnWriteArrayList<>();

    public void addObserver(SetObserver<E> observer) {
        observers.add(observer);
    }

    public boolean removeObserver(SetObserver<E> observer) {
        return observers.remove(observer);
    }

    public void notifyElementAdded(E element) {
        for (SetObserver<E> observer : observers) {
            observers.added(this, element);
    }
}

}
