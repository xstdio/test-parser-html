package io.klaver.tika.test;
import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tika.exception.TikaException;
import org.junit.Ignore;
import org.junit.Test;
import org.xml.sax.SAXException;

import io.klaver.jsoup.UtilJsoup;
import io.klaver.others.UtilHttp;
import io.klaver.selenium.UtilSelenium;
import io.klaver.tika.UtilTika;

public class TestParser {

	private static final Logger logger = LogManager.getLogger(TestParser.class);
	private static final String url = "http://jamaica-gleaner.com/article/lead-stories/20170712/new-traffic-act-needed-now-jones-calls-revised-law-be-passed-support";
	
	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Ignore
	@Test
	public void testtika() {
		UtilHttp http_helper = new UtilHttp();
		http_helper.downloadNIO(url);
		
		UtilTika tika_helper = new UtilTika();
		try {
			tika_helper.parseHTML();
		} catch (IOException | SAXException | TikaException e) {
			e.printStackTrace();
		}
		
	}
	
	@Ignore
	@Test
	public void testjsoup() {
		UtilJsoup jsoup_helper = new UtilJsoup();
		try {
			jsoup_helper.parseHTTP(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testselenium() {
		UtilSelenium selenium_helper = new UtilSelenium();
		selenium_helper.parseHTML("http://checkip.dyndns.com/");
//		selenium_helper.parseHTML(url);	
	}
}
