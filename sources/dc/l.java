package dc;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class l extends SurfaceView implements qc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f10001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FlutterRenderer f10004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SurfaceHolder.Callback f10005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qc.a f10006f;

    class a implements SurfaceHolder.Callback {
        a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            cc.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (l.this.p()) {
                l.this.k(i11, i12);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            cc.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            l.this.f10002b = true;
            if (l.this.p()) {
                l.this.l();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            cc.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            l.this.f10002b = false;
            if (l.this.p()) {
                l.this.m();
            }
        }
    }

    class b implements qc.a {
        b() {
        }

        @Override // qc.a
        public void b() {
        }

        @Override // qc.a
        public void e() {
            cc.b.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
            l.this.setAlpha(1.0f);
            if (l.this.f10004d != null) {
                l.this.f10004d.u(this);
            }
        }
    }

    private l(Context context, AttributeSet attributeSet, boolean z10) {
        super(context, attributeSet);
        this.f10002b = false;
        this.f10003c = false;
        this.f10005e = new a();
        this.f10006f = new b();
        this.f10001a = z10;
        n();
    }

    public l(Context context, boolean z10) {
        this(context, null, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i10, int i11) {
        if (this.f10004d == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        cc.b.f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i10 + " x " + i11);
        this.f10004d.B(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f10004d == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f10004d.z(getHolder().getSurface(), this.f10003c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        FlutterRenderer flutterRenderer = this.f10004d;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.A();
    }

    private void n() {
        if (this.f10001a) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f10005e);
        setAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        return (this.f10004d == null || this.f10003c) ? false : true;
    }

    @Override // qc.b
    public void a() {
        FlutterRenderer flutterRenderer = this.f10004d;
        if (flutterRenderer == null) {
            cc.b.g("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        flutterRenderer.j(this.f10006f);
        if (o()) {
            cc.b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            l();
        }
        this.f10003c = false;
    }

    @Override // qc.b
    public void b(FlutterRenderer flutterRenderer) {
        cc.b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f10004d != null) {
            cc.b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f10004d.A();
            this.f10004d.u(this.f10006f);
        }
        this.f10004d = flutterRenderer;
        a();
    }

    @Override // qc.b
    public void c() {
        if (this.f10004d == null) {
            cc.b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f10003c = true;
        }
    }

    @Override // qc.b
    public void d() {
        if (this.f10004d == null) {
            cc.b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            cc.b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            m();
        }
        setAlpha(0.0f);
        this.f10004d.u(this.f10006f);
        this.f10004d = null;
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], (getRight() + i10) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // qc.b
    public FlutterRenderer getAttachedRenderer() {
        return this.f10004d;
    }

    boolean o() {
        return this.f10002b;
    }
}
