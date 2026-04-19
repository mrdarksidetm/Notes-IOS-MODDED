package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes2.dex */
final class d implements TextureRegistry.SurfaceProducer, TextureRegistry.GLTextureConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f12974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f12978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextureRegistry.SurfaceTextureEntry f12979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f12980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final FlutterJNI f12981h;

    d(long j10, Handler handler, FlutterJNI flutterJNI, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        this.f12974a = j10;
        this.f12980g = handler;
        this.f12981h = flutterJNI;
        this.f12979f = surfaceTextureEntry;
    }

    protected void finalize() throws Throwable {
        try {
            if (this.f12977d) {
                return;
            }
            release();
            this.f12980g.post(new FlutterRenderer.g(this.f12974a, this.f12981h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public int getHeight() {
        return this.f12976c;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public Surface getSurface() {
        if (this.f12978e == null) {
            this.f12978e = new Surface(this.f12979f.surfaceTexture());
        }
        return this.f12978e;
    }

    @Override // io.flutter.view.TextureRegistry.GLTextureConsumer
    public SurfaceTexture getSurfaceTexture() {
        return this.f12979f.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public int getWidth() {
        return this.f12975b;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public long id() {
        return this.f12974a;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void release() {
        this.f12979f.release();
        this.f12977d = true;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void scheduleFrame() {
        this.f12981h.markTextureFrameAvailable(this.f12974a);
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void setCallback(TextureRegistry.SurfaceProducer.a aVar) {
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void setSize(int i10, int i11) {
        this.f12975b = i10;
        this.f12976c = i11;
        getSurfaceTexture().setDefaultBufferSize(i10, i11);
    }
}
