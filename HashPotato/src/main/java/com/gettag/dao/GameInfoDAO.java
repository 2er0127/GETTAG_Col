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
		jep.eval("def cleanText(readData):" + "\n" + "\t"
				+ "text = re.sub('[-=+,#/\\?:^$.@*\\\"※~&%ㆍ!』\\\\‘|\\(\\)\\[\\]\\<\\>`\\'…》]', '', readData)" + "\n"
				+ "\t" + "return text");

		
		
		
		// 게임 검색 결과 메소드
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
				
				// 입력받은 게임제목이 포함된 결과만 각 리스트에 저장 
				+ "\n" + "\t" + "for i in range(len(title_list)):"
				+ "\n" + "\t" + "\t" + "if(cleanText(userS.lower()) in cleanText(title_list[i].text.lower())):"
				+ "\n" + "\t" + "\t" + "\t" + "title.append(title_list[i].text)"
				+ "\n" + "\t" + "\t" + "\t" + "release.append(release_list[i].text)"
				+ "\n" + "\t" + "\t" + "\t" + "thumbnail.append(thumbnail_list[i])"
				+ "\n" + "\t" + "\t" + "\t" + "appid.append(appid_list[i])"
				);
		
		
		
		
		
	
		// 특정 게임 정보 메소드
		jep.eval("def detailGameInfo(app_id):"
				+ "\n" + "\t" + "url = 'https://store.steampowered.com/app/'+app_id"
				+ "\n" + "\t" + "response = requests.get(url)"
				+ "\n" + "\t" + "html = response.text"
				+ "\n" + "\t" + "soup = BeautifulSoup(html, 'html.parser')"
				
				// GAME TITLE
				+ "\n" + "\t" + "gTitle = soup.select_one('.apphub_AppName').text"
				+ "\n" + "\t" + "print(gTitle)"
				
				// RELEASE DATE
				+ "\n" + "\t" + "gDate = soup.select_one('.date').text"
				+ "\n" + "\t" + "print(gDate)"
				
				// GAME TAG
				+ "\n" + "\t" + "gTags = soup.select('.app_tag')"
				// gTags 안에 배열형식으로 태그 저장
			/*	+ "\n" + "\t" + "for i in range(0,len(gTags)):"
				+ "\n" + "\t" + "\t" + "print(gTags[i].text)"	*/	//gTags에 저장된 함수 출력하는 코드
				
				
				// THUMBNAIL
				+ "\n" + "\t" + "gImage = soup.find(\"img\",{\"class\":\"game_header_image_full\"}).get('src')"
				);
		
		

	}
}

