package jp.co.thcomp.daydream;

import android.content.Context;
import android.util.AttributeSet;

import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.GvrView;
import com.google.vr.sdk.base.HeadTransform;
import com.google.vr.sdk.base.Viewport;

import javax.microedition.khronos.egl.EGLConfig;

public class DDStereoRenderView extends AbstractDDRenderView implements GvrView.StereoRenderer {
    public DDStereoRenderView(Context context) {
        super(context);
    }

    public DDStereoRenderView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onNewFrame(HeadTransform headTransform) {

    }

    @Override
    public void onDrawEye(Eye eye) {

    }

    @Override
    public void onFinishFrame(Viewport viewport) {

    }

    @Override
    public void onSurfaceChanged(int i, int i1) {

    }

    @Override
    public void onSurfaceCreated(EGLConfig eglConfig) {

    }

    @Override
    public void onRendererShutdown() {

    }
}
