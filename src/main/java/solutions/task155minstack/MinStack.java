package solutions.task155minstack;

import java.util.Arrays;

public class MinStack {
    private int size;
    private int[] array;

    public MinStack() {
        this.array = new int[0];
        this.size = 0;
    }

    public void push(int val) {
        if (size == 0) {
            int[] newArray = new int[1];
            this.array = newArray;
            array[0] = val;
            size++;
        } else {
            int[] newArray = new int[size + 1];
            System.arraycopy(this.array, 0, newArray, 0, size);
            this.array = newArray;
            array[size] = val;
            size++;
        }
    }

    public void pop() {
        if (size > 0) {
            int[] newArray = new int[size - 1];
            System.arraycopy(this.array, 0, newArray, 0, size - 1);
            this.array = newArray;
            size--;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int top() {
        if (size > 0) {
            return this.array[size - 1];
        }
        throw new IndexOutOfBoundsException();
    }

    public int getMin() {
        return Arrays.stream(this.array).summaryStatistics().getMin();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */