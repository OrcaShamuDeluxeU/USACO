package Main;
import java.io.IOException;
import java.util.ArrayList;

public class prob2021usacodec {
	public static String Solve(String x) throws IOException {
		ArrayList<Integer> d = new ArrayList<>();
		
		int ans = 0;
		int change = 0;
		while(!d.isEmpty()) {
			if(d.get(d.size()-1) == 0) {
				d.remove(d.size()-1);
				continue;
			}
			boolean positive = d.get(d.size()-1) > 0;
			int amtChange = 1;
			while(amtChange < d.size()) {
				if(d.get(d.size()-1-amtChange) == 0) break;
				if((d.get(d.size()-1-amtChange) > 0) != positive) break;
				amtChange++;
			}
			ans++;
			for(int i = 0; i < amtChange; i++) {
				if(d.get(d.size()-1-i) > 0) {
					d.set(d.size()-1-i, d.get(d.size()-1-i) - 1);
				}
				else {
					d.set(d.size()-1-i, d.get(d.size()-1-i) + 1);	
				}
			}
		}
		String s=Integer.toString(ans);
		return s;
		
	}
}