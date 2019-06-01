/**
 * 
 */
package sample.boot.model;

import java.util.List;

/**
 * フリーチャット用のフォーム // TODO : 後でformパッケージに移動
 * 
 * @author H.Yoshi
 *
 */
public class FreeChattingForm {
	/**
	 * フリーチャットの議題
	 */
	private String agenda;

	/**
	 * フリーチャット時のID
	 */
	private String id;

	/**
	 * テキストコメント
	 */
	private String comment;

	/**
	 * メンション
	 */
	private String mention;

	/**
	 * そのグループのメンバー
	 */
	private List<String> members;
}
