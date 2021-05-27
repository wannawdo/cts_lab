package ro.ase.cts.seminar13.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.acs.seminar13.Student;
import ro.ase.acs.seminar13.exceptions.StudentExceptionWrongValue;

class StudentTestCase {
	Student student;
	String deFaultName = "N/A";
	int defaultVarta = 18;
	int defaultNote[] = {};

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass was called");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass was called");
	}

	@BeforeEach
	void setUp() throws Exception {
		student = new Student(deFaultName, defaultVarta, defaultNote);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown was called");
	}

	@Test
	void testStudentConstuctorRight() {
		String studentName = "Oana";
		int studentAge = 21;
		int grades[] = { 9, 9, 9 };
		Student student = new Student(studentName, studentAge, grades);

		assertEquals(studentName, student.getNume(), "Name is not equal");
		assertEquals(studentAge, student.getVarsta(), "Age is not equal");
		assertEquals(grades, student.getNote(), "Grades is not equal");

		// varianta, dar asa nu
//		if(!student.nume.equals(studentName)) {
//			fail("Name is not equal");
//		}
	}

	@Test
	void testStudentConstructorRightNotNull() {
		int grades[] = { 9, 9, 9 };
		Student student = null;
		try {
			student = new Student("Oana", 21, grades);
		} catch (Exception e) {
			fail("Constructorul nu  trebuie sa arunce exceptie!");
		}
		assertNotNull(student);
	}

	@Test(expected = StudentExceptionWrongValue.class)
	void testStudentSetVarstaErrorCondition() {

		student.setVarsta(-1);

	}

}
