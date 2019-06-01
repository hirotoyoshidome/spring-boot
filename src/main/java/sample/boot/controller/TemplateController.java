/**
 * 
 */
package sample.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author H.Yoshi
 *
 */
@Controller
public class TemplateController {
	@GetMapping("/tpl")
	public String temp() {
		return "contents/Tpl";
	}
}
