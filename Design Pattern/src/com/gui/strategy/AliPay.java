package com.gui.strategy;

public class AliPay implements CommonPay {

	@Override
	public void pay(Integer money) {
		
		System.out.println("使用支付宝支付" + money + "元");

	}

}