package ex01;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		//1번 절차 :loader을 이용해 해당하는 내용을 가지고온다(eventTest.fxml)
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventTest.fxml"));
		//2번 절차 : 갖고온 내용을 이용해서 load(실행)하겠다. 그런뒤 해당하는 pane을 얻어와서 root로 들어온다
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		
		//이렇게 두가지고 나누는 이유는 컨트롤러를 얻어올 수 있다. 이전에 하던 방식은 바로 pane으로 들어오기 때문에 컨트롤러를 얻어올 수 없다.
		//loader안에 있는 컨트롤러(우리가 설정한 이벤트 테스트에서 설정한 컨트롤러 객체를 말함) 객체를 얻어올 수 있다
		//컨트롤러에 있는 기능을 root를 이용해서 쓸 수 있게 된다
		Controller ctl = loader.getController();
		ctl.setRoot(root); //우리가 만든 root값을 넘겨준다
		
		primaryStage.setScene(scene);  //scene등록
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
