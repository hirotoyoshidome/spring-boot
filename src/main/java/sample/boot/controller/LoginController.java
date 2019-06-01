/**
 * 
 */
package sample.boot.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ログイン用のコントローラ
 * 
 * @author H.Yoshi
 *
 */
@Controller
public class LoginController {

	/**
	 * ログイン画面初期表示 TODO : ログイン画面からログイン・アカウントを作成・ゲストログインを選択可能にする
	 * 
	 * @return
	 */
	@GetMapping("/login")
	public String login(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				System.out.println("Cookieから取得します");
				System.out.println("cookieName : " + c.getName() + " : cookieValue : " + c.getValue());
			}
		}
		return "contents/Login";
	}

}
