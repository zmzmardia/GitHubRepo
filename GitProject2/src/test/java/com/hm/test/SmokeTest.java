package com.hm.test;

import org.testng.annotations.Test;

import com.bit.common.Utility;

public class SmokeTest extends BaseTest{
	
	
	@Test
	public void test1() throws InterruptedException {
		Utility u = new Utility(dr);
		u.click("");	
	}

}
