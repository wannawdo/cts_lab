package ro.ase.cts.seminar9;

import java.util.HashMap;

public class YoutubeLibraryProxy implements YoutubeLibraryInterface {
	private YoutubeLibraryInterface libImplementaion;
	private String videoListCached;
	private HashMap<Integer, String> videoDescriptionsCached;
	private boolean hasExpired;

	public YoutubeLibraryProxy() {
		libImplementaion = new YoutubeLibrary();
		hasExpired = false;
		videoDescriptionsCached=new HashMap<>();
	}

	@Override
	public String listVideos() {
		// lazy instantiation
		if (videoListCached == null || hasExpired) {
			videoListCached = libImplementaion.listVideos();
		}
		return videoListCached;
	}

	@Override
	public String getVideoInfo(int id) {
		if (videoDescriptionsCached.get(id) == null || hasExpired) {
			videoDescriptionsCached.put(id, libImplementaion.getVideoInfo(id));
		}
		return videoDescriptionsCached.get(id);
	}

}
