package practice;
import java.util.*;

public class binary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
            //System.out.println(toFullBinaryString(scanner.nextInt()));
            int res = scanner.nextInt();
            String str = Integer.toBinaryString(res);
            System.out.println(str);
        }

	}

}
