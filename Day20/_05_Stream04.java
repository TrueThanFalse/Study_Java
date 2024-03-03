package Day20;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class _05_Stream04 {

	public static void main(String[] args) {
		
		/* Student 클래스를 가지는 List 생성
		 * 5명 정도 학생 입력
		 */
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student("홍길동", 95));
		list.add(new Student("송지효", 47));
		list.add(new Student("유재석", 23));
		list.add(new Student("양세찬", 66));
		list.add(new Student("이광수", 70));
		
		// Student 클래스에 ToString이 있을 경우 가능
		list.stream().forEach(System.out::println);
		System.out.println("-----");
		list.stream().forEach(n-> System.out.println(n+" "));
		
		// toString이 없을 경우
		// 처리 구문이 많으면 {} 중괄호 필요
		list.stream().forEach(n-> {
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name+":"+score);
		});
		
		System.out.println("-----");
		
		// 성적 합계 출력

		int sum = list.stream().mapToInt(n-> n.getScore()).sum();
		OptionalDouble avg = list.stream().mapToInt(n-> n.getScore()).average();
		System.out.println(sum);
		
		System.out.println("-----");
		
		// 점수가 70점 이상인 인원 수 출력
		Long cnt = list.stream().filter(n-> n.getScore() >= 70).count();
		Long cnt2 = list.stream().mapToInt(n-> n.getScore()).filter(a-> a>=70).count();
		System.out.println(cnt);
		System.out.println(cnt2);
		

	}

}
