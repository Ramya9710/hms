package utility;

import java.util.Collections;
import java.util.List;

public class FindLatestNumberUtil {
    public static Long getLatestId(List<Long> list) {
        long latestId = 1;
        Collections.reverse(list);
        if(list.size() > 0)
            latestId = list.get(0)+1;
        return latestId;
    }

}
