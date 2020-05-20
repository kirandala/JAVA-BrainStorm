package java_Challenges.Linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author kiran dalai
 *
 */
public class Album {
	private String name;
	private String artists;
	private ArrayList<Song> songs;

	public Album(String title, String artists) {
		this.name = title;
		this.artists = artists;
		this.songs = new ArrayList<Song>();
	}

	public boolean addsong(String title, double duration) {
		// trying to avoid duplication of the songs
		if (findsong(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}

	private Song findsong(String title) {
		for (Song checkedsong : this.songs) {
			if (checkedsong.getName().equals(title)) {
				return checkedsong;
			}
		}
		return null;
	}

	public boolean addtoplaylist(int tracknumber, LinkedList<Song> playlist) {
		int index = tracknumber - 1;
		if ((index >= 0) && (index <= this.songs.size())) {
			playlist.add(this.songs.get(index));
			return true;
		}
		System.out.println("This album doest not have a track" + tracknumber);
		return false;
	}

	public boolean addtoplaylist(String title, LinkedList<Song> playlist) {
		Song checkedsong = findsong(title);

		if (checkedsong != null) {
			playlist.add(checkedsong);
			return true;
		}
		System.out.println("This song " + title + "  is not in this album");
		return false;

	}
}
