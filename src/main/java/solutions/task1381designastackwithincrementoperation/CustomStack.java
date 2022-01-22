package solutions.task1381designastackwithincrementoperation;

public class CustomStack {
    private int size = 0;
    private final int maxSize;
    private int[] list;

    public CustomStack(int maxSize) {
        this.list = new int[maxSize];
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (size + 1 <= maxSize) {
            list[size] = x;
            size++;
        }
    }

    public int pop() {
        if (size == 0) {
            return -1;
        } else {
            int temp = list[size - 1];
            --size;
            return temp;
        }
    }

    public void increment(int k, int val) {
        if (k > size) {
            k = size;
        }

        for (int i = 0; i < k; i++) {
            list[i] = list[i] + val;
        }
    }

    public int getSize() {
        return size;
    }

    public int getMaxSize() {
        return maxSize;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */