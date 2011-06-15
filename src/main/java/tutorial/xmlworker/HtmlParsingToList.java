package tutorial.xmlworker;

import java.io.IOException;
import java.util.List;

import com.itextpdf.text.Element;
import com.itextpdf.tool.xml.ElementHandler;
import com.itextpdf.tool.xml.Writable;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.pipeline.WritableElement;

public class HtmlParsingToList {

	public static void main(String[] args) throws IOException {
		XMLWorkerHelper.getInstance().parseXHtml(new ElementHandler() {

			public void add(final Writable w) {
				if (w instanceof WritableElement) {
					List<Element> elements = ((WritableElement)w).elements();
					System.out.println(elements.get(0).getClass().getName());
				}

			}
		}, HtmlParsingToList.class.getResourceAsStream("/html/walden.html"));
	}
}
