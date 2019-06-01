/**
 * 
 */
package sample.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ログアウト用のコントローラ
 * 
 * @author H.Yoshi
 *
 */
@Controller
public class LogoutController {

	/**
	 * ログアウト後画面表示 TODO : ログアウト後はトプ画面に遷移する
	 * 
	 * @return
	 */
	@PostMapping("/logout")
	public String logout() {
		// TODO セッション破棄
		return "contents/Logout";
	}

	/**
	 * 仮実装
	 */
	@GetMapping
	public String samp() {
		return "contents/Logout";
	}
}
