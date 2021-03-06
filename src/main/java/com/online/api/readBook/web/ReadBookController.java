package com.online.api.readBook.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.commons.util.AccessLogUtil;
import com.online.api.readBook.service.ReadBookService;
import com.online.cms.cms.readBook.domain.ElectronBook;
import com.online.cms.sys.log.accessLog.domain.AccessLog;
import com.online.cms.sys.log.accessLog.service.AccessLogService;

/**
 * 在线阅读电子书Api
 * @author willdas
 *
 */
@Controller
@RequestMapping("/book")
public class ReadBookController {
	
	@Autowired
	private ReadBookService readBookService;
	
	@Autowired
	private AccessLogService accessService;
	
	/**
	 * 查找某个类型下所有电子书
	 * @return
	 */
	@RequestMapping("/read/{type}.html")
	public String getBooks(@PathVariable("type") String type,Model model,HttpServletRequest request){
		// 转换成大写
		String occupation = type.toUpperCase();
		AccessLog accessLog = AccessLogUtil.accessLog(occupation, request);
		accessService.insertAccessLog(accessLog);
		List<ElectronBook> EBooks = readBookService.findBookByType(occupation);
		model.addAttribute("listBooks", EBooks);
		return "html/books";
	}
	
	/**
	 * 查看电子书简介
	 * @param id
	 * @return
	 */
	@RequestMapping("/detail/{id}.html")
	public String getBookDetail(@PathVariable("id") String id,Model model){
		ElectronBook EBook = readBookService.findEBookById(id);
		model.addAttribute("EBook",EBook);
		return "html/detail";
	}

}


