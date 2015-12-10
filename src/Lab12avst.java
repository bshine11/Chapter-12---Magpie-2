/*************************************
 * Brendan Shine 
 * Mr. Kiedes Period 2               *
 * 12-9-15             
 * Magpie Chatbot with Arrays        *
 *                                   *
 ************************************/

// Lab12avst.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on 
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

import java.util.ArrayList;
import java.util.Scanner;

public class Lab12avst {
	public static void main(String[] args) {
		MagpieLab12a maggie = new MagpieLab12a();

		System.out.println(maggie.getGreeting());
		Scanner in = new Scanner(System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye")) {
			System.out.println(maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}

class MagpieLab12a {
	String[] answers;
	String statement;

	public String getGreeting() {
		return "Hello, let's talk.";
	}

	public String getResponse(String statement) {
		String response = "";
		ArrayList<String> dynamic = new ArrayList<String>();
		dynamic.add(new String("Where was your family's last vacation?"));
		dynamic.add(new String("Tell me more about your family."));
		dynamic.add(new String("Who is your favorite family member?"));
		dynamic.add(new String("What is your father's name?"));
		dynamic.add(new String("Your family seems very nice."));
		dynamic.add(new String("Did you see them on Thanksgiving?"));
		dynamic.add(new String("How old is your father?"));
		dynamic.add(new String("How many people are in your immediate family?"));
		dynamic.add(new String("Your family is cool!"));
		dynamic.add(new String("Are you going to be with your family for Christmas?"));
		
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			final int NUMBER_OF_RESPONSES = dynamic.size();
			double r = Math.random();
			int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
			response = dynamic.get(whichResponse);
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	private String getRandomResponse() {
		answers = new String[10];
		final int NUMBER_OF_RESPONSES = 10;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";
		answers[0] = "Interesting, tell me more.";
		answers[1] = "Hmmm.";
		answers[2] = "Do you really think so?";
		answers[3] = "You don't say.";
		answers[4] = "I am in a talkative mood.";
		answers[5] = "What is your favorite country to visit?";
		answers[6] = "Have you seen a movie recently?";
		answers[7] = "Who do you think will win the Super Bowl?";
		answers[8] = "What is your favorite holiday?";
		answers[9] = "I'm enjoying this conversation.";
		return answers[whichResponse];
	}

}
