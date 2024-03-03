package Day20;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _04_Stream03 {

	public static void main(String[] args) {
		
		/* 문제
		 * 배열에서 짝수만 출력(정렬)
		 */

		int[] arr = {5,6,1,2,4,7,8,9,3,2,4,7,8,8,6};
		
		// 1번 사용하면 없어지는 것이 스트림
		// 변수를 새로 생성할 필요성은 크게 없다
		IntStream arrStream = Arrays.stream(arr);
		
		
		Arrays.stream(arr)
		.distinct()
		.sorted()
		.filter(n-> n%2==0)
		.forEach(n-> System.out.print(n+" "));
		
		System.out.println();
		System.out.println("-----");
		
		arrStream // 사용되어 사라졌음.
		.sorted()
		.filter(n-> n%2==0)
		.forEach(System.out::print);
		
		System.out.println();
		System.out.println("-----");
		
		Arrays.stream(arr)
		.sorted()
		.filter(n-> n%2==1)
		.forEach(n-> System.out.print(n+" "));
		
		System.out.println();
		System.out.println("-----");
		
		// 배열로 리턴
		int result[] = Arrays.stream(arr).filter(n-> n%2==0)
				.sorted().distinct()
				.toArray(); // 배열로 리턴
		for(int tmp : result) {
			System.out.print(tmp+" ");
		}
		
		// reduce() : 계산
		// a = a*b, a = a-b ......
		int sum = Arrays.stream(arr).reduce(0, (a,b)-> a+b);
		System.out.println(sum);
		int mul = Arrays.stream(arr).reduce(1, (a,b)-> a*b);
		System.out.println(mul);
		int sum2 = Arrays.stream(arr).filter(n-> n%2==0).distinct().reduce(0, (a,b)-> a+b);
		System.out.println(sum2);
		
		
	}

}
