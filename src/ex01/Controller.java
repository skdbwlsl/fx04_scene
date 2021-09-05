package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	//방법1.
	@FXML TextField fxId;//씬빌더에 있는 내용을 가져오는것.이방법이 방법2보다 간편하다
	@FXML PasswordField fxPwd;
	
	//방법2.
	private Parent root;  //root값은 setroot를 이용해 setroot값 전달을해서 그 root를 이용해서 fxid를 이용해서 사용해야하니 더 번거롭다
	
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	//LoginProc() 기능 만들기
	public void LoginProc(){
		System.out.println("로그인 버튼 클릭");
		TextField t= (TextField)root.lookup("#fxId");//eventtest의 textfield에 대한 아이디를 얻어올 수 있다.#을 꼭 써야한다
		System.out.println(t.getText());
		System.out.println("어노테이션 사용 :  "+ fxId.getText());
		//로그인 버튼을 클릭하면 LoginProc코드가 실행되면서 사용자가 입력한 값을 얻어온다
	}

}
