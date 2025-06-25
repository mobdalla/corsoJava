package login;

import java.awt.Color;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		GridPane griglia = new GridPane();
		griglia.setAlignment(Pos.CENTER);
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		griglia.setPadding(new Insets(5));
		
		Scene scene = new Scene(griglia, 500, 400);
		Text titolo = new Text("ITS");
		titolo.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD,FontPosture.REGULAR,30));
		
		griglia.add(titolo, 0, 0,2,1);
		Label lblUser = new Label("Username");
		Label lblPass = new Label("password");
		
		TextField tfUser = new TextField();
		PasswordField tfPass = new PasswordField();
		
		griglia.add(lblUser, 0,1);
		griglia.add(tfUser, 1,1);
		griglia.add(lblPass, 0,2);
		griglia.add(tfPass, 1,2);
		Button btnLogin = new  Button("Login");
		
		btnLogin.setOnAction(e->{
			
			if (tfUser.getText().equals("its") && tfPass.getText().equals("12345")) {
				System.out.println("sei loggato");
			}
			
		});
		griglia.add(btnLogin, 1, 3);
		
		stage.setTitle("Banca ITS - Servizio Fidati");
		stage.setScene(scene);
		stage.show();
	}

}
