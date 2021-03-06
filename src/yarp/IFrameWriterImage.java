/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class IFrameWriterImage {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IFrameWriterImage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IFrameWriterImage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_IFrameWriterImage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean putImage(ImageRgb image) {
    return yarpJNI.IFrameWriterImage_putImage(swigCPtr, this, ImageRgb.getCPtr(image), image);
  }

}
