/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class PixelRgbSigned {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PixelRgbSigned(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PixelRgbSigned obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_PixelRgbSigned(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setR(char value) {
    yarpJNI.PixelRgbSigned_r_set(swigCPtr, this, value);
  }

  public char getR() {
    return yarpJNI.PixelRgbSigned_r_get(swigCPtr, this);
  }

  public void setG(char value) {
    yarpJNI.PixelRgbSigned_g_set(swigCPtr, this, value);
  }

  public char getG() {
    return yarpJNI.PixelRgbSigned_g_get(swigCPtr, this);
  }

  public void setB(char value) {
    yarpJNI.PixelRgbSigned_b_set(swigCPtr, this, value);
  }

  public char getB() {
    return yarpJNI.PixelRgbSigned_b_get(swigCPtr, this);
  }

  public PixelRgbSigned() {
    this(yarpJNI.new_PixelRgbSigned(), true);
  }

}
