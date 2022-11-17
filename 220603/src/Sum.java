
public class Sum {
    public static void main(String[] args) {
    	int[] a = {1,3,10,2,8};
    	//int[] b = new int[] {1, 3, 10, 2, 8};
    	int sum =0;
    	int max = a[0];//초기화
    	int search = 2; //그냥 2가 있는 인덱스를 찾는다.
    	int find = -1;  //찾다가 없으면 -1 그대로
    	
    	for(int i=0; i<a.length;i++) {
    		if(search == a[i]) {
    			find = i;
    			System.out.println("찾는 " + search + "값은 " + find + "번째 인덱스에 있습니다.");
    		}
    	}
    	
    	for(int i=0; i<a.length;i++) {
    		sum += a[i];
    		if(max < a[i]) {
    			max = a[i];
    		}
    	}
    	    	
//    	for(int c:a) {
//    		sum += c;
//    		if(max<c) {
//    			max = c;
//    		}
//    	}
    	
    	System.out.println("Max값 = " + max);
    	
    	
    	float avg = (float) sum / a.length;
    	System.out.println("Sum = " + sum);
    	System.out.println("Avg = " + avg);
    	
    	
    	
//    	int[] c;
//    	c = new int[] {2,5,4};
//    	System.out.println(c);
    	
//    	int[] a = null;
//    	System.out.println(a);
//    	String[] b = {};
//    	System.out.println();
//    	System.out.println(b);
//    	System.out.println(b.length);
    }
}
