package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final o f3499e = o.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f3500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f3501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected volatile n0 f3502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile g f3503d;

    protected void a(n0 n0Var) {
        g gVar;
        if (this.f3502c != null) {
            return;
        }
        synchronized (this) {
            if (this.f3502c != null) {
                return;
            }
            try {
                if (this.f3500a != null) {
                    this.f3502c = n0Var.h().a(this.f3500a, this.f3501b);
                    gVar = this.f3500a;
                } else {
                    this.f3502c = n0Var;
                    gVar = g.f3561b;
                }
                this.f3503d = gVar;
            } catch (z unused) {
                this.f3502c = n0Var;
                this.f3503d = g.f3561b;
            }
        }
    }

    public int b() {
        if (this.f3503d != null) {
            return this.f3503d.size();
        }
        g gVar = this.f3500a;
        if (gVar != null) {
            return gVar.size();
        }
        if (this.f3502c != null) {
            return this.f3502c.e();
        }
        return 0;
    }

    public n0 c(n0 n0Var) {
        a(n0Var);
        return this.f3502c;
    }

    public n0 d(n0 n0Var) {
        n0 n0Var2 = this.f3502c;
        this.f3500a = null;
        this.f3503d = null;
        this.f3502c = n0Var;
        return n0Var2;
    }

    public g e() {
        if (this.f3503d != null) {
            return this.f3503d;
        }
        g gVar = this.f3500a;
        if (gVar != null) {
            return gVar;
        }
        synchronized (this) {
            if (this.f3503d != null) {
                return this.f3503d;
            }
            this.f3503d = this.f3502c == null ? g.f3561b : this.f3502c.d();
            return this.f3503d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        n0 n0Var = this.f3502c;
        n0 n0Var2 = b0Var.f3502c;
        return (n0Var == null && n0Var2 == null) ? e().equals(b0Var.e()) : (n0Var == null || n0Var2 == null) ? n0Var != null ? n0Var.equals(b0Var.c(n0Var.b())) : c(n0Var2.b()).equals(n0Var2) : n0Var.equals(n0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
