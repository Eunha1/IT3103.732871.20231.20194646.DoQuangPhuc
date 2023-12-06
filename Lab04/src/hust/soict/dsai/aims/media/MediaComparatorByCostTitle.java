package hust.soict.dsai.aims.media;
// Do Quang Phuc 20194646
import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<media> {
	public MediaComparatorByCostTitle() {
		// TODO Auto-generated constructor stub
	}
	
	// Sort list media by cost 
	@Override
	public int compare(media o1, media o2) {
		if( o1.getCost() == o2.getCost() ) {
			return o1.getTitle().compareTo(o2.getTitle());
		}else {
			return (o1.getCost() >= o2.getCost()) ? 1 :-1 ;
		}
	}
}
