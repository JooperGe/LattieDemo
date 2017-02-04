package com.mac.jooper.lattiedemo.lottiewidget;

import android.graphics.PointF;
import android.graphics.Rect;

interface Transform {
  Rect getBounds();
  IAnimatablePathValue getPosition();
  AnimatablePathValue getAnchor();
  AnimatableScaleValue getScale();
  AnimatableFloatValue getRotation();
  AnimatableIntegerValue getOpacity();
}