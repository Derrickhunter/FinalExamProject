package pkgApp.controller;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	
	@FXML
	private Label labelSave; 
	
	@FXML
	private Label labelNeed;
	
	
	@FXML
	private TextField textYears;
	
	
	@FXML
	private TextField textExpectedReturn;
	
	@FXML
	private TextField textRetired;
	
	@FXML
	private TextField textActualReturn;
	
	@FXML
	private TextField textIncome;
	
	@FXML
	private TextField textSSI;
	
	
	
	
	
	
	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");
		
		labelSave.setText("");
		labelNeed.setText("");
		textYears.setText("");
		textExpected.setText("");
		textRetired.setText("");
		textActualReturn.setText("");
		textIncome.setText("");
		textSSI.setText("");
		
		
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		
		DecimalFormat form = new DecimalFormat("##.00");
		
		int textYears = Integer.parseInt(textYears.getText());
		double textAnnualReturn = Double.parseDouble(textExpected.getText());	
		int textRetired = Integer.parseInt(txtYearsRetired.getText());
		double textRetired = Double.parseDouble(textActualReturn.getText());
		double textIncome = Double.parseDouble(textRequired.getText());
		double textSSI = Double.parseDouble(textSSI.getText());
		
		
		Retirement rt = new Retirement();
		
		rt.setiYears(textYears);
		rt.setdAnnualReturn(textAnnualReturn);
		rt.setRetired(textRetired);
		rt.setRetired(textRetired);
		rt.setdIncome(textIncome);
		rt.setSSI(textSSI);
		
		
		labelSave.setText("$"+ form.format((Math.abs(rt.AmountToSave()))));
		labelNeed.setText("$"+ form.format((Math.abs(rt.TotalAmountSaved()))));
		
		
		
		
		
		
	}
	
}
