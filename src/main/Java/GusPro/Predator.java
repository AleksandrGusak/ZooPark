package GusPro;

import java.util.List;

public interface Predator {

    default List<String> eatMeat() throws Exception {
        return null;
    }

}
