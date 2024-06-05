package org.crwong.day13.collection.music.model;

public class Music implements Comparable<Music>{ // implements Comparable<Music>은 Collections.sort(mList)의 sort를 구현하기 위해 필요
		// 곡명 title, 가수명 singer
		private String title;
		private String singer;
		
		public Music() {}

		public Music(String title, String singer) {
			super();
			this.title = title;
			this.singer = singer;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getSinger() {
			return singer;
		}

		public void setSinger(String singer) {
			this.singer = singer;
		}

		@Override
		public String toString() {
			return "Music [title=" + title + ", singer=" + singer + "]";
		}

		@Override
		public int compareTo(Music o) { // 그래서 compareTo 오버라이딩 해줘야 한다.
			return this.title.compareTo(o.getTitle()); // 1, 0 , -1
		}
	}
