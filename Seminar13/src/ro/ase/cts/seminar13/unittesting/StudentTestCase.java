package ro.ase.cts.seminar13.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import ro.ase.acs.seminar13.Student;
import ro.ase.acs.seminar13.exceptions.StudentExceptionWrongValue;

class StudentTestCase {
	Student student;
	static String DEFAULT_NAME = "N/A";
	static int DEFAULT_VARSTA = 18;
	static int DEFAULT_NOTE[] = {};
	static int NR_NOTE_DEFAULT = 3;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		DEFAULT_NOTE = new int[NR_NOTE_DEFAULT];
		DEFAULT_NOTE[0] = 9;
		DEFAULT_NOTE[1] = 10;
		DEFAULT_NOTE[2] = 9;
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass was called");
	}

	@BeforeEach
	void setUp() throws Exception {
		student = new Student(DEFAULT_NAME, DEFAULT_VARSTA, DEFAULT_NOTE);
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

//error condition
	@Test
	void testStudentSetVarstaErrorCondition() {
//		assertThrows(StudentExceptionWrongValue.class, () -> {
//			student.setVarsta(-1);
//		});
		assertThrows(StudentExceptionWrongValue.class, new Executable() {

			@Override
			public void execute() throws Throwable {
				student.setVarsta(-1);
			}
		});

	}

	@Test
	void testStudentGetVarstaRight() {
		int expectedValue = DEFAULT_VARSTA;
		int actualValue = student.getVarsta();
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testCalcululMedieErrorCondition() throws StudentExceptionWrongValue {
		student.setNote(null);
		assertThrows(StudentExceptionWrongValue.class, () -> {
			student.calculMedie();
		});
	}

	@Test
	void testCalculMedieErrorCondition() {
		try {
			student.setNote(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThrows(StudentExceptionWrongValue.class, () -> {
			student.calculMedie();
		});
	}

	@Test
	void testSetNoteBoundaryCondition() {
		int invalidDatasetNote[] = new int[3];
		for (int i = 0; i < 0; i++) {
			invalidDatasetNote[i] = 8;
		}
		invalidDatasetNote[2] = 20;
		assertThrows(StudentExceptionWrongValue.class, () -> {
			student.setNote(invalidDatasetNote);
		});
	}

}
