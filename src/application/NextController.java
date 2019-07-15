package application;

import java.io.IOException;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

public class NextController {
	@FXML
	private Button nextPage_button;

	@FXML
	public void nextPage_button_onClick(Event eve) {
		/*
		 * 現在表示されている画面を閉じる
		 */
		Scene s = ((Node)eve.getSource()).getScene();
		Window window = s.getWindow();
		window.hide();

		/*
		 * 新しい画面を生成する
		 */
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("Index.fxml"));
			Scene scene = new Scene(parent);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("画面１");
			stage.show();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
