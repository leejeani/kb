import java.util.HashSet;
import java.util.Random;

public class Hello {
	public static void main(String args[]) {
		System.out.println("Hello");
		int a = 10;
		int b = -10;
		System.out.printf("%d\n", a); // 10진수
		System.out.printf("%o\n", a); // 8진수
		System.out.printf("%x\n", a); // 16진수
		
		System.out.printf("%s\n",Integer.toBinaryString(a));
		System.out.printf("%s\n",Integer.toBinaryString(b));
		
		
		int aa = 0B00000000000000000000000000001010;
		int bb = 0B11111111111111111111111111110110;
		
		System.out.println(aa);
		System.out.println(bb);
		
		byte byt1 = 0B00001010;
		byte byt2 = (byte) 0B11110110;
		
		System.out.println(byt1);
		System.out.println(byt2);
		
		double d = 1.0/3;
		System.out.println(d);
		
		float f = 1.0f/3;
		System.out.println(f);
		
		System.out.printf("%10.2f\n",5.8);
		
		Random r = new Random();
		
		HashSet<Integer> h = new HashSet<Integer>();
		while(h.size() < 6) {
			int num = r.nextInt(45) + 1;
			//System.out.println(num);
			h.add(num);	
		}
		System.out.println(h.toString());
		int ww= 10;
		int hh= 20;
		double result = Math.pow(ww,2)+Math.pow(hh,2);
		System.out.println(result);

	}
}
