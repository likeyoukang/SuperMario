package edu.zut.hb.software.trailblazers.admin.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.hb.software.base.service.GenericManagerTestCase;
import edu.zut.hb.software.trailblazers.admin.domain.User;

public class UserManagerTest extends GenericManagerTestCase<Long, User, UserManager> {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(UserManagerTest.class.getName());

	UserManager userManager;

	public UserManagerTest() {
		super(User.class);
	}

	@Autowired
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	@Test
	public void testGetAll() {
		List<User> all = this.userManager.getAll();
		assertNotNull(all);
		for (User user : all) {
			System.out.println("this is emil ...." +user.getEmail());
			
		}
//		assertEquals(100, all.size());
		if (logger.isInfoEnabled()) {
			logger.info("testGetAll() - List<User> all={}", all); //$NON-NLS-1$
		}
	}

	@Test
	public void testSayHello() {
		String expected = "Hello, world!";
		String result = this.userManager.sayHello("world");
		if (logger.isInfoEnabled()) {
			logger.info("testSayHello() - String result={}", result); //$NON-NLS-1$
		}

		assertEquals(expected, result);
	}
}
