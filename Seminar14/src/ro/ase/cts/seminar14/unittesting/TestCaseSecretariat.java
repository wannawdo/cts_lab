package ro.ase.cts.seminar14.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar14.DepartamentSecretariat;
import ro.ase.cts.seminar14.Student;
import ro.ase.cts.seminar14.StudentAbstract;
import ro.ase.cts.seminar14.StudentExceptionWrongValue;
import ro.ase.cts.seminar14.TipBursaEnum;

class TestCaseSecretariat {
	DepartamentSecretariat secretariat;
	static final ArrayList<StudentAbstract> DEFAULT_STUDETS;

	static {
		DEFAULT_STUDETS = new ArrayList<StudentAbstract>();
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		int defaultNote1[] = { 7, 8, 9 };
		int defaultNote2[] = { 8, 9, 10 };
		DEFAULT_STUDETS.add(new Student("N/A", 130, defaultNote1));
		DEFAULT_STUDETS.add(new Student("N/A", 130, defaultNote2));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		secretariat = new DepartamentSecretariat();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	// reference test
	@Tag("Importante")
	@Test
	void testCalculBursaStub() {
		StudentAbstract defaultSTudent = new StudentAbstract() {

			@Override
			public float calculMedie() throws StudentExceptionWrongValue {
				return 8;
			}
		};
		ArrayList<StudentAbstract> listaStudenti = new ArrayList<StudentAbstract>();
		listaStudenti.add(defaultSTudent);
		secretariat.setStudenti(listaStudenti);

		float bursa = secretariat.calculBursa(0);
		assertEquals(TipBursaEnum.MERIT.getCuantum(), bursa);
	}

	// reference test clasa concreta
	@Test
	void testCalculBursaStubConcret() {
		StudentStub defaultStudent = new StudentStub();
		defaultStudent.setCalculMedieReturnValue(9);
		defaultStudent.setExceptionalCase(true);

		ArrayList<StudentAbstract> listaStudenti = new ArrayList<StudentAbstract>();
		listaStudenti.add(defaultStudent);
		secretariat.setStudenti(listaStudenti);

		float bursa = secretariat.calculBursa(0);
		assertEquals(TipBursaEnum.EXCELENTA.getCuantum(), bursa, "cuantumul returnat nu este corect");
	}

}
