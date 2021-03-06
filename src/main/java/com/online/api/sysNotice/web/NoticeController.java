package com.online.api.sysNotice.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.online.api.sysNotice.service.NoticeService;
import com.online.cms.sys.sysNotice.domain.SysNotice;

/**
 * 系统公告Controller类
 * @author wangzewen
 *
 */
@Controller
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("/sysNotice")
	@ResponseBody
	public List<SysNotice> getSysNotice(String type){
		return noticeService.getSysNotice(type);
	}
}
