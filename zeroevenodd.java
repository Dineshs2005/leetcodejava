class ZeroEvenOdd {
    private int n;
    private int current = 1;  
    private boolean zeroTurn = true; 

    public ZeroEvenOdd(int n) {
        this.n = n;
    }
    public synchronized void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (!zeroTurn) {
                wait(); 
            }
            printNumber.accept(0);  
            zeroTurn = false;  
            notifyAll();  
        }
    }

    public synchronized void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            while (zeroTurn || current % 2 != 0) {
                wait(); 
            }
            printNumber.accept(current);  
            current++; 
            zeroTurn = true;
            notifyAll();  
        }
    }

    public synchronized void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            while (zeroTurn || current % 2 == 0) {
                wait();
            }
            printNumber.accept(current);  
            current++;  
            zeroTurn = true;  
            notifyAll();
        }
    }
}
