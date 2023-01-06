package kz.akbota.limitcalc.controller;

import javax.validation.Valid;
import kz.akbota.limitcalc.model.ExpenseOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/expense")
public class ExpenseOperationController {

  @PostMapping
  public ResponseEntity<?> saveExpense(@Valid @RequestBody ExpenseOperation expenseOperation) {
    return null;
  }

}
