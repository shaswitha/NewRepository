package practice;

public class switchcase {

	public static void main(String[] args) {
		displayCourseDetails("HTML");
	}

	static void displayCourseDetails(String course) {

		switch (course) {
		case "HTML":
			System.out.println("HTML stands for Hyper Text Markup Language");
			System.out.println("We use HTML to communicate with browser");
			System.out.println("HTML consists of different tags and attributes");
			break;
		case "CSS":
			System.out.println("CSS stands for Cascading Style Sheet");
			System.out.println("We use CSS to design web pages");
			System.out.println("We can define css properties in .css file and attach to html file ");
			break;
		case "SQL":
			System.out.println("SQL stands for Structured query langauge");
			System.out.println("We use SQL to communicate with database");
			break;
		default:
			System.out.println("please check input provided");
		}

	}
}
