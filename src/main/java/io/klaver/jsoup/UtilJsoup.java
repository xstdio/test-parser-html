package io.klaver.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class UtilJsoup {
	public void parseHTTP(String url) throws IOException {
		Document doc = Jsoup.connect(url).get();
		Element body = doc.body();
		//System.out.println(body.toString());
		Elements content = doc.select(".field-items");
		System.out.println(content.toString());
	}
}
