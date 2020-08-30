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
				// 게임 제목
				+ "\n" + "\t" + "title_list = soup.select('span[class=title]')"
				+ "\n" + "\t" + "print('title_list : ' + str(len(title_list)))"
				// 게임 출시일
				+ "\n" + "\t" + "release_list = soup.select('.search_released')"
				+ "\n" + "\t" + "print('title_list : ' + str(len(release_list)))"
				// 게임 썸네일 링크
				+ "\n" + "\t" + "Thumbnail_lists = soup.select('img[srcset]')"
				+ "\n" + "\t" + "thumbnail_list = []"
				+ "\n" + "\t" + "for link in Thumbnail_lists:"
				+ "\n" + "\t" + "\t" + "thumbnail_list.append(link.get('src'))"
				+ "\n" + "\t" + "print(\"thunbmanil_list : \" + str(len(thumbnail_list)))"
				// 게임 고유 번호
				+ "\n" + "\t" + "Appid_lists = soup.select('a[data-ds-appid]')"
				+ "\n" + "\t" + "appid_list = []"
				+ "\n" + "\t" + "for link in Appid_lists:"
				+ "\n" + "\t" + "\t" + "appid_list.append(link.get('data-ds-appid'))"
				+ "\n" + "\t" + "print(\"appid_list : \" + str(len(appid_list)))"
				
				
				+ "\n" + "\t" + "title = []"
				+ "\n" + "\t" + "release = []"
				+ "\n" + "\t" + "thumbnail = []"
				+ "\n" + "\t" + "appid = []"
				
				// 입력받은 게임제목이 포함된 결과만 저장 
				+ "\n" + "\t" + "for i in range(len(title_list)):"
				+ "\n" + "\t" + "\t" + "if(cleanText(userS.lower()) in cleanText(title_list[i].text.lower())):"
				+ "\n" + "\t" + "\t" + "\t" + "title.append(title_list[i].text)"
				+ "\n" + "\t" + "\t" + "\t" + "release.append(release_list[i].text)"
				+ "\n" + "\t" + "\t" + "\t" + "thumbnail.append(thumbnail_list[i])"
				+ "\n" + "\t" + "\t" + "\t" + "appid.append(appid_list[i])"
				+ "\n" + "\t" + "print(title)"
				+ "\n" + "\t" + "print(release)"
				+ "\n" + "\t" + "print(thumbnail)"
				+ "\n" + "\t" + "print(appid)"
				);
		
		
//		jep.eval("gtitle = cleanText('Don,t Starve')");
//		jep.eval("print(searchGame(gtitle))");
		
	}
}


