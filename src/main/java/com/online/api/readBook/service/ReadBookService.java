package com.online.api.readBook.service;

import java.util.List;

import com.online.cms.cms.readBook.domain.ElectronBook;

/**
 * 在线读书Service类
 * @author willdas
 *
 */
public interface ReadBookService {
	/**
	 * 查找电子书
	 */
	List<ElectronBook> findAll();
}
