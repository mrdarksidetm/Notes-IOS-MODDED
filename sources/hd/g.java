package hd;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static g f11894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static b f11895f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FlutterJNI f11897b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f11896a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f11898c = new c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FlutterJNI.b f11899d = new a();

    class a implements FlutterJNI.b {
        a() {
        }

        private Choreographer.FrameCallback b(long j10) {
            if (g.this.f11898c == null) {
                return g.this.new c(j10);
            }
            g.this.f11898c.f11903a = j10;
            c cVar = g.this.f11898c;
            g.this.f11898c = null;
            return cVar;
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.b
        public void a(long j10) {
            Choreographer.getInstance().postFrameCallback(b(j10));
        }
    }

    class b implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private DisplayManager f11901a;

        b(DisplayManager displayManager) {
            this.f11901a = displayManager;
        }

        void a() {
            this.f11901a.registerDisplayListener(this, null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                float refreshRate = this.f11901a.getDisplay(0).getRefreshRate();
                g.this.f11896a = (long) (1.0E9d / ((double) refreshRate));
                g.this.f11897b.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    private class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f11903a;

        c(long j10) {
            this.f11903a = j10;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            long jNanoTime = System.nanoTime() - j10;
            g.this.f11897b.onVsync(jNanoTime < 0 ? 0L : jNanoTime, g.this.f11896a, this.f11903a);
            g.this.f11898c = this;
        }
    }

    private g(FlutterJNI flutterJNI) {
        this.f11897b = flutterJNI;
    }

    public static g f(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f11894e == null) {
            f11894e = new g(flutterJNI);
        }
        if (f11895f == null) {
            g gVar = f11894e;
            Objects.requireNonNull(gVar);
            b bVar = gVar.new b(displayManager);
            f11895f = bVar;
            bVar.a();
        }
        if (f11894e.f11896a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f11894e.f11896a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f11894e;
    }

    public void g() {
        this.f11897b.setAsyncWaitForVsyncDelegate(this.f11899d);
    }
}
