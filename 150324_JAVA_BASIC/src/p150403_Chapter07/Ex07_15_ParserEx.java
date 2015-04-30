package p150403_Chapter07;
/* 인터페이스 예제
 * */
public class Ex07_15_ParserEx {
	public static void main(String[] args) {
		Parsable parser = ParserManager.getParser("XML");
		parser.parse("doc.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("doc2.html");		
	}
	public static interface Parsable {
		void parse(String fileName);		
	}
	public static class ParserManager {
		public static Parsable getParser(String type){
			if(type.equals("XML"))		return new XMLParser();
										else				return new HTMLParser();
		}
	}
	public static class XMLParser implements Parsable {
		@Override
		public void parse(String fileName) {
			System.out.println(fileName + "\t: XML parsing !");			
		}
	}
	public static class HTMLParser implements Parsable {
		@Override
		public void parse(String fileName) {
			System.out.println(fileName + "\t: HTML parsing !");
		};
	}
}
//doc.xml	: XML parsing !
//doc2.html	: HTML parsing !
