package Day01;

public class _05_과제 {

	public static void main(String[] args) {
		
		
		 /* 문제1. 국어, 영어, 수학의 점수 합계와 평균을 출력하시오.
		 * 문제2. 조건 선택 연산자를 활용하여 평균이 80 이상이면 결과: 합격, 아니면 결과: 불합격 출력하시오.
		 */
		
		double a, b, c;
		a = 76.4;
		b = 55.3;
		c = 86.3;
		double sum = 0;
		double avg = 0;
		sum = a + b + c;
		avg = sum / 3;
		
		System.out.println("합계 점수는 " + sum + "점 입니다. 그리고 평균 점수는 " + avg + "점 입니다.");
		System.out.println((avg >= 80) ? "결과: 합격" : "결과: 불합격");
		System.out.println("결과: " + (avg >= 80 ? "합격" : "불합격"));
		
		// 위 조건 선택 연산자를 if 문으로 변경해보자
		
		if(avg >= 80) {
			System.out.println("결과: 합격");
		} else {
			System.out.println("결과: 불합격");
		}
		
	}

}
