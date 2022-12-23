package ru.itis.lab13;
public class StackImpl implements IStack {

    private Object[] data;
    private int count = 0;
    private int len = 10;
    public StackImpl() {
        data = new Object[len];
    }
    public Object pop() {
        Object tmp = data[count - 1];
        data[count - 1] = null;
        count--;
        return tmp;
    }
    public void push(Object o) {
        // контролируем длину массива
        if (count + 1 > len ) {
            len  = len + (len / 2);
            Object[] tmp = new Object[len];
            System.arraycopy(data, 0, tmp, 0, count);
            data = tmp;
        }
        data[count++] = o;
    }
}