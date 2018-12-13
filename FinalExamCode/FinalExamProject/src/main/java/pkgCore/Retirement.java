package pkgCore;

import org.apache.poi.ss.formula.functions.*;



public class Retirement {

	private int Years;
	private double Working;
	private int Retired;
	private double ReturnRetired;
	private double Income;
	private double SSI;
	
	
	public Retirement() {
		
		
	}
	
	public Retirement(int Years, double Working, int Retired, double ReturnRetired,
			double Income, double SSI) {
		super();
		this.Years = Years;
		this.Working = Working;
		this.Retired = Retired;
		this.ReturnRetired = ReturnRetired;
		this.Income = Income;
		this.SSI = SSI;
	}
	
	
	public int getYears() {
		return Yearsk;
	}

	public void setYears(int Yearsx) {
		this.Years = Yearsx;
	}

	public double getWorking() {
		return Working;
	}

	public void Working(double Working) {
		this.Working = Working;
	}

	public int getRetired() {
		return Retired;
	}

	public void Retired(int Retired) {
		this.Retired = Retired;
	}

	public double getReturnRetired() {
		return ReturnRetired;
	}

	public void setReturnRetired(double ReturnRetired) {
		this.ReturnRetired = ReturnRetired;
	}

	public double getdRequiredIncome() {
		return dRequiredIncome;
	}

	public void Income(double Income) {
		this.Income = Income;
	}

	public double getSSI() {
		return SSI;
	}

	public void setSSI(double SSI) {
		this.SSI = SSI;
	}


	
	

	
	public double AmountToSave()
	{
				
		
		double pmt = FinanceLib.pmt(dAnnualReturnWorking/12, iYearsToWork * 12, 0, 1,454,485.55, false);
		
		return pmt;
	}
	
	public double TotalAmountSaved()
	{
		
		
		double pv = FinanceLib.pv(dAnnualReturnRetired/12, iYearsRetired * 12 , getTheDifference() , 0, false);
	
		return pv;
	}
}
	
