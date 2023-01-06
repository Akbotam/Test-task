package kz.akbota.limitcalc.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Setter;

@Entity
@Table(name = "LIMITS")
public class Limits {

  @Id
  @Column(name = "ID")
  @Setter(AccessLevel.NONE)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "EXPENSE_CATEGORY")
  private String expenseCategory;

  @Column(name = "DATE_TIME")
  private String dateTime;

  @Column(name = "LIMIT_AMOUNT")
  private String limitAmount;

  @Column(name = "ACCOUNT")
  private String account;

  @Column(name = "LIMIT_CURRENCY_SHORT_NAME")
  private String limitCurrShortName;
}
