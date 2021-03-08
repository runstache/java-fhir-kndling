package com.lswebworld.datatypes;

import org.hl7.fhir.r4.model.Money;

public class MoneyBuilder extends AbstractElementBuilder<Money, MoneyBuilder> {

  private Money money;

  /**
   * Constructor.
   */
  public MoneyBuilder() {
    super();
    money = new Money();
    super.initialize(money);
  }

  /**
   * Sets the value on the Money type.
   * @param value Value
   * @return MoneyBuilder
   */
  public MoneyBuilder withValue(double value) { 
    money.setValue(value);   
    return this;
  }

  /**
   * Sets the Currency of the Money Type.
   * @param currency Currency
   * @return MoneyBuilder
   */
  public MoneyBuilder withCurrency(String currency) {
    money.setCurrency(currency);
    return this;
  }

  /**
   * Returns the contructed Money type.
   * @return Money
   */
  public Money build() {
    return money;
  }
  
}
