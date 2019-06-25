package utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class UtilTest {

	@Test
	void testIsEmptyOrNullWhenObjectIsBasicInt() {
		int o = 9;
		assertFalse(Util.isEmptyOrNull(o), "Object is not null");
	}

	@Test
	void testIsEmptyOrNullWhenObjectIsStringAndIsNull() {
		String s = null;
		assertTrue(Util.isEmptyOrNull(s), "Object is null");
	}

	@Test
	void testIsEmptyOrNullWhenObjectIsStringAndIsNotNull() {
		String s = "test";
		assertFalse(Util.isEmptyOrNull(s), "Object is not null");
	}

	@Test
	void testIsEmptyOrNullWhenObjectIsCollectionAndIsEmpty() {
		List<String> l = new ArrayList<>();
		assertTrue(Util.isEmptyOrNull(l), "Object is empty");
	}

	@Test
	void testIsEmptyOrNullWhenObjectIsCollectionAndIsNull() {
		List<String> l = null;
		assertTrue(Util.isEmptyOrNull(l), "Object is null");
	}

	@Test
	void testIsEmptyOrNullWhenObjectIsCollectionAndIsNotNull() {
		List<String> l = new ArrayList<>();
		l.add("test");
		assertFalse(Util.isEmptyOrNull(l), "Object is not null and not empty");
	}

	@Test
	void testIsEmptyOrNullWhenObjectIsArrayAndIsEmpty() {
		int[] a = new int[0];
		assertFalse(Util.isEmptyOrNull(a), "Object is not empty, new int[0] creates an array of size 0");
		
		a = new int[1];
		assertFalse(Util.isEmptyOrNull(a), "Object is not empty, array is initialized with 0 when created");
	}

	@Test
	void testIsEmptyOrNullWhenObjectIsArrayAndIsNull() {
		int[] a = null;
		assertTrue(Util.isEmptyOrNull(a), "Object is null");
	}

	@Test
	void testIsEmptyOrNullWhenObjectIsArrayAndIsNotNull() {
		int[] a = new int[5];
		a[0] = 5;
		assertFalse(Util.isEmptyOrNull(a), "Object is not null and not empty");
	}

}
