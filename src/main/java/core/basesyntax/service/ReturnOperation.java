package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.model.Storage;
import java.util.Map;

public class ReturnOperation implements OperationHandler {

    @Override
    public void handle(FruitTransaction fruitTransaction) {
        Map<String, Integer> balance = Storage.getStorage();
        String fruit = fruitTransaction.getFruit();
        int quantity = fruitTransaction.getQuantity();
        balance.put(fruit, balance.get(fruit) + quantity);
    }
}
