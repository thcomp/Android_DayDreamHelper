package jp.co.thcomp.daydream;

import javax.microedition.khronos.egl.EGLConfig;

public interface DDSurfaceObserver {
    void onSurfaceChanged(int var2, int var3);

    void onSurfaceCreated(EGLConfig var2);
}
