package cn.crxy.spider.download;

import cn.crxy.spider.Utils.PageUtils;
import cn.crxy.spider.domain.Page;

public class HttpclientDownloadImpl implements Downloadable {

	@Override
	public Page download(String url) {
		Page page = new Page();
		String content = PageUtils.getContent(url);
		page.setContent(content);
		page.setUrl(url);
		return page;
	}

}
