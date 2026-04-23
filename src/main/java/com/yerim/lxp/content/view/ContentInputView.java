package com.yerim.lxp.content.view;

import java.util.Scanner;

public class ContentInputView {
	private final Scanner sc = new Scanner(System.in);

	public String readSelection() {
		System.out.print(">_ ");
		String selection = sc.nextLine();
		return selection;
	}
}
