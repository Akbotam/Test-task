package kz.akbota.limitcalc.model;

import javax.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class ExpenseOperation {
  @NotBlank
  private String accountFrom;

  @NotBlank
  private String accountTo;

  @NotBlank
  private String currencyShortName;

  @NotBlank
  private String sum;

  @NotBlank
  private String expenseCategory;

  @NotBlank
  private String dateTime;
}
