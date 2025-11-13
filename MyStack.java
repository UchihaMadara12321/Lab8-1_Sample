import java.util.ArrayList;

public class MyStack<E> {

    private ArrayList<E> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    // 放入堆疊 (頂端 = list 最後面)
    public void push(E item) {
        list.add(item);
    }

    // 取出堆疊頂端
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }

    // 查看堆疊頂端（不移除）
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    // 堆疊大小
    public int size() {
        return list.size();
    }

    // 是否為空
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
