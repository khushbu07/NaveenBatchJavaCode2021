package OOP_Interface;

public class FortisHospital extends Hospital implements USMedical,UKMedical,IndianMedical {

	@Override
	public void physioservice() {
		System.out.println("FH--physioservice");

	}

	@Override
	public void oncologyservice() {
		System.out.println("FH--oncologyservice");

	}

	@Override
	public void dentalservice() {
		System.out.println("FH--dentalservice");

	}

	@Override
	public void dermaservice() {
		System.out.println("FH--dermaservice");
		
	}

	@Override
	public void pediaservice() {
		System.out.println("FH--pediaservice");

		
	}

	@Override
	public void cardioservice() {
		System.out.println("FH--cardioservice");

		
	}

	@Override
	public void neuroService() {
		System.out.println("FH--neuroService");
		
	}

	@Override
	public void orthoService() {
		System.out.println("FH--orthoService");
		
	}

	@Override
	public void entService() {
		System.out.println("FH--entService");
		
	}

	@Override
	public void emergencyservices() {
		System.out.println("FH--emergencyservices");
		
	}

	//individual
	public void medicalInsurance() {
		System.out.println("FH--medicalInsurance");
		
	}
	public void medicalTraining() {
		System.out.println("FH--medicalTraining");
		
	}
	@Override
	public void helpDesk() {
		System.out.println("FH hospital help desk");
	}
	@Override
	public void billing() {
		System.out.println("FH hospital billing");
	}

	@Override
	public void covid19Test() {
		System.out.println("FH-- covid19Test");

		
	}

}
