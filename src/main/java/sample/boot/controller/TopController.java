/**
 * 
 */
package sample.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * トップ画面用コントローラ
 * 
 * @author H.Yoshi
 *
 */
@Controller
public class TopController {

	/**
	 * トップ画面初期表示
	 * 
	 * @return
	 */
	@GetMapping("/Top")
	public String topGet() {
		// TODO : トップ画面にメニューバー追加
		return "contents/Top";
	}

}
