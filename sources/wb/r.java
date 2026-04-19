package wb;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
class r implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f22815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f22816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f22817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f22818d;

    r(String str, int i10) {
        this.f22815a = str;
        this.f22816b = i10;
    }

    @Override // wb.n
    public void c() {
        HandlerThread handlerThread = this.f22817c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f22817c = null;
            this.f22818d = null;
        }
    }

    @Override // wb.n
    public void d(k kVar) {
        this.f22818d.post(kVar.f22795b);
    }

    @Override // wb.n
    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.f22815a, this.f22816b);
        this.f22817c = handlerThread;
        handlerThread.start();
        this.f22818d = new Handler(this.f22817c.getLooper());
    }
}
