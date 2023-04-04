
public class Threading {
	  private int count = 0;
	    private Object lock = new Object();

	    public void incrementCount() {
	        count++;
	    }

	    public synchronized void incrementCountSynchronized() {
	        count++;
	    }

	    public void incrementCountBlockSynchronized() {
	        synchronized (lock) {
	            count++;
	        }
	    }

	    public int getCount() {
	        return count;
	    }

	    public static void main(String[] args) throws InterruptedException {
	    	Threading demo = new Threading();
	    	
	        // Khởi tạo một luồng không có synchronized
	        Thread t1 = new Thread(() -> {
	            long start = System.currentTimeMillis();
	            for (int i = 0; i < 1000000; i++) {
	                demo.incrementCount();
	            }
	            long end = System.currentTimeMillis();
	            System.out.println("Thread 1 without non synchronization: " + (end - start) + "ms");
	        });

	        // Khởi tạo một luồng sử dụng synchronized trên phương thức
	        Thread t2 = new Thread(() -> {
	            long start = System.currentTimeMillis();
	            for (int i = 0; i < 1000000; i++) {
	                demo.incrementCountSynchronized();
	            }
	            long end = System.currentTimeMillis();
	            System.out.println("Thread 2 with method synchronization: " + (end - start) + "ms");
	        });

	        // Khởi tạo một luồng sử dụng synchronized trên block
	        Thread t3 = new Thread(() -> {
	            long start = System.currentTimeMillis();
	            for (int i = 0; i < 1000000; i++) {
	                demo.incrementCountBlockSynchronized();
	            }
	            long end = System.currentTimeMillis();
	            System.out.println("Thread 3 with block synchronization: " + (end - start) + "ms");
	        });

	        t1.start();
	        t2.start();
	        t3.start();

	        t1.join();
	        t2.join();
	        t3.join();

	        System.out.println("Count without synchronization: " + demo.getCount());
	        System.out.println("Count with method synchronization: " + demo.getCount());
	        System.out.println("Count with block synchronization: " + demo.getCount());
	    }
}
