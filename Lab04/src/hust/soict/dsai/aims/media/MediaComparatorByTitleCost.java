package hust.soict.dsai.aims.media;
// Do Quang Phuc 20194646
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<media> {
	public MediaComparatorByTitleCost() {
		// TODO Auto-generated constructor stub
	}
	
	// Sort list media by title ABC
		@Override
		public int compare(media o1, media o2) {
			if( o1.getTitle().equals(o2.getTitle()) ) {
				return (o1.getCost() >= o2.getCost()) ? 1 :-1 ;
			}else {
				return o1.getTitle().compareTo(o2.getTitle());
			}
		}

}
