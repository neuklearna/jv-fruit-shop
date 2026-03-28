package core.basesyntax.service.service.strategy;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.model.Storage;
import core.basesyntax.service.OperationHandler;

import java.util.Map;

public class PurchaseOperation implements OperationHandler {

    @Override
    public void handle(FruitTransaction fruitTransaction) {
        Map<String, Integer> balance = Storage.getStorage();
        String fruit = fruitTransaction.getFruit();
        int quantity = fruitTransaction.getQuantity();
        if (balance.get(fruit) < quantity) {
            throw new RuntimeException("Not enough fruits" + fruit);
        }
        balance.put(fruit, balance.get(fruit) - quantity);
    }
}
