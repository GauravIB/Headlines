package com.newsapi.Service;

import com.newsapi.model.Newsapi;
import com.newsapi.model.SourceResponce;

public interface HeadlineService {

	Newsapi getHeadLines();
	
	Newsapi getEveryThing();

	SourceResponce getSources();

}
