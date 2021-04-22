package ro.ase.cts.seminar9;

public class YoutubeLibraryProxy implements YoutubeLibraryInterface {
	private YoutubeLibraryInterface libImplementaion;

	public YoutubeLibraryProxy() {
		libImplementaion = new YoutubeLibrary();
	}

	@Override
	public String listVideos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVideoInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
