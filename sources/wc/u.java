package wc;

import android.annotation.TargetApi;
import android.view.Surface;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(29)
public class u implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextureRegistry.SurfaceProducer f22885a;

    public u(TextureRegistry.SurfaceProducer surfaceProducer) {
        this.f22885a = surfaceProducer;
    }

    @Override // wc.j
    public void a(int i10, int i11) {
        this.f22885a.setSize(i10, i11);
    }

    @Override // wc.j
    public int getHeight() {
        return this.f22885a.getHeight();
    }

    @Override // wc.j
    public long getId() {
        return this.f22885a.id();
    }

    @Override // wc.j
    public Surface getSurface() {
        return this.f22885a.getSurface();
    }

    @Override // wc.j
    public int getWidth() {
        return this.f22885a.getWidth();
    }

    @Override // wc.j
    public void release() {
        this.f22885a.release();
        this.f22885a = null;
    }

    @Override // wc.j
    public void scheduleFrame() {
        this.f22885a.scheduleFrame();
    }
}
