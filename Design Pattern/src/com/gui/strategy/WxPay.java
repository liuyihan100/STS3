package com.gui.strategy;

public class WxPay implements CommonPay {

	@Override
	public void pay(Integer money) {
		
		System.out.println("ʹ��΢��֧��" + money + "Ԫ");
	}

}
