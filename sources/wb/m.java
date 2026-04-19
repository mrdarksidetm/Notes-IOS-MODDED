package wb;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f22800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f22801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Runnable f22802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f22803f;

    m(String str, int i10) {
        this.f22798a = str;
        this.f22799b = i10;
    }

    boolean b() {
        k kVar = this.f22803f;
        return kVar != null && kVar.b();
    }

    Integer d() {
        k kVar = this.f22803f;
        if (kVar != null) {
            return kVar.a();
        }
        return null;
    }

    void e(final k kVar) {
        this.f22801d.post(new Runnable() { // from class: wb.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f22796a.c(kVar);
            }
        });
    }

    synchronized void f() {
        HandlerThread handlerThread = this.f22800c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f22800c = null;
            this.f22801d = null;
        }
    }

    synchronized void g(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f22798a, this.f22799b);
        this.f22800c = handlerThread;
        handlerThread.start();
        this.f22801d = new Handler(this.f22800c.getLooper());
        this.f22802e = runnable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(k kVar) {
        kVar.f22795b.run();
        this.f22803f = kVar;
        this.f22802e.run();
    }
}
