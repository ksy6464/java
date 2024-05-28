package kr.or.ddit.reflect;

import java.lang.reflect.Modifier;

public class T02ClassMetadataTest {
	public static void main(String[] args) {
		// 클래스 오브젝트 생성하기
		/// 하기 위해서 밑에 작성하기 전에 SampleVO 작성해야한다
		/// 세번째 방법 사용
		Class<?> clazz = SampleVO.class;
		
		System.out.println("심플클래스명 : "+clazz.getSimpleName());
		System.out.println("클래스명 : "+clazz.getName());
		System.out.println("상위클래스명 : "+clazz.getSuperclass().getName());
		
		// 패키지 정보 가져오기
		Package pkg = clazz.getPackage();
		System.out.println("패키지 정보 : "+pkg.getName()); ///결과 : kr.or.ddit.reflect
//		System.out.println("패키지 정보 : "+pkg); ///package kr.or.ddit.reflect 결과 이렇게 나온다

		
		// 해당 클래스에서 구현하고 있는 인터페이스 정보 가져오기
		Class<?>[] interfaces = clazz.getInterfaces();
		
		System.out.println("인터페이스 목록 : ");
		for (Class<?> inf : interfaces) {
			System.out.println(inf.getName()+"|");
		}
		System.out.println();
		
		// 클래스의 접근제어자 정보 가져오기
		int modFlag = clazz.getModifiers();
		System.out.println("접근제어자 : "+Modifier.toString(modFlag));

		
		
		
		
	}
}
