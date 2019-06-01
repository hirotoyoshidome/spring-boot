# spring_boot
==============

# spring boot 最小構成

## 環境
* java 8
* springFramework boot 2.0.1
* maven3.5.2
* thymeleaf 3.0.1


### 起動
* DemoApplication.javaのmainメソッドを起動することで自動的に開始する
* application.propertiesでコンテキスト部分の修正をしているため
```
http://localhost:8080/boot/
```
で初期画面が表示される
この画面でH2DBにJBDCを接続して動作確認を行ってみた。
```
http://localhost:8080/boot/tpl
```
この画面でレイアウトの挿入の部分を行ってみた

```
http://localhost:8080/boot/person
```
この画面でMyBatisの動作確認を行ってみた。
