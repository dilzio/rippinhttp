package org.dilzio.riphttp.core;

import static org.junit.Assert.*;

import org.dilzio.riphttp.util.Pair;
import org.junit.Test;

public class PairTest {

	@Test
	public void happy() {
		Pair<String, String> _underTest = new Pair<String, String>();
		_underTest.setFirst("String1");
		_underTest.setSecond("String2");
		assertEquals("String1", _underTest.first());
		assertEquals("String2", _underTest.second());
	}

}