import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class performanceCollection {
	    public static void main(String[] args) {
	        int n = 1000000; // số lượng phần tử trong collection
	        long startTime, endTime, duration;

	        // Test ArrayList
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        startTime = System.nanoTime();
	        for (int i = 0; i < n; i++) {
	            arrayList.add(i);
	        }
	        endTime = System.nanoTime();
	        duration = endTime - startTime; // thời gian thêm phần tử vào ArrayList
	        System.out.println("ArrayList add: " + duration);

	        startTime = System.nanoTime();
	        arrayList.remove(n/2); // xóa phần tử ở giữa ArrayList
	        endTime = System.nanoTime(); 
	        duration = endTime - startTime;  // thời gian xóa phần tử vào ArrayList
	        System.out.println("ArrayList remove: " + duration);

	        startTime = System.nanoTime();
	        arrayList.contains(n/2);  // tìm kiếm phần tử ở giữa ArrayList
	        endTime = System.nanoTime();
	        duration = endTime - startTime; // thời gian tim kiếm phần tử  ArrayList
	        System.out.println("ArrayList contains: " + duration);
	        
	     // Test HashSet
	        HashSet<Integer> hashSet = new HashSet<>();
	        startTime = System.nanoTime();
	        for (int i = 0; i < n; i++) {
	            hashSet.add(i);
	        }
	        endTime = System.nanoTime();
	        duration = endTime - startTime; // thời gian thêm phần tử vào HashSet
	        System.out.println("HashSet add: " + duration);

	        startTime = System.nanoTime();
	        hashSet.remove(n/2); // xóa phần tử ở giữa HashSet
	        endTime = System.nanoTime();
	        duration = endTime - startTime;   // thời gian xóa phần tử vào HashSet
	        System.out.println("HashSet remove: " + duration);

	        startTime = System.nanoTime();
	        hashSet.contains(n/2);
	        endTime = System.nanoTime();
	        duration = endTime - startTime; // thời gian tim kiếm phần tử  HashSet
	        System.out.println("HashSet contains: " + duration);
	         
	        
	        // Test HashMap
	        HashMap<Integer, Integer> hashMap = new HashMap<>();
	        startTime = System.nanoTime();
	        for (int i = 0; i < n; i++) {
	            hashMap.put(i, i);
	        }
	        endTime = System.nanoTime();
	        duration = endTime - startTime; // thời gian thêm phần tử vào HashMap
	        System.out.println("HashMap put: " + duration);

	        startTime = System.nanoTime();
	        hashMap.remove(n/2); // xóa phần tử ở giữa HashMap
	        endTime = System.nanoTime();
	        duration = endTime - startTime; // thời gian xóa phần tử vào HashMap
	        System.out.println("HashMap remove: " + duration);

	        startTime = System.nanoTime();
	        hashMap.containsKey(n/2);  // tìm kiếm giá trị phần tử ở giữa
	        endTime = System.nanoTime();
	        duration = endTime - startTime; // thời gian tim kiếm phần tử  HashMap
	        System.out.println("HashMap containsKey: " + duration);

	    }
}
