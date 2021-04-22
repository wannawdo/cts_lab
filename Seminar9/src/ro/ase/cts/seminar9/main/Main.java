package ro.ase.cts.seminar9.main;

import ro.ase.cts.seminar9.YoutubeLibrary;
import ro.ase.cts.seminar9.YoutubeLibraryInterface;
import ro.ase.cts.seminar9.YoutubeLibraryProxy;
import ro.ase.cts.seminar9.flyweight.Model3DFactory;
import ro.ase.cts.seminar9.flyweight.ModelFlyweightInterface;
import ro.ase.cts.seminar9.flyweight.ModelType;
import ro.ase.cts.seminar9.flyweight.ScreenData;

public class Main {

	public static void main(String[] args) {
		// without proxy
		YoutubeLibraryInterface youtubeLib = new YoutubeLibrary();
		System.out.println(youtubeLib.listVideos());
		System.out.println(youtubeLib.getVideoInfo(1));
		System.out.println("------------------PROXY--------------------");

		// withproxy
		YoutubeLibraryInterface youtubeLibProxy = new YoutubeLibraryProxy();
		System.out.println(youtubeLibProxy.listVideos());
		System.out.println(youtubeLibProxy.listVideos());
		System.out.println(youtubeLibProxy.getVideoInfo(1));
		System.out.println(youtubeLibProxy.getVideoInfo(1));
		
		System.out.println("-----------------FLYWEIGHT---------------------");
		ScreenData dataSet1= new ScreenData("green", 99, 33, 100);
		ScreenData dataSet2= new ScreenData("green", 88, 22, 44);
		ModelFlyweightInterface solider1=Model3DFactory.getModel(ModelType.SOLIDER);
		ModelFlyweightInterface solider2=Model3DFactory.getModel(ModelType.SOLIDER);
		solider1.display(dataSet1);
		solider1.display(dataSet2);
		solider2.display(dataSet2);
	}

}
