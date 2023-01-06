package kz.akbota.limitcalc.model;

import java.util.Arrays;
import kz.akbota.limitcalc.exception.LimitCalcException;

public enum ExpenseCategory {
  PRODUCT,
  SERVICE;

  public static ExpenseCategory getByName(String name) {
    return Arrays.stream(ExpenseCategory.values())
        .filter(eventType -> eventType.name().equalsIgnoreCase(name))
        .findFirst()
        .orElseThrow(() -> new LimitCalcException("Unexpected expenseCategory."));
  }
}
