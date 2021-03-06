package com.lswebworld.datatypes;

import org.hl7.fhir.r4.model.Count;

public class CountBuilder extends AbstractQuantityBuilder<Count> {

  /**
   * Constructor.
   */
  public CountBuilder() {
    super(new Count());
  }  
}
