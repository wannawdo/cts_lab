package ro.ase.cts.seminar9.main;

import ro.ase.cts.seminar9.YoutubeLibrary;
import ro.ase.cts.seminar9.YoutubeLibraryInterface;

public class Main {

	public static void main(String[] args) {
		YoutubeLibraryInterface youtubeLib=new YoutubeLibrary();
		System.out.println(youtubeLib.listVideos());
		System.out.println(youtubeLib.getVideoInfo(1));

	}

}
