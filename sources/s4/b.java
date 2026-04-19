package s4;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class b<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0411b<D> f19940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a<D> f19941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f19942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19943e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19944f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19945g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19946h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19947i = false;

    public interface a<D> {
        void a(b<D> bVar);
    }

    /* JADX INFO: renamed from: s4.b$b, reason: collision with other inner class name */
    public interface InterfaceC0411b<D> {
        void a(b<D> bVar, D d10);
    }

    public b(Context context) {
        this.f19942d = context.getApplicationContext();
    }

    public void a() {
        this.f19944f = true;
        k();
    }

    public boolean b() {
        return l();
    }

    public void c() {
        this.f19947i = false;
    }

    public String d(D d10) {
        String str;
        StringBuilder sb2 = new StringBuilder(64);
        if (d10 == null) {
            str = "null";
        } else {
            Class<?> cls = d10.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            str = "}";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public void e() {
        a<D> aVar = this.f19941c;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void f(D d10) {
        InterfaceC0411b<D> interfaceC0411b = this.f19940b;
        if (interfaceC0411b != null) {
            interfaceC0411b.a(this, d10);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f19939a);
        printWriter.print(" mListener=");
        printWriter.println(this.f19940b);
        if (this.f19943e || this.f19946h || this.f19947i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f19943e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f19946h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f19947i);
        }
        if (this.f19944f || this.f19945g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f19944f);
            printWriter.print(" mReset=");
            printWriter.println(this.f19945g);
        }
    }

    public void h() {
        n();
    }

    public boolean i() {
        return this.f19944f;
    }

    public boolean j() {
        return this.f19943e;
    }

    protected void k() {
    }

    protected boolean l() {
        throw null;
    }

    public void m() {
        if (this.f19943e) {
            h();
        } else {
            this.f19946h = true;
        }
    }

    protected void n() {
    }

    protected void o() {
    }

    protected void p() {
        throw null;
    }

    protected void q() {
    }

    public void r(int i10, InterfaceC0411b<D> interfaceC0411b) {
        if (this.f19940b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f19940b = interfaceC0411b;
        this.f19939a = i10;
    }

    public void s() {
        o();
        this.f19945g = true;
        this.f19943e = false;
        this.f19944f = false;
        this.f19946h = false;
        this.f19947i = false;
    }

    public void t() {
        if (this.f19947i) {
            m();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=");
        sb2.append(this.f19939a);
        sb2.append("}");
        return sb2.toString();
    }

    public final void u() {
        this.f19943e = true;
        this.f19945g = false;
        this.f19944f = false;
        p();
    }

    public void v() {
        this.f19943e = false;
        q();
    }

    public void w(InterfaceC0411b<D> interfaceC0411b) {
        InterfaceC0411b<D> interfaceC0411b2 = this.f19940b;
        if (interfaceC0411b2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0411b2 != interfaceC0411b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f19940b = null;
    }
}
