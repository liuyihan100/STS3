package com.mybatis.test;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyGenerator {

	@Test
	public void generatee() throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		
		File configFile = new File("C:\\Users\\˧˧С��\\Desktop\\����\\STS3\\MyBatis3\\conf\\com\\mybatis\\mapper\\EmployeesMapper.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
	}

}
