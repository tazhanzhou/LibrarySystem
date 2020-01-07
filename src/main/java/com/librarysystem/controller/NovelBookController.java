package com.librarysystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.librarysystem.service.BookService;

@Controller
@RequestMapping("/novelbooks")
public class NovelBookController {
	@Autowired
	BookService service;

}
