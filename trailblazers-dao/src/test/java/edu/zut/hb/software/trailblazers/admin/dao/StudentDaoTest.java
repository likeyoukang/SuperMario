package edu.zut.hb.software.trailblazers.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.hb.software.base.dao.GenericDaoTestCase;
import edu.zut.hb.software.trailblazers.admin.domain.Student;


public class StudentDaoTest extends GenericDaoTestCase<Long, Student, StudentDao> {

	@Autowired
	StudentDao studentDao;

	@Test
	public void testFindAll() {

		List<Student> result = this.studentDao.findAll();
/*		for (Student student : result) {
			System.out.println("student"+student.getCardId());
			
		}
*/
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<Student> result={}", result); //$NON-NLS-1$
		}

	}


}
