class FizzBuzz {
    private int n;
    private int current = 1;  
    public FizzBuzz(int n) {
        this.n = n;
    }
    interface MyIntConsumer {
        void accept(int x);
    }
    public synchronized void fizz(Runnable printFizz) throws InterruptedException {
        while (current <= n) {
            while (current <= n && (current % 3 != 0 || current % 5 == 0)) {
                wait(); 
            }
            if (current > n) break;  
            printFizz.run();     
            current++;              
            notifyAll();           
        }
    }
    public synchronized void buzz(Runnable printBuzz) throws InterruptedException {
        while (current <= n) {
            while (current <= n && (current % 5 != 0 || current % 3 == 0)) {
                wait(); 
            }
            if (current > n) break; 
            printBuzz.run();        
            current++;               
            notifyAll();             
        }
    }
    public synchronized void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (current <= n) {
            while (current <= n && current % 15 != 0) {
                wait();  // Wait if the number is not divisible by 15
            }
            if (current > n) break;  
            printFizzBuzz.run();     
            current++;             
            notifyAll();             
        }
    }
    public synchronized void number(MyIntConsumer printNumber) throws InterruptedException {
        while (current <= n) {
            while (current <= n && (current % 3 == 0 || current % 5 == 0)) {
                wait();  // Wait if the number is divisible by 3 or 5
            }
            if (current > n) break;  
            printNumber.accept(current); 
            current++;                  
            notifyAll();                 
        }
    }
}
