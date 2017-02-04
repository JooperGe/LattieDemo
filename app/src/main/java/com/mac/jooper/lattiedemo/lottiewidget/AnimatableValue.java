package com.mac.jooper.lattiedemo.lottiewidget;

interface AnimatableValue<T> {
  KeyframeAnimation<T> createAnimation();
  boolean hasAnimation();
}
