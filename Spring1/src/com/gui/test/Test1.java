package com.gui.test;

import java.sql.SQLException;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test1 {
	
	public static void main(String[] args) throws SQLException {
		
		SpelExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("10+5");
		Integer value = (Integer)expression.getValue();
		System.out.println(value);
	}
}
