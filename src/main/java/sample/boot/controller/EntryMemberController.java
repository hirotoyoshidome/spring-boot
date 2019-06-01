/**
 * 
 */
package sample.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * <li>メンバー登録用コントローラ</li>
 * <li>メンバー登録は義務ではないようにする</li>
 * 
 * @author H.Yoshi
 *
 */
@Controller
public class EntryMemberController {

	/**
	 * <li>メンバー登録画面表示。</li>
	 * <li>getではアクセスできないように設定する</li>
	 * 
	 * @return
	 */
	@PostMapping("/entryMember")
	public String entryMember() {
		// TODO(H.Y) : spring標準のトークンを使用する
		// 登録情報はForm参照
		return "contents/EntryMember";
	}

	/**
	 * 仮の実装
	 * TODO : getで初期表示するようにするか要検討
	 * 
	 * @return
	 */
	@GetMapping("/entryMember")
	public String samp() {
		return "contents/EntryMember";
	}
}
