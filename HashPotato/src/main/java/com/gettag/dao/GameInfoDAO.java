package com.gettag.dao;

import com.gettag.vo.GameInfoVO;

import jep.Jep;

public class GameInfoDAO {
	
	private GameInfoDAO gameInfo = new GameInfoDAO();
	
	
	public void cleanText(GameInfoVO gameinfo) throws Exception {
		Jep jep = new Jep(false,"C:\\Python27\\Scripts");
		jep.eval("from bs4 import BeautifulSoup");
		jep.eval("import requests");
		jep.eval("import re");
		
		// 특수문자제거
		jep.eval("def cleanText(readData):"
				+ "\n" + "\t" + "text = re.sub('[-=+,#/\\?:^$.@*\\\"※~&%ㆍ!』\\\\‘|\\(\\)\\[\\]\\<\\>`\\'…》]', '', readData)"
				+ "\n" + "\t" + "return text");
		
		// 게임 검색 결과
		jep.eval("def searchGame(userS):"
				+ "\n" + "\t" + "url = 'https://store.steampowered.com/search/?term='+ userS"
				+ "\n" + "\t" + "response = requests.get(url)"
				+ "\n" + "\t" + "html = response.text"
				+ "\n" + "\t" + "soup = BeautifulSoup(html, 'html.parser')"
				+ "\n" + "\t" + "title_list = soup.select('span[class=title]')"		// 게임 제목
				+ "\n" + "\t" + "print('title_list : ' + str(len(title_list)))"
				+ "\n" + "\t" + "release_list = soup.select('.search_released')"		// 게임 출시일
				+ "\n" + "\t" + "print('title_list : ' + str(len(release_list)))"
				+ "\n" + "\t" + "thumbnail_list = soup.select('.search_capsule')"	// 게임 썸네일 링크
				+ "\n" + "\t" + "print('title_list : ' + str(len(thumbnail_list)))"
				+ "\n" + "\t" + "appid_list = soup.select('.search_result_row')"
				+ "\n" + "\t" + "print('appid_list : ' + str(len(title_list)))"		// 게임 고유 번호
				);
		jep.eval("gtitle = cleanText('Don,t Starve')");
		jep.eval("print(searchGame(gtitle))");
		
		
		
	}
}







