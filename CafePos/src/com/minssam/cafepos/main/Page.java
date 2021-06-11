package com.minssam.cafepos.main;

import java.awt.Dimension;

import javax.swing.JPanel;

// 모든 페이지의 부모패널 정의 (공통된 코드가 있을경우 이 클래스에 적용) 
public class Page extends JPanel {
	private AppMain appMain;
	
	// 다른 패키지에서도 접근 할수있도록
	public AppMain getAppMain() {
		return appMain;
	}

	public Page(AppMain appMain) {
		this.appMain = appMain;
		setPreferredSize(new Dimension(1300, 800));
		setVisible(false);
	}
}
