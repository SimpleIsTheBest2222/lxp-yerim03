package com.yerim.lxp.content.view;

public class ContentOutputView {
	public void printContentMainMenu() {
		System.out.print("""
			------------------------------------------------------------
			  콘텐츠를 추가하세요. (제목에 0 입력 시 완료)
			------------------------------------------------------------
			
			  콘텐츠 제목  : 원시타입
			  콘텐츠 내용  : 원시 타입에는 int, byte, long, double, float, char, boolean, short이 있다
			
			  콘텐츠 제목  : for 문
			  콘텐츠 내용  : for (선언식; 조건식; 증감식) 으로 구성된다.
			
			  콘텐츠 제목  : Stream
			  콘텐츠 내용  : Stream은 컬랙션을 함수형으로 표현한다.
			
			  콘텐츠 제목  : 0
			  """);
	}
}
