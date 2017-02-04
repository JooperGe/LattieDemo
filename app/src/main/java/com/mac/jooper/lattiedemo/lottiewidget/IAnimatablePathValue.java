package com.mac.jooper.lattiedemo.lottiewidget;

import android.graphics.PointF;

public interface IAnimatablePathValue extends AnimatableValue<PointF> {
  PointF getInitialPoint();
}
