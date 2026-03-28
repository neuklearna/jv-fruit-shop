package core.basesyntax.service.service.impl;

import core.basesyntax.model.Storage;
import core.basesyntax.service.ReportGenerator;

import java.util.Map;
import java.util.Set;

public class ReportGeneratorImpl implements ReportGenerator {

    @Override
    public String getReport() {
        Map<String, Integer> storage = Storage.getStorage();
        StringBuilder sb = new StringBuilder();
        sb.append("fruit,quantity\n");
        Set<Map.Entry<String, Integer>> entries = storage.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            sb.append(entry.getKey() + "," + entry.getValue() + "\n");
        }
        return sb.toString();
    }
}
