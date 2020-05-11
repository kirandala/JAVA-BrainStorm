package java_09_OOPs_Polymorphism.one;

/**
 * @author kiran dalai
 *
 */
class Movie {

	private String name;

	public Movie(String name) {
		this.name = name;
	}

	public String plot() {
		return "No plot here";
	}

	public String getName() {
		return name;
	}

}

class Jaws extends Movie {

	public Jaws() {
		super("jaws");
	}

	@Override
	public String plot() {
		return "A shark eats lots of people";
	}
	}
class India extends Movie {

		public India() {
			super(" India movie ");
		}

		@Override
		public String plot() {
			return "pakistan's attempt to take india";
		}
	}

class MazeRunner extends Movie {

		public MazeRunner() {
			super("Maze runner");
		}

		@Override
		public String plot() {
			// TODO Auto-generated method stub
			return "Kids try to escape a maze";
		}
	}

class Starwars extends Movie {

	public Starwars() {
		super("Star wars");
	}

	@Override
	public String plot() {
		return "Imperial forces try to take over universe";
	}
}

class Forgetable extends Movie {
	public Forgetable() {
		super("forgetable");
	}
}

public class Main {
	/*
	 * polymorphism is mechanism which allows actions based on the actual object
	 * that the action is performed on (not clear but we can understand with the
	 * example below)
	 */
	public static void main(String[] args) {
		
		for(int i =1;i<5;i++) {
			Movie movie= randommovie();
			System.out.println("Movie attempt "+ i+ movie.getName()+ "\n"+ "plot "+ movie.plot()+ "\n");
		
		}
	}

	public static Movie randommovie() {
		int randomNum = (int) (Math.random() * 5) + 1;
		System.out.println("Randam number generated was "+ randomNum);
		switch(randomNum) {
		case 1:
			return new Jaws();
		case 2:
			return new India();
		case 3:
			return new MazeRunner();
		case 4:
			return new Starwars();
		case 5:
			return new Forgetable();
		}
		
	return null;	
	}
}
