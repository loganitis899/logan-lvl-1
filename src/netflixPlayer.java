
public class netflixPlayer {
	public static void main(String[] args) {
		
	Movie kingsmen= new Movie("kingsmen",10);
	Movie pacificRim= new Movie("pacificRim",8);
	Movie suicideSquad= new Movie("suicideSquad",5);
	Movie inception= new Movie("inception",9);
	Movie twilight= new Movie("twighlight",0);
	//1. Instantiate some Movie objects (at least 5).
		
			//2. Use the Movie class to get the ticket price of one of your movies.
System.out.println(kingsmen.getTicketPrice());
pacificRim.getTicketPrice();
suicideSquad.getTicketPrice();
inception.getTicketPrice();
twilight.getTicketPrice();
			//3. Instantiate a NetflixQueue.
NetflixQ que = new NetflixQ();
			//4. Add your movies to the Netflix queue.
que.addMovie(kingsmen);
que.addMovie(pacificRim);
que.addMovie(suicideSquad);
que.addMovie(inception);
que.addMovie(twilight);
			//5. Print all the movies in your queue.
		que.printMovies();
			//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
		que.sortMoviesByRating();
		System.out.println("teh bustest moovye jis "+que.getBestMovie());
		System.out.println("Secoond bust muvy is "+que.getMovie(1));
			//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 


}
}
