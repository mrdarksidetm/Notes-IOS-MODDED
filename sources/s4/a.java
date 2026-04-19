package s4;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<D> extends b<D> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Executor f19931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile a<D>.RunnableC0410a f19932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile a<D>.RunnableC0410a f19933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f19934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f19935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f19936o;

    /* JADX INFO: renamed from: s4.a$a, reason: collision with other inner class name */
    final class RunnableC0410a extends c<D> implements Runnable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f19937f;

        RunnableC0410a() {
        }

        @Override // s4.c
        protected D b() {
            return (D) a.this.E();
        }

        @Override // s4.c
        protected void g(D d10) {
            a.this.y(this, d10);
        }

        @Override // s4.c
        protected void h(D d10) {
            a.this.z(this, d10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19937f = false;
            a.this.A();
        }
    }

    public a(Context context) {
        super(context);
        this.f19935n = -10000L;
    }

    void A() {
        if (this.f19933l != null || this.f19932k == null) {
            return;
        }
        if (this.f19932k.f19937f) {
            this.f19932k.f19937f = false;
            this.f19936o.removeCallbacks(this.f19932k);
        }
        if (this.f19934m > 0 && SystemClock.uptimeMillis() < this.f19935n + this.f19934m) {
            this.f19932k.f19937f = true;
            this.f19936o.postAtTime(this.f19932k, this.f19935n + this.f19934m);
        } else {
            if (this.f19931j == null) {
                this.f19931j = B();
            }
            this.f19932k.c(this.f19931j);
        }
    }

    protected Executor B() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public abstract D C();

    public void D(D d10) {
    }

    protected D E() {
        return C();
    }

    @Override // s4.b
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f19932k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f19932k);
            printWriter.print(" waiting=");
            printWriter.println(this.f19932k.f19937f);
        }
        if (this.f19933l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f19933l);
            printWriter.print(" waiting=");
            printWriter.println(this.f19933l.f19937f);
        }
        if (this.f19934m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f19934m)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f19935n == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f19935n));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // s4.b
    protected boolean l() {
        if (this.f19932k == null) {
            return false;
        }
        if (!j()) {
            m();
        }
        if (this.f19933l != null) {
            if (this.f19932k.f19937f) {
                this.f19932k.f19937f = false;
                this.f19936o.removeCallbacks(this.f19932k);
            }
            this.f19932k = null;
            return false;
        }
        if (this.f19932k.f19937f) {
            this.f19932k.f19937f = false;
            this.f19936o.removeCallbacks(this.f19932k);
            this.f19932k = null;
            return false;
        }
        boolean zA = this.f19932k.a(false);
        if (zA) {
            this.f19933l = this.f19932k;
            x();
        }
        this.f19932k = null;
        return zA;
    }

    @Override // s4.b
    protected void n() {
        super.n();
        b();
        this.f19932k = new RunnableC0410a();
        A();
    }

    public void x() {
    }

    void y(a<D>.RunnableC0410a runnableC0410a, D d10) {
        D(d10);
        if (this.f19933l == runnableC0410a) {
            t();
            this.f19935n = SystemClock.uptimeMillis();
            this.f19933l = null;
            e();
            A();
        }
    }

    void z(a<D>.RunnableC0410a runnableC0410a, D d10) {
        if (this.f19932k != runnableC0410a) {
            y(runnableC0410a, d10);
            return;
        }
        if (i()) {
            D(d10);
            return;
        }
        c();
        this.f19935n = SystemClock.uptimeMillis();
        this.f19932k = null;
        f(d10);
    }
}
