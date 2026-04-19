package wc;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(26)
public class w implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextureRegistry.SurfaceTextureEntry f22886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SurfaceTexture f22887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Surface f22888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22889d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22890e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22891f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextureRegistry.b f22892g;

    class a implements TextureRegistry.b {
        a() {
        }

        @Override // io.flutter.view.TextureRegistry.b
        public void onTrimMemory(int i10) {
            if (i10 != 80 || Build.VERSION.SDK_INT < 29) {
                return;
            }
            w.this.f22891f = true;
        }
    }

    public w(TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        a aVar = new a();
        this.f22892g = aVar;
        this.f22886a = surfaceTextureEntry;
        this.f22887b = surfaceTextureEntry.surfaceTexture();
        surfaceTextureEntry.setOnTrimMemoryListener(aVar);
    }

    private void d() {
        Surface surface = this.f22888c;
        if (surface == null || this.f22891f) {
            if (surface != null) {
                surface.release();
                this.f22888c = null;
            }
            this.f22888c = c();
            this.f22891f = false;
        }
    }

    @Override // wc.j
    public void a(int i10, int i11) {
        this.f22889d = i10;
        this.f22890e = i11;
        SurfaceTexture surfaceTexture = this.f22887b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i10, i11);
        }
    }

    protected Surface c() {
        return new Surface(this.f22887b);
    }

    @Override // wc.j
    public int getHeight() {
        return this.f22890e;
    }

    @Override // wc.j
    public long getId() {
        return this.f22886a.id();
    }

    @Override // wc.j
    public Surface getSurface() {
        d();
        SurfaceTexture surfaceTexture = this.f22887b;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return this.f22888c;
    }

    @Override // wc.j
    public int getWidth() {
        return this.f22889d;
    }

    @Override // wc.j
    public void release() {
        this.f22887b = null;
        Surface surface = this.f22888c;
        if (surface != null) {
            surface.release();
            this.f22888c = null;
        }
    }
}
