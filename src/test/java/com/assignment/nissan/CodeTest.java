package com.assignment.nissan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.assignment.nissan.addcode;

public class CodeTest {
	private addcode ac ;
	
	@Before
	public void setup() {
		ac = new addcode() ;
	}

	@Test
	public void addInteger() {
		Assert.assertEquals( "Pass", "60.0", ac.func("10","50") ) ;
	}
	
	@Test
	public void addFloat() {
		Assert.assertEquals( "Pass", "32.1", ac.func("10.9","21.2") ) ;
	}
	@Test
	public void addIntegrandFloat() {
		Assert.assertEquals( "Pass", "35.8", ac.func("20","15.8") ) ;
	}
	
	@Test
	public void addNull() {
		Assert.assertEquals( "Fail", "Invalid Input", ac.func("1","") ) ;
	}
	
	@Test
	public void addaplhabet() {
		Assert.assertEquals( "Fail", "Invalid Input", ac.func("A","2") ) ;
	}
	
}