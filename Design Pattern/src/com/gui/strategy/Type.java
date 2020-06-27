package com.gui.strategy;

public enum Type {
	
	Ali_Pay(new AliPay()),
	Wx_Pay(new WxPay());
	
	private CommonPay common;
	
	Type(CommonPay common) {
		this.common = common;
	}
	
	public CommonPay get() {
		return common;
	}
}
