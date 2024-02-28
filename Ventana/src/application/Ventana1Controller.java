package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

public class Ventana1Controller {
	@FXML
	private TextField textfield1;
	@FXML
	private Button button1;

	// Event Listener on Button[#button1].onMouseClicked
	@FXML
	public void btn1control(MouseEvent event) {
		System.out.println("hola");
	}
}
