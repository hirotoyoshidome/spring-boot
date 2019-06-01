/**
 *
 */
package sample.boot.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author H.Yoshi
 *
 */
@Controller
@EnableAutoConfiguration
public class HelloController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * http://localhost:8080/で出力 jdbcTemplateを使用してのsql実行
	 * 
	 * @return
	 */
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		String create = "CREATE TABLE Customers (\r\n" + "  id varchar(30),\r\n" + "  first_name varchar(30),\r\n"
				+ "  last_name varchar(30),\r\n" + "  address varchar\r\n" + ")";
		String query = "select * from customers";
		String insert = "insert into customers (id, first_name, last_name, address) values (3, '', '', '')";
		String delete = "delete from customers where id = 3";
		String update = "update customers set first_name = 'ああ' where id = 2";
		jdbcTemplate.execute(insert);

		List<Map<String, Object>> result = jdbcTemplate.queryForList(query);

		for (Map<String, Object> map : result) {
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				System.out.println("key : " + entry.getKey());
				System.out.println("value : " + entry.getValue());
			}
		}
		jdbcTemplate.execute(update); // ２回目以降に変更確認
		jdbcTemplate.execute(delete);
		return "Hello world !!!";
	}

	@RequestMapping("/demo")
	public String demo(HttpServletRequest request, HttpServletResponse response, Model model) {
		model.addAttribute("hello", "HELLO");
		model.addAttribute("title", "demo");
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("key")) {
					int count = Integer.parseInt(c.getValue()) + 1;
					System.out.println(count + "回目の訪問です");
					c.setValue(String.valueOf(count));
					response.addCookie(c);
				}
			}
		} else {
			System.out.println("1回目の訪問です");
			Cookie cookie = new Cookie("key", "1");
			cookie.setMaxAge(180);
			System.out.println("Cookieにセットします");
			response.addCookie(cookie);
		}

		return "contents/hello";
	}

	@RequestMapping("/layout")
	public String layout(Model model) {
		model.addAttribute("hello", "HELLO");
		model.addAttribute("title", "demo");
		return "index";
	}
}
