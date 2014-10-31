package com.skipper.test;

import java.io.File;
import java.io.IOException;

import testlib.Test;
import net.sf.jni4net.Bridge;

public class Program {

	public static void main(String[] args) {
		
		try {
			
			Bridge.setVerbose(true);
			Bridge.init();
			
			Bridge.LoadAndRegisterAssemblyFrom(new File("testlib.j4n.dll"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Test test = new Test();
		test.Hello();
		test.Repeat("It works!");
		
	}
}

