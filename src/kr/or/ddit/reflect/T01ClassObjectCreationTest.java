package kr.or.ddit.reflect;

public class T01ClassObjectCreationTest {
/*
 	Java Reflection 에 대하여...
 
 1. 리플렉셜은 런타임 시점에 클래스 또는 멤버변수, 메서드, 생성자에 대한 정보를 가져오거나 수정할 수 있고,
 새로운 객체를 생성하거나 메서드를 실행할 수 있다.
 (컴파일 시점에 해당 정보를 알 수 없는 경우(소스코드 부재)에 유용하게 사용될 수 있음)
 
 2. Reflection API는 java.lang.reflect 패키지와 java.lang.Class를 통해 제공된다
 
 3. java.lang.Class의 주요 메서드
  - getName(), getSuperclass(). getInterfaces(), getModifiers() 등.
  
 4. java.lang.reflect 패키지의 주요 클래스
  - Field, Method, Constructor, Modifier 등.
 */
	
	public static void main(String[] args) throws ClassNotFoundException{
//		new T01ClassObjectCreationTest(); /// T01ClassObjectCreationTest의 객체만들기
		
		///클래스 오브젝트 생성하는 세가지 방법
		/// 첫번째 방법 Class.forName 하는 방법
		// Class객체(클래스 정보를 담고 있는 객체) 생성하기
		// 첫번째 방법 : Class.forName() 메서드 이용하기
		Class<?> klass = Class.forName("kr.or.ddit.reflect.T01ClassObjectCreationTest");
		///클래스라고 하는 클래스가 있다,해당 타입들 다 핸들링 가능
		///Clase객체 만들었다
		/// 여기 Class.forName("kr.or.ddit.reflect.T01ClassObjectCreationTest"); 만들어진건
		/// 클래스 정보를...
		
		// 두번째 방법 : getClass() 메서드 이용하기		
		///인스턴스 클래스?니깐 객체 먼저 만들고 써야한다
		T01ClassObjectCreationTest obj = new T01ClassObjectCreationTest();
		///모든 객체는 getClass를 다 갖고 있다
		klass = obj.getClass();
		
		// 세번째 방법 : .class 이용하기
		klass = T01ClassObjectCreationTest.class;
		
//		///각각의 방법을 쓸때는 이런식으로 써야 하는거 같음...
//		///첫번째
//		Class<?> klass = Class.forName("kr.or.ddit.reflect.T01ClassObjectCreationTest");
//		
//		///두번째
//		T01ClassObjectCreationTest obj = new T01ClassObjectCreationTest();
//		Class<?> klasss = obj.getClass();
//		
//		///세번쩨
//		Class<?> klassss = T01ClassObjectCreationTest.class;
//		
		

	}

}
