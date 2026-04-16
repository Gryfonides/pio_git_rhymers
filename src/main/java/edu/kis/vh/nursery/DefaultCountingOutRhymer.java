package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int ERROR = -1;
    private final int[] NUMBERS = new int[SIZE];

    private int total = -1;

    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean callCheck() {
        return total == -1;
    }

    protected boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return NUMBERS[total];
    }

    protected int countOut() {
        if (callCheck())
            return ERROR;
        return NUMBERS[total--];
    }

    public int getTotal() {
        return total;
    }
}