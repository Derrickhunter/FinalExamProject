package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

public class RetirementTest {

	@Test
	public void testPMT() {
		
		Retirement rt = new Retirement();
		
		double Working = 0.07;
		int Years = 40;
	
		rt.setWorking(Working);
		rt.setYears(Years);
		
		double ans = rt.AmountToSave();
		
		System.out.println(ans);
		
	}
	
	
	@Test
	public void TestPV() {
		
		Retirement tt  = new Retirement();
		
		double ReturnRetired = 0.02;
		int Years = 20;
		double Income = 10000;
		double SSI = 2642;
		
		tt.setReturnRetired(Retired);
		tt.setYears(Years);
		tt.setIncome(Income);
		tt.setSSI(SSI);
		
		double anss = tt.TotalAmountSaved();
		
		System.out.println(anss);
		
		
		
	}

}
