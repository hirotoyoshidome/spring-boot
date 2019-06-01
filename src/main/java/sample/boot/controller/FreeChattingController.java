/**
 * 
 */
package sample.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * フルーチャット用コントローラ
 * 
 * @author H.Yoshi
 *
 */
public class FreeChattingController {

	/**
	 * メニューバーから遷移予定
	 * 
	 * @return
	 */
	@GetMapping("/freeChatting")
	public String freeCatting() {
		// TODO : この中でトークルーム選択を行う
		return "";
	}
}
