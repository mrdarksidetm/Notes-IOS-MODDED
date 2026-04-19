package dc;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class m extends TextureView implements qc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FlutterRenderer f10011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Surface f10012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f10013e;

    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            cc.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            m.this.f10009a = true;
            if (m.this.q()) {
                m.this.m();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            cc.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            m.this.f10009a = false;
            if (m.this.q()) {
                m.this.n();
            }
            if (m.this.f10012d == null) {
                return true;
            }
            m.this.f10012d.release();
            m.this.f10012d = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            cc.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (m.this.q()) {
                m.this.l(i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public m(Context context) {
        this(context, null);
    }

    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10009a = false;
        this.f10010b = false;
        this.f10013e = new a();
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i10, int i11) {
        if (this.f10011c == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        cc.b.f("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i10 + " x " + i11);
        this.f10011c.B(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f10011c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f10012d;
        if (surface != null) {
            surface.release();
            this.f10012d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f10012d = surface2;
        this.f10011c.z(surface2, this.f10010b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        FlutterRenderer flutterRenderer = this.f10011c;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.A();
        Surface surface = this.f10012d;
        if (surface != null) {
            surface.release();
            this.f10012d = null;
        }
    }

    private void o() {
        setSurfaceTextureListener(this.f10013e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        return (this.f10011c == null || this.f10010b) ? false : true;
    }

    @Override // qc.b
    public void a() {
        if (this.f10011c == null) {
            cc.b.g("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (p()) {
            cc.b.f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m();
        }
        this.f10010b = false;
    }

    @Override // qc.b
    public void b(FlutterRenderer flutterRenderer) {
        cc.b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f10011c != null) {
            cc.b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f10011c.A();
        }
        this.f10011c = flutterRenderer;
        a();
    }

    @Override // qc.b
    public void c() {
        if (this.f10011c == null) {
            cc.b.g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f10010b = true;
        }
    }

    @Override // qc.b
    public void d() {
        if (this.f10011c == null) {
            cc.b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            cc.b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
            n();
        }
        this.f10011c = null;
    }

    @Override // qc.b
    public FlutterRenderer getAttachedRenderer() {
        return this.f10011c;
    }

    boolean p() {
        return this.f10009a;
    }

    public void setRenderSurface(Surface surface) {
        this.f10012d = surface;
    }
}
