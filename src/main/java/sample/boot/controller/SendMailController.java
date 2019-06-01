/**
 * 
 */
package sample.boot.controller;

import org.springframework.web.bind.annotation.PostMapping;

/**
 * メンバー登録完了後にメールを自動送信
 * 
 * @author H.Yoshi
 *
 */
public class SendMailController {
	/**
	 * メールを送信する getは使用しないように設定する
	 * 
	 * @return
	 */
	@PostMapping("/sendMail")
	public String sendMail() {
		// TODO : javaMailは使用しなくてもできるか？
		// できれば外部のものを使用したい
		return "";
	}
}
