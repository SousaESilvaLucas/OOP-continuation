package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class ExComposition2 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment comment11, comment12, comment21, comment22;
		Post post1, post2;
		
		comment11 = new Comment("Have a nice trip");
		comment12 = new Comment("Wow that's awesome"); 
		comment21 = new Comment("Good night");
		comment22 = new Comment("May the Force be with you!");
		
		post1 = new Post(sdf.parse("21/06/2018 13:05:44"),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		post1.addComment(comment11);
		post1.addComment(comment12);
		
		post2 = new Post(sdf.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"See you tomorrow",
				5);
		
		post2.addComment(comment21);
		post2.addComment(comment22);
		System.out.println(post1);
		System.out.println(post2);
		
		
	}

}
