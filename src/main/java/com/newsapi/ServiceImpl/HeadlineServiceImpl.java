package com.newsapi.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.newsapi.Service.HeadlineService;
import com.newsapi.model.Newsapi;
import com.newsapi.model.SourceResponce;

@Service
public class HeadlineServiceImpl implements HeadlineService {

	private RestTemplate template = new RestTemplate();

	@Override
	public Newsapi getHeadLines() {
		String url = "https://newsapi.org/v2/top-headlines?country=us&apiKey=dd94ff7a480b4be5b773fdd61c4cb569";
		Newsapi headlines = template.getForObject(url, Newsapi.class, List.class);
		return headlines;
	}

	@Override
	public Newsapi getEveryThing() {
		String url = "https://newsapi.org/v2/everything?q=bitcoin&apiKey=dd94ff7a480b4be5b773fdd61c4cb569";
		Newsapi everyThing = template.getForObject(url, Newsapi.class, List.class);
		return everyThing;
	}

	@Override
	public SourceResponce getSources() {
		String url = "https://newsapi.org/v2/sources?apiKey=dd94ff7a480b4be5b773fdd61c4cb569";
		SourceResponce sources = template.getForObject(url, SourceResponce.class, List.class);
		return sources;
	}

}
