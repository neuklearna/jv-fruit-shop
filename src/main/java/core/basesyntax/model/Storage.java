package core.basesyntax.model;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    private Map<String, Integer> storage = new HashMap<>();

    public static Map<String, Integer> getStorage() {
        return storage;
    }
}
