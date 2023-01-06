package kz.akbota.limitcalc.service.impl;

import kz.akbota.limitcalc.model.ExpenseOperation;
import kz.akbota.limitcalc.persistence.entity.ExpenseOperations;
import kz.akbota.limitcalc.persistence.repository.ExpenseOperationsRepository;
import kz.akbota.limitcalc.service.ExpenseOperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpenseOperationServiceImpl implements ExpenseOperationService {

  private final ExpenseOperationsRepository repository;

  @Override
  public void saveExpenseOperation(ExpenseOperation expenseOperation) {

    var expenseOperations = new ExpenseOperations();
    expenseOperations.setAccountFrom(expenseOperation.getAccountFrom());
    expenseOperations.setAccountTo(expenseOperation.getAccountTo());
    expenseOperations.setCurrencyShortName(expenseOperation.getCurrencyShortName());
    expenseOperations.setExpenseCategory(expenseOperation.getExpenseCategory());
    expenseOperations.setSum(expenseOperation.getSum());
    expenseOperations.setDateTime(expenseOperation.getDateTime());

    repository.save(expenseOperations);
  }
}
