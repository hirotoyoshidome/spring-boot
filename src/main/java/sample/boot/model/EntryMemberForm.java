/**
 * 
 */
package sample.boot.model;

import java.util.Date;

/**
 * メンバー登録時のフォーム // TODO : フォームパッケージに移動 setter getterは後で生成
 * 
 * @author H.Yoshi
 *
 */
public class EntryMemberForm {

	/**
	 * 名前
	 */
	private String first_name;

	/**
	 * 苗字
	 */
	private String last_name;

	/**
	 * 年齢
	 */
	private String age;

	/**
	 * 生年月日
	 */
	private Date birth_day;

	/**
	 * 性別
	 */
	private String gender;

	/**
	 * 職業
	 */
	private String occupation;

	/**
	 * メールアドレス
	 */
	private String mailAddress;

	/**
	 * オンライン・オフライン判定
	 */
	private String state;

}
