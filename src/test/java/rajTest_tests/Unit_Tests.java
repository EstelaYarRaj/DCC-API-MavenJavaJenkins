package rajTest_tests;

import static org.junit.Assert.*;
import org.junit.Test;
import rajTest.TestCase;

public class Unit_Tests {
	/**@Test
	public void haveToken(){
		if (TestCase.Token == "No token specified"){
			fail("No authentication token");
		}
		else if (TestCase.login() != 200){
			fail("Authentication token invalid"); 
		}
	}
	
	
	@Test
	public void logintest(){
		assertEquals(TestCase.login(), 200);
		int code = TestCase.login();
		fail("Error code: " + code);
	}**/
	@Test
	public void getCompanyTest(){		
		assertEquals(TestCase.getCompany(), 200);
		}
	
	@Test
	public void getDataCentersTest(){
		assertEquals(TestCase.getDataCenters(), 200);
		}
	/**@Test
	public void getAvailIPsTest(){
		assertEquals(TestCase.getAvailIPs(), 200);
		int code = TestCase.getAvailIPs();
		fail("Error code: " + code);
	}**/
	@Test
	public void getBillingSitesTest(){
		assertEquals(TestCase.getBillingSites(), 200);
		}
	
	@Test
	public void getOrderProductsTest(){
		assertEquals(TestCase.getOrderProducts(), 200);
		}
	@Test
	public void getMachineImagesTest(){
		assertEquals(TestCase.getMachineImages(), 200);
		}
	@Test
	public void getDomainTest(){
		assertEquals(TestCase.getDomain(), 200);
		}
	@Test
	public void getClustersTest(){
		assertEquals(TestCase.getClusters(), 200);
		}
	/**
	@Test
	public void getClusterNetworkIntSegTest(){
		assertEquals(TestCase.getClusterNetworkIntSeg(), 200);
		}
		**/
	@Test
	public void getCluterCatalogTest(){
		assertEquals(TestCase.getCluterCatalog(), 200);
		}
	@Test
	public void getClusterMachineImagesTest(){
		assertEquals(TestCase.getClusterMachineImages(), 200);
		}
	@Test
	public void getClusterHostsTest(){
		assertEquals(TestCase.getClusterHosts(), 200);
		}
	@Test
	public void getClusterStorageTest(){
		assertEquals(TestCase.getClusterStorage(), 200);
		}
	@Test
	public void getOrdersTest(){
		assertEquals(TestCase.getOrders(), 200);
		
	}
}
