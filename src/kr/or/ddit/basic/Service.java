package kr.or.ddit.basic;


//@printAnnotation
///우리가 만든 어노테이션의 타겟을 메소드로만 했으므로 빨간줄이 뜨는데
///@Target({ElementType.METHOD, ElementType.TYPE})이렇게 바꾸면 빨간줄이 사라진다
public class Service {
	
//	아무것도 안적은 것은 @printAnnotation(value = "-", count = 20)과 같은 의미
	@printAnnotation
	public void method1() {
		System.out.println("method1이 호출되었습니다");
	}
	
//	@printAnnotation(value = "%")
	@printAnnotation("%") ///이렇게 해도 됨, value값 하나만 있을때 가능
	public void method2() {
		System.out.println("method2이 호출되었습니다");
	}
	
	@printAnnotation(value = "#", count = 25)
//	@printAnnotation("#", count = 25) ///이건 안됨
	public void method3() {
		System.out.println("method3이 호출되었습니다");
	}

}
