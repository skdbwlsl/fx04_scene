package quiz;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import quiz.loginService.LoginService;
import quiz.loginService.LoginServiceImpl;

public class Controller implements Initializable{
	Parent root;
	LoginService ls;
	public void setRoot(Parent root) {
		this.root = root;
	}
	public void LoginProc() {
		//System.out.println("로그인");
		ls.LoginProc(root);
	}
	public void CancelProc() {
		//System.out.println("취소");
		ls.CancelProc(root);
	}
	public void MemberShipProc() {
		//System.out.println("회원가입");
		ls.OpenMemberShipForm(root);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ls = new LoginServiceImpl();
		
	}

}
