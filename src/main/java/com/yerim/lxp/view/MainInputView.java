package com.yerim.lxp.view;

import java.util.Scanner;

public class MainInputView {
	Scanner sc = new Scanner(System.in);

	public String readSelection() {
		System.out.print(">_ ");
		String selection = sc.nextLine();
		return selection;
	}
}
