package com.mac.jooper.lattiedemo.lottiewidget;

import android.graphics.Path;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

class MaskLayer extends AnimatableLayer {
  private final List<KeyframeAnimation<Path>> masks;

  MaskLayer(List<Mask> masks, Callback callback) {
    super(callback);
    this.masks = new ArrayList<>(masks.size());
    for (int i = 0; i < masks.size(); i++) {
      this.masks.add(masks.get(i).getMaskPath().createAnimation());
    }
  }

  List<KeyframeAnimation<Path>> getMasks() {
    return masks;
  }
}
