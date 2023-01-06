package kz.akbota.limitcalc.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Setter;

@Setter
@Entity
@Table(name = "EXPENSE_OPERATIONS")
public class ExpenseOperations {

  @Id
  @Column(name = "ID")
  @Setter(AccessLevel.NONE)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "ACCOUNT_FROM")
  private String accountFrom;

  @Column(name = "ACCOUNT_TO")
  private String accountTo;

  @Column(name = "CURRENCY_SHORT_NAME")
  private String currencyShortName;

  @Column(name = "SUM")
  private String sum;

  @Column(name = "EXPENSE_CATEGORY")
  private String expenseCategory;

  @Column(name = "DATE_TIME")
  private String dateTime;

  @Column(name = "LIMIT_EXCEEDED")
  private Boolean limitExceeded;

  @Column(name = "REMAIN_MONTH_LIM")
  private String remainMonthLim; 
}
