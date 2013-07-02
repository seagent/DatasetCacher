package test;

import static org.junit.Assert.*;

import main.CacheController;

import org.junit.Test;

public class CacheControllerTest {

	@Test
	public void createNewCacheController() throws Exception {
		CacheController cacheController = new CacheController();
		assertNotNull(cacheController);
	}
}
