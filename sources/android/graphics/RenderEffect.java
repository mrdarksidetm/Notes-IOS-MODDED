package android.graphics;

import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RenderEffect {
    static {
        throw new NoClassDefFoundError();
    }

    public static native /* synthetic */ RenderEffect createBlurEffect(float f10, float f11, RenderEffect renderEffect, Shader.TileMode tileMode);

    public static native /* synthetic */ RenderEffect createBlurEffect(float f10, float f11, Shader.TileMode tileMode);

    public static native /* synthetic */ RenderEffect createOffsetEffect(float f10, float f11);

    public static native /* synthetic */ RenderEffect createOffsetEffect(float f10, float f11, RenderEffect renderEffect);
}
