package ch6;

import java.util.Arrays;

/**
 * - 객체지향의 공부 
 *   캡슐화, 상속, 추상화, 다형성 란?
 *   
 *   논리적인 개념을 코드로 어떻게 표현을 하는지? => 문법
 *   
 *   4대 특성이 어떤 경우에 활용하는지?
 *   
 *   클래스 설계시 유지보수성을 고려하려면 어떻게 해야 하는지?
 *   
 * - 객체지향의 장점
 *   코드의 재사용성이 높다. 기존 코드를 활용
 *   코드의 관리가 용이하다. 쉽게 코드를 변경
 *   신뢰성이 높은 프로그래밍을 가능하게 한다. 재사용성이 높고, 변경이 쉽고, 
 *   							중복을 제거하여 코드의 불일치가 줄어듬.
 *   
 * - 클래스와 객체  
 *   클래스는 객체(메모리에 로딩된 상태)를 정의해놓은 것. 객체를 생성하는데 사용.
 * 
 *   변수 -> 배열 -> 구조체(C언어, 여러가지 기본형 타입을 하나로 묶음)
 *   			   stuGrade = (학생정보, 교과목 정보, 평가정보)
 *                 학생성적을 관리할 수 있는 새로운 자료형.
 *                 
 *                 단점으로는 정보만 관리되고 있어, 기능이 없음.
 *                 학생의 주소를 쉽게 변경을 위한 기능이 없음.
 *               
 *               -> 클래스
 *                  정보(학생정보, 교과목 정보, 평가정보) + 기능(주소 변경)
 *                  정보 : 속성, 필드, 멤버변수
 *                  기능 : 메소드, 함수
 *                 
 *                  String 클래스
 *                  정보(char 배열), 기능(대문자 바꾸기, 잘라내기, 치환하기)
 * 
 *  객체의 정의 : 실제로 존재하는 것. 사물 또는 개념.
 *  객체의 용도 : 객체가 가지고 있는 기능과 속성(정보)에 따라 다름.
 *             객체를 사용한다는 것은 객체가 가지고 있는 속성과 기능을 
 *             사용한다는 의미.
 * 
 *  유형의 객체 : 컴퓨터, 강의실, 학생 등
 *  무형의 객체 : 논리적인 것들. 
 *  
 *  객체(object)와 인스턴스(instance)
 *     클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화(메모리에 적재)하고 함.
 *     어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스라고 함.
 *  
 *     인스턴스화는 객체화라고 함.
 *  
 * - 객체의 구성요소
 *   속성(property) : 멤버변수, 필드, 상태, 특성
 *   기능(function) : 메소드, 함수, 행위
 *  
 * - 인스턴스는 참조변수를 통해서만 접근이 가능.
 *   참조변수의 타입은 인스턴스의 타입과 일치해야 함.
 *   
 * - 객체배열
 *   객체배열에 저장되는 값은 instance 의 주소값임.
 * 
 * - 변수와 메소드
 *   변수 : 클래스 변수, 인스턴스 변수, 지역 변수 등(매개변수 등)
 *         구분 기준은 선언된 위치에 따름.
 *         
 *   클래스 변수 : 모든 인스턴스에서 공유할 수 있는 변수.
 *             인스턴스화를 거치지 않아도 사용 가능.
 *   인스턴스 변수 : 인스턴스마다 고유한 상태를 유지해야 하는 변수.
 *             객체가 생성이 되어야만 사용 가능.
 *   지역 변수 : 해당 블럭(구역)에서 사용 가능하고, 그 범위를 벗어나면 사용할 수
 *            없게 되는 변수.( 메소드 내에 선언된 변수, 매개변수,  )
 *            
 * - 메소드 
 *   특정 작업을 수행하는 일련의 문장들의 묶음.
 *   
 *   사용하는 이유 : 높은 재사용성, 중복된 코드의 감소, 프로그램의 구조화
 *          리팩토링시 메소드를 자주 활용하게 됨.
 *          
 *   구조 : 선언부(메소드의 머리), 구현부(메소드의 몸통)
 *   
 *   반환타입의 메소드 : 반환이 없으면, void 를 사용. 
 *   				반환형에 맞추어서 반환타입을 사용. 마지막에 return 필요.
 *   				반환타입과 return 타입이 동일해야 함.
 *   
 *   매개변수 : 기본형과 참조형.
 *     기본형 : 변수의 값을 읽기만 할 수 있음.(read only)
 *     참조형 : 변수의 값을 수정할 수 있음.(read & write)
 *   
 *   참조형 반환타입 : 참조변수 값(인스턴스 주소)이 반환됨
 *   
 *   클래스 메서드와 인스턴스 메서드(static 유무)
 *   	클래스 메서드 : static 키워드
 *   				인스턴스와 관련없는 작업 수행
 *   	인스턴스 메서드 : static 키워드 X
 *   				  인스턴스 변수와 관련된 작업을 수행 -> 인스턴스 생성이 되어야 호출 가능
 *   
 *   	>생각해보기<
 *   	- 클래스를 설계할 때, 멤버변수 중 모든 인스턴스에 공통으로 사용하는 것에 static을 붙인다
 *   	- 클래스 변수(static 변수)는 인스턴스를 생성하지 않아도 사용 가능
 *   	- 클래스 메서드(static method)는 인스턴스 변수 사용불가
 *   	- 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다
 *   
 * - 오버로딩
 *   한 클래스 내에서 같은 이름의 메서드를 여러 개 정의하는 것
 *    
 *   조건 : 메서드 명이 동일하나, 매개변수 개수 또는 타입으로 구분
 *    	   static, 메서드 반환타입은 조건에 해당 X
 *    
 *   장점: 메서드명만 봐더라도 이 메서드의 기능 예상 가능
 *    	  메서드명 절약
 *    
 * - 가변 매개변수
 */
public class OopEx {

	// 프로그램의 시작점.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 객체 생성 */
		// 다른 클래스를 재사용해서 코딩.
		// String 과 같은 API 대신에 사용자 정의 클래스를 사용.
		Tv t; //Tv변수만 선언된 상태이지, 인스턴스(메모리 적재) 상태가 아님. 
			// t 는 참조변수이고, 참조변수가 초기화가 안된상태임.
		    // 기본 초기화인 상태임. null 로 초기화가 되어 있음.
		
		t = new Tv(); // t 참조변수가 null 에서 실제 Tv 객체의 주소로 초기화됨.
			// 사용할 수 있는 상태. 멤버변수 접근, 메소드 호출도 가능해짐.
		
		// 멤버변수 초기화 전의 상태
		// color => null
		// power => flase
		// channel => 0
		
		// 멤버변수 초기화
		//t.channel = 10;
		//t.channel = -100;// 논리적으로 채널이 마이너스인 경우는 없음.
					// 문제점은 멤버변수를 함부로 접근하도록 하면 안됨.
					// 해결방법은 직접접근이 아닌 간접 접근이 되도록 하는 기능.
					// 기능에서 유효한 값으로 멤버변수 초기화되로록 체크.
					// 체크해서 문제가 없다면, 멤버변수에 적용.
		
					// 정리
					// 멤버변수에 접근제어자가 필요.
					// 메소드가 필요.(세터, setter)
		t.setChannel(-100);// 무효한 값
		System.out.println(t.getChannel());
		
		t.channelUp();
		System.out.println(t.getChannel());
		
		t.channelDown();
		
		//System.out.println(t.channel);
		
		t.channelUp();
		
		//System.out.println(t.channel);
		
		/* Tv 객체 배열 */
		Tv t3, t4, t5; // 변수 3개로 관리하게 됨. 
						// 만약에 Tv 가 1000대라면... 변수가 1000개가 필요.
			
		Tv[] tvArr = new Tv[3];  // 하나의 배열로 3개의 Tv를 관리.
									// Tv 가 1000대라도 변수는 1 개임.
		// 위의 new Tv는 자세히 보면 () 가 없음.
		// 객체 3개로 만들어질것이라고 생각하면 안됨.
		// 단지, 주소값 3개를 저장할 수 있는 배열이 만들어진 상태일뿐임.
		// 3개의 요소는 모두 null 상태임.
		
		// 각 요소에 객체를 생성해서 그 객체의 주소값을 배열의 요소에 저장해야 함.
		// 객체배열을 생각한데로 사용이 가능해짐.
		
		// 객체 배열의 요소 초기화
		//tvArr = {new Tv(), new Tv(), new Tv()};
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
		/* 지역 변수 사용 위치 */
		int tmp;
		
		{
			int tmp2;
			
			{
				int tmp3;
			}
//			 tmp3 = 0; tmp3 는 접근 유효 범위를 벗어난 상태임으로 사용 불가.
		}
		
		// tmp2 = 0; tmp2 는 접근 유효 범위를 벗어난 상태임으로 사용 불가.
					
		
		/* 클래스 변수와 인스턴스 변수 
		 * 인스턴스 변수로의 접근 : 참조변수를 통한 멤버변수 사용은 인스턴스화가 되어야만 가능
		 * 클래스 변수로의 접근 : 참조변수 사용 X, 클래스 이름으로 접근
		 * */
		Card c1 = new Card();
		System.out.println(Card.height);
		
		Card.height = 100; // 논리적으로 문제가 없나? 변경이 안되록 해야 함.
							// 클래스 멤버변수에 final 을 추가.
		System.out.println(Card.height);
		
		
		/* 기본형 매개변수, 참조형 매개변수 */
		Data d = new Data();
		d.x = 10;
		System.out.println(d.x);
		
		// 기본형 매개변수
		change(d.x);	// d.x 가 전달되는 것이 아니고, d.x의 값인 10 이 전달됨.
		System.out.println("final = " + d.x);
		
		change(d);
		System.out.println("final 2 = " + d.x);
		
		Data d2 = copy(d);
		System.out.println("d2.x: " + d2.x);
		
		/* 클래스 메서드, 인스턴스 메서드 */
		MyMath myMath = new MyMath();
		
		// 클래스 메서드 호출 : 인스턴스 생성되지 않은 상태
		System.out.println(MyMath.add(100L, 200L));
		
		// 인스턴스 메서드 호출 : 인스턴스 생성이 필요
		myMath.a = 400L;		// 인스턴스 메서드를 사용하기 위한 인스턴스 변수 초기화
		myMath.b = 200L;
		System.out.println("myMath.add : "+myMath.add());
		
		// 클래스 메서드 
		System.out.println("myMath.add(myMath.a, myMath.b) : "+myMath.add(myMath.a, myMath.b));	// 방법1. 인스턴스 변수를 매개변수로 전달 : 값 복사
		System.out.println("myMath.add(400L, 200L) : "+myMath.add(400L, 200L));					// 방법2. 직접 값(상수)을 매개변수로 전달
		
		// 가변 매개변수 메서드 호출
		String[] strs = {"100", "200", "300"};
		System.out.println(concatenate(", ", strs));

		System.out.println(concatenate(null));
		System.out.println(concatenate2(null));
		
		System.out.println(concatenate("--", new String[0]));
		System.out.println(concatenate2(new String[0]));
		System.out.println(concatenate("--", ""));
		
//		System.out.println(concatenate2());	Error : 배열 매개변수 메서드 : 매개변수를 명시적으로 작성해야 함
		System.out.println(concatenate3());	// 가변 매개변수 메서드 : 매개변수를 비워두고 싶을 때 
		
	} // end of Main()
	
	/* 가변 매개변수 메서드(배열)
	 * String...strings : String형 배열이 들어오는데, 몇개 들어올지는 몰라.. */
	static String concatenate(String delim, String...strings) {
		String result = "";
		
		for(String str : strings) {
			result += str + delim;
		}
		
		return "concatenate(\"" + delim + "\", strs) : " + result;
	}
	
	static String[] concatenate2(String[] strings) {
		return strings;
	}

	static String[] concatenate3(String...strings) {
		return strings;
	}
	
	/* 참조형 반환타입의 메서드 
	 * main()이 static이기 때문에 메인 메서드에서 사용하려면 해당 메서드 역시 static이 되어야 함 
	 * static : 메모리에서 일반 메서드 메모리 접근이 불가 */
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;	// 인스턴스 변수의 값 복사
		
		return tmp;
	}
	
	// 기본형 매개변수의 메소드( 오버로딩 메소드 )
	static void change(int x) { // int x = 10;
		x = 1000;
		System.out.println(x);
	}
	
	// 참조형 매개변수의 메소드( 오버로딩 메소드 )
	static void change(Data d) { // 값은 값인데, 인스턴스의 주소값이 넘어옴. 값복사.
		d.x = 1000;
		System.out.println(d.x);
	}
}

class Tv {
	// 속성, 멤버변수
	String color;
	boolean power;// true, false
	private int channel;//private 는 접근제어지시자
	
	// channel 세터, 멤버변수의 값을 변경.
	// public은 접근제어지시자,
	// void 반환하는 값이 없음.
	public void setChannel(int ch) {
		// 유효한 channel 인지 체크
		if(ch < 0) return;// channel 이 음수이면 적용하지 않음.
		
		channel = ch;//양수이면 멤버변수에 적용.
	}
	
	// channel 게터, 메버변수의 값을 조회
	public int getChannel() {
		return channel;
	}
	
	// 기능, 메소드
	void power() { power = !power; };
	void channelUp() { ++channel; };
	void channelDown() { --channel; };
	
}

//하트, 다이아몬드, 스페이스, 클로버
//숫자와 무늬는 각각 고유하지만, 공통적인 것은 카트의 크기(폭, 높이)
//클래스 변수의 대상(Card 클래스에서의 공유 대상 -> 수정 가능(수정 시, 전체 대상으로 공유됨)) : 카드의 크기
//인스턴스 변수의 대상 : 숫자, 무늬
class Card {
	// 멤버변수(클래스, 인스턴스)
	
	// 인스턴스 멤버 변수 => 객체 생성 후 사용 가능. 고유
	private String kind; //무늬
	private int number;  //숫자
	
	// 클래스 멤버 변수 => 객체 생성하지 않고 사용 가능. 공유
	static int width = 100;
	static int height = 230;
}

/* 
 * 기본형 매개변수, 참조형 매개변수 용 클래스
 */
class Data { int x; };

/* 클래스 메서드, 인스턴스 메서드 관련 클래스 
 * this : 자기 참조 */
class MyMath {
	long a,b;
	
	// 인스턴스 메서드
	// 인스턴스 변수임을 명시적으로 나타내기 위해 자기참조변수(this) 키워드를 사용하면 확실히 구분 가능
	long add() {
		add(a, b);	// 인스턴스 메서드에서 static 메서드 사용 가능
		return this.a+this.b; 
	}
	
	/* 클래스 메서드 
	 * overloading과 static는 관계 X
	 * 인스턴스 상태이던 아니던 모두 사용(호출) 가능
	 * 단, 클래스 메서드 자체 내에서는 인스턴스 사용 불가
	 */
	static long add(long a, long b) { 
//		this.add();	// Cannot make a static reference to the non-static method add() from the type MyMath
		return a+b;	// 지역변수 a, b (!= 인스턴스 변수 a,b) 
	}

	/* 오버 로딩 */
	static long add(int a, int b) { 
		return a+b;	
	}

	/* 반환 타입은 오버로딩 조건에 해당 X
	 * static int add(int a, int b) { return a+b; }
	 */
}