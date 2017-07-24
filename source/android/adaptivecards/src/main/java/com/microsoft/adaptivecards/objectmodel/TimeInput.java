/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class TimeInput extends BaseInputElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected TimeInput(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.TimeInput_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TimeInput obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_TimeInput(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TimeInput() {
    this(AdaptiveCardObjectModelJNI.new_TimeInput(), true);
  }

  public static TimeInput Deserialize(SWIGTYPE_p_Json__Value root) {
    long cPtr = AdaptiveCardObjectModelJNI.TimeInput_Deserialize(SWIGTYPE_p_Json__Value.getCPtr(root));
    return (cPtr == 0) ? null : new TimeInput(cPtr, true);
  }

  public static TimeInput DeserializeFromString(String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.TimeInput_DeserializeFromString(jsonString);
    return (cPtr == 0) ? null : new TimeInput(cPtr, true);
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.TimeInput_Serialize(swigCPtr, this);
  }

  public SWIGTYPE_p_Json__Value SerializeToJsonValue() {
    return new SWIGTYPE_p_Json__Value(AdaptiveCardObjectModelJNI.TimeInput_SerializeToJsonValue(swigCPtr, this), true);
  }

  public String GetMax() {
    return AdaptiveCardObjectModelJNI.TimeInput_GetMax(swigCPtr, this);
  }

  public void SetMax(String value) {
    AdaptiveCardObjectModelJNI.TimeInput_SetMax(swigCPtr, this, value);
  }

  public String GetMin() {
    return AdaptiveCardObjectModelJNI.TimeInput_GetMin(swigCPtr, this);
  }

  public void SetMin(String value) {
    AdaptiveCardObjectModelJNI.TimeInput_SetMin(swigCPtr, this, value);
  }

  public String GetPlaceholder() {
    return AdaptiveCardObjectModelJNI.TimeInput_GetPlaceholder(swigCPtr, this);
  }

  public void SetPlaceholder(String value) {
    AdaptiveCardObjectModelJNI.TimeInput_SetPlaceholder(swigCPtr, this, value);
  }

  public String GetValue() {
    return AdaptiveCardObjectModelJNI.TimeInput_GetValue(swigCPtr, this);
  }

  public void SetValue(String value) {
    AdaptiveCardObjectModelJNI.TimeInput_SetValue(swigCPtr, this, value);
  }

  public static TimeInput dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.TimeInput_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new TimeInput(cPtr, true);
  }

}
