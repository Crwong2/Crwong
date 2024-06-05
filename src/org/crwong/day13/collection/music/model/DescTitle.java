package org.crwong.day13.collection.music.model;

import java.util.Comparator;

public class DescTitle implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		return o1.getTitle().compareTo(o2.getTitle())*-1; // -1을 곱해서 역순으로, 즉 내림차순으로!
	}

}
