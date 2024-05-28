package kr.or.ddit.basic;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationTest {
	public static void main(String[] args) {
		
		System.out.println("static 변수값 : "+printAnnotation.id);
		
		// reflection API 이용한 메서드 정보 접근하기
		// 선언된 메서드 목록 가져오기
		///메서드 정보 접근해서 그뒤에 어노테이션정보에 접근할거다
		Method[] methodArr = Service.class.getDeclaredMethods();
		///아마 세번째 방법 쓰고 그 뒤에 메서드 가저온거같다
		
		for (Method m : methodArr) {
			
			System.out.println(m.getName()); //메서드명 출력...
			
			Annotation[] annos = m.getAnnotations();
			///여러개가 있을 수 있기때문에 배열로 받는다
			for (Annotation anno : annos) {
				if (anno.annotationType().getSimpleName().equals("printAnnotation")) {
					
					printAnnotation printAnno = (printAnnotation) anno;
					
					for (int i = 0; i < printAnno.count(); i++) {
						System.out.print(printAnno.value()); // count 수만큼 value값 출력...
					}
				}
			}
			System.out.println(); // 줄바꿈 처리
			
		}
		
	}
}
