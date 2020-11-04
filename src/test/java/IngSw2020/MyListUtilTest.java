package IngSw2020;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	private static MyListUtil lista;

	@BeforeClass
	public static void init() {
		lista = new MyListUtil();
	}
	
	@Before
	public void beforeTestOrario() {
		DateTime time = new DateTime();
		System.out.println( "Inizio Test = " + time.toString("yyyy-mm-dd hh-mm-ss"));
	}
	
	@After
	public void afterTestOrario() {
		DateTime time = new DateTime();
		System.out.println( "Fine Test = " + time.toString("yyyy-mm-dd hh-mm-ss"));
	}
	

	@Test
	public void isCrescenteWork() {
		List<Integer> temp1 = Arrays.asList(12,5,7,1,8, 0, -54);
		assertEquals(Arrays.asList(-54, 0, 1, 5, 7, 8, 12), lista.ordinaLista(temp1, true));
	}
	
	
	@Test
	public void isDecrescenteWork() {
		List<Integer> temp1 = Arrays.asList(12,5,7,1,8, 0, -54);
		assertEquals(Arrays.asList(12, 8, 7, 5, 1, 0, -54), lista.ordinaLista(temp1, false));
	}
	
	
}
