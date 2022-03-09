package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class FormController implements Initializable{
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}

	@FXML
	private void botaoCadastrarClicado(ActionEvent event) {
		System.out.println("CADASTRADO");
	}
	
	@FXML
	private void botaoCancelarClicado(ActionEvent event) {
		System.out.println("CANSELADO");
	}
	
}
