package sample.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.boot.mapper.PersonMapper;
import sample.boot.model.Person;

/**
 * myBatis確認用のサンプルコントローラ
 * TODO H2DBを設定するため一時コメントアウト
 * http://localhost:8080/boot/h2-consoleで設定
 */
@Controller
public class PersonController {
    /**
     * sqlで取得したものを自動でDIする
     */
    @Autowired
    PersonMapper personMapper;

    /**
     * 確認用フォーワード
     * @param model
     * @return
     */
    @RequestMapping("/person")
    public String person(Model model) {
        List<Person> list = personMapper.findAll();
        model.addAttribute("list", list);
        return "index";
    }
}
