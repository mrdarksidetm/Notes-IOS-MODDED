package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class SurfaceTextureWrapper {
    private boolean attached;
    private boolean newFrameAvailable;
    private Runnable onFrameConsumed;
    private boolean released;
    private SurfaceTexture surfaceTexture;

    public SurfaceTextureWrapper(SurfaceTexture surfaceTexture) {
        this(surfaceTexture, null);
    }

    public SurfaceTextureWrapper(SurfaceTexture surfaceTexture, Runnable runnable) {
        this.newFrameAvailable = false;
        this.surfaceTexture = surfaceTexture;
        this.released = false;
        this.onFrameConsumed = runnable;
    }

    public void attachToGLContext(int i10) {
        synchronized (this) {
            if (this.released) {
                return;
            }
            if (this.attached) {
                this.surfaceTexture.detachFromGLContext();
            }
            this.surfaceTexture.attachToGLContext(i10);
            this.attached = true;
        }
    }

    public void detachFromGLContext() {
        synchronized (this) {
            if (this.attached && !this.released) {
                this.surfaceTexture.detachFromGLContext();
                this.attached = false;
            }
        }
    }

    public void getTransformMatrix(float[] fArr) {
        this.surfaceTexture.getTransformMatrix(fArr);
    }

    public void markDirty() {
        synchronized (this) {
            this.newFrameAvailable = true;
        }
    }

    public void release() {
        synchronized (this) {
            if (!this.released) {
                this.surfaceTexture.release();
                this.released = true;
                this.attached = false;
            }
        }
    }

    public boolean shouldUpdate() {
        boolean z10;
        synchronized (this) {
            z10 = this.newFrameAvailable;
        }
        return z10;
    }

    public SurfaceTexture surfaceTexture() {
        return this.surfaceTexture;
    }

    public void updateTexImage() {
        synchronized (this) {
            this.newFrameAvailable = false;
            if (!this.released) {
                this.surfaceTexture.updateTexImage();
                Runnable runnable = this.onFrameConsumed;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }
}
