package java_Challenges.Linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author kiran dalai
 *
 */
public class Main {

	private static ArrayList<Album> albums = new ArrayList<>();

	/**
	 * Create a program that implements a playlist for songs. Create a song Class
	 * having Title and Duration for a song. The program will have an Album class
	 * containing a list of songs. The albums will be stored in a Aray list. SOngs
	 * from different albums can be added to the playlist and will appear in the
	 * list in the order they are added.
	 * 
	 * once the songs have been added to the playlist , create a menu of options to:
	 * QUit, skip, forward to the next song, skip backwards to a previous song.
	 * Replay the current song. List the songs in the playlist. A song must exit in
	 * an album before it can be added to the playlist(So you can only play songs
	 * that you own).
	 * 
	 * 
	 * As an optional extra provided an option to remove the current song from the
	 * playlist. (hint: listiterator.remove())
	 * 
	 */
	public static void main(String[] args) {
		Album album = new Album("kalifa", "deepinside");
		album.addsong("Strong", 4.5);
		album.addsong("love dont mean a thing", 3.8);
		album.addsong("Hold on", 5.9);
		album.addsong("Oh Baby ", 7.1);
		album.addsong(" this is it ", 3.8);
		albums.add(album);

		album = new Album("number 2", "AC/DC");
		album.addsong("song 1", 2.8);
		album.addsong("song 2", 3.8);
		album.addsong("song 3", 4.8);
		album.addsong("song 4", 5.8);
		album.addsong("song 5", 5.7);
		album.addsong("song 6", 2.7);
		albums.add(album);
		// since we are working on a new arraylist object with number 2 it can be
		// accepted

		LinkedList<Song> playlist = new LinkedList<Song>();
		albums.get(0).addtoplaylist(" playlist 1 ", playlist);
		albums.get(0).addtoplaylist("Song 1", playlist);
		albums.get(0).addtoplaylist("Song 2", playlist);
		albums.get(0).addtoplaylist("Song 3", playlist);
		albums.get(0).addtoplaylist(9, playlist);
		albums.get(0).addtoplaylist(8, playlist);
		albums.get(0).addtoplaylist(7, playlist);
		albums.get(0).addtoplaylist(24, playlist);

		play(playlist);

	}

	private static void play(LinkedList<Song> playlist) {
		ListIterator<Song> list = playlist.listIterator();
		if (playlist.size() == 0) {
			System.out.println(" No songs in playlist ");
			return;
		} else {
			System.out.println("Now playing " + list.next().toString());
		}
	}

}
