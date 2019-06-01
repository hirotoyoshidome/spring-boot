package sample.boot.model;

/**
 * サンプルフォームクラス
 *
 */
public class Person {

    /**
     * 氏名
     */
    private String name;

    /**
     * 年齢
     */
    private String age;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 氏名を取得
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 氏名を設定
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 年齢を取得
     * @return
     */
    public String getAge() {
        return age;
    }

    /**
     * 年齢を設定
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }
}
