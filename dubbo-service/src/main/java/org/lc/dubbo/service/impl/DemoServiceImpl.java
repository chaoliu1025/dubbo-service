package org.lc.dubbo.service.impl;

import org.lc.dubbo.service.inf.DemoService;


public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
