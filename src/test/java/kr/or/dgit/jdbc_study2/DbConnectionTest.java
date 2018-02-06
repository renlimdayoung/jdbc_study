package kr.or.dgit.jdbc_study2;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.erp_application.jdbc.DBCon;

public class DbConnectionTest {
	private static DBCon dbCon;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dbCon = DBCon.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		dbCon.connectionClose();
	}

	@Test
	public void test() {
		//DBCon con = DBCon.getInstance();
		Assert.assertNotNull(dbCon);
		//fail("Not yet implemented");
	}

}
