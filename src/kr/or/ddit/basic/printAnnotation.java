package kr.or.ddit.basic;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 	Annotation에 대하여...
 	
  프로그램 소스코드 안에 다른 프로그램을 위한 정보를 미리 약속된 형식으로 포함시킨 것 (JDK 1.5 부터 지원함)
  주석처럼 프로그램에 영행을 미치지 않으면서, 다른 프로그램에 유용한 정보를 제공한다.
  
  종류 :	1. 표준 애너테이션
  		2. 메타 애너테이션(에너테이션을 위한 애너테이션, 즉 애너테이션을 정의할 때 사용하는 애너테이션)
  		///메타가 아니면 표준이라고 보면 된다
  		///어노테이션을 정의할때 필요한 또 다른 어노테이션을 메타 어노테이션이라고 한다
 
 애너테이션 정의방법
 
 	@interface 애너테이션 이름 {
 		요소타입 타입요소이름();	//반환값이 있고, 매개변수는 없는 추상메서드 형태
 			...
 	}
 	
 애너테이션 정의할 때 주의할 점
 	1. 요소타입은 기본형, String, enum, annotaton, Class 만 허용된다.
 	2. ()안에 매개변후를 선언 할 수 없다.
 	3. 예외를 선언할 수 없다. ///throw Exception같은거 안됨
 	4. 요소타입에 타입 매개변수(제너릭타입글자)를 사용할 수 없다.
 */

//@Target({ElementType.METHOD, ElementType.TYPE})		// 메소드와 타입 둘 다 가능하게 한다
@Target(ElementType.METHOD)			// 적용가능 대상 지정
@Retention(RetentionPolicy.RUNTIME)	// 유지기간을 지정(default: CLASS)
///printAnnotation을 정의하기 위해서 Target,Retention을 썼으므로 이 둘은 메타어노테이션이다
public @interface printAnnotation {
	int id = 100; //상수 선언 가능
	String value() default "-"; // 기본값을 -로 지정
	int count() default 20; // 기본값을 20으로 지정
	///default값 해도 되고 안해도 된다
}
///정의 했으니 이제 써먹어 보자








