package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardioservice();
		fh.dermaservice();
		fh.dentalservice();
		fh.emergencyservices();
		fh.medicalInsurance();
		fh.medicalTraining();
		fh.billing();
		fh.helpDesk();
		fh.covid19Test();
		UNHG.pandemicAnnoucement();

		// USMedical.min_fee=20;
		System.out.println(USMedical.min_fee);

		// top casting: child class object can be referred by parent interface ref
		// variable

		USMedical us = new FortisHospital();
		us.dermaservice();
		us.dentalservice();
		us.oncologyservice();
		us.physioservice();

		UKMedical uk = new FortisHospital();
		uk.cardioservice();
		uk.emergencyservices();
		uk.pediaservice();

		// down casting: NA
		// new USMedical();

	}

}
