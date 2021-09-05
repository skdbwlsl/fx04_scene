package quiz.loginService;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginServiceImpl implements LoginService{

	@Override
	public void LoginProc(Parent root) {
		TextField id = (TextField)root.lookup("#fxId");
		PasswordField pwd = (PasswordField)root.lookup("#fxPwd");
		System.out.println(id.getText());
		System.out.println(pwd.getText());
		
	}

	@Override
	public void CancelProc(Parent root) {
		TextField id = (TextField)root.lookup("#fxId");
		PasswordField pwd = (PasswordField)root.lookup("#fxPwd");
		id.clear();
		pwd.clear();
		
	}

	@Override
	public void OpenMemberShipForm(Parent root) {
		System.out.println("회원가입 버튼이 눌렸습니다");
		
	}

}
