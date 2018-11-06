package com.queue;

/**
 * @author kouguangyuan
 * @date 2018/11/6 13:31
 */
public class MyCircularQueue {
    private int[] data;
    private int head;
    private int tail;
    private int size;

    /*
     * @author kouguangyuan
     * @date 2018/11/6 13:34
     * @param [k]
     * @return
     * @description Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }

    /*
     * @author kouguangyuan
     * @date 2018/11/6 13:35
     * @param [value]
     * @return boolean
     * @description  Insert an element into the circular queue.  Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull() == true) {
            return false;
        }
        if (isEmpty() == true) {
            head = 0;
        }
        tail = (tail + 1) % size;
        data[tail] = value;
        return true;
    }

    /*
     * @author kouguangyuan
     * @date 2018/11/6 13:48
     * @param []
     * @return boolean
     * @description Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }

    /*
     * @author kouguangyuan
     * @date 2018/11/6 13:40
     * @param []
     * @return int
     * @description Get the front item from the queue.
     */
    public int Front() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[head];
    }

    /*
     * @author kouguangyuan
     * @date 2018/11/6 13:41
     * @param []
     * @return int
     * @description Get the last item from the queue.
     */
    public int Rear() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[tail];
    }

    /*
     * @author kouguangyuan
     * @date 2018/11/6 13:39
     * @param []
     * @return boolean
     * @description Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return head == -1;
    }

    /*
     * @author kouguangyuan
     * @date 2018/11/6 13:39
     * @param []
     * @return boolean
     * @description Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }

    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为3

        System.out.println(circularQueue.enQueue(1));  // 返回true

        System.out.println(circularQueue.enQueue(2));  // 返回true

        System.out.println(circularQueue.enQueue(3));  // 返回true

        System.out.println(circularQueue.enQueue(4));  // 返回false,队列已满

        System.out.println(circularQueue.Rear());  // 返回3

        System.out.println(circularQueue.isFull());  // 返回true

        System.out.println(circularQueue.deQueue());  // 返回true

        System.out.println(circularQueue.enQueue(4));  // 返回true

        System.out.println(circularQueue.Rear());  // 返回4
    }
}
