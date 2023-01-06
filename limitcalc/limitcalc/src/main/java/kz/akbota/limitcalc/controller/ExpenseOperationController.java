package kz.akbota.limitcalc.controller;

import javax.validation.Valid;
import kz.akbota.limitcalc.model.ExpenseOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/expense")
public class ExpenseOperationController {
	private final ExpenseOperationService service;

  @PostMapping
  public void saveExpense(@Valid @RequestBody ExpenseOperation expenseOperation) {
	  service.saveExpenseOperation(expenseOperation);
  }

}

