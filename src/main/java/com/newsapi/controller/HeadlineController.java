package com.newsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newsapi.Service.HeadlineService;
import com.newsapi.ServiceImpl.HeadlineServiceImpl;
import com.newsapi.model.Newsapi;
import com.newsapi.model.SourceResponce;

@RestController
@RequestMapping("/")
public class HeadlineController {

	@Autowired
	private HeadlineService headlineService;

	public HeadlineController() {
		super();
	}

	@RequestMapping(value = "headLines", method = RequestMethod.GET)
	public Newsapi getHeadLines() {
		return headlineService.getHeadLines();
	}

	@RequestMapping(value = "everyThing", method = RequestMethod.GET)
	public Newsapi getEveryThing() {
		return headlineService.getEveryThing();
	}

	@RequestMapping(value = "sources", method = RequestMethod.GET)
	public SourceResponce getSources() {
		return headlineService.getSources();
	}
	
}
