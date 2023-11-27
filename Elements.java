package assignment;

public class Elements extends Button{
	public static void main(String[] args) {
		WebElement butn=new WebElement();
		butn.click();
		butn.setText("Action");
        
		Button butn1=new Button();
		butn1.submit();
	  
		TextField butn2=new TextField();
		butn2.getText();
		
		CheckBoxButton butn3=new CheckBoxButton();
		butn3.clickCheckButton();
		
		RadioButton butn4=new RadioButton();
		butn4.selectRadioButton();
		
		
	}

}
