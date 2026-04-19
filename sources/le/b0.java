package le;

/* JADX INFO: loaded from: classes2.dex */
final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f14983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zd.l<Throwable, md.i0> f14984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f14986e;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(Object obj, m mVar, zd.l<? super Throwable, md.i0> lVar, Object obj2, Throwable th) {
        this.f14982a = obj;
        this.f14983b = mVar;
        this.f14984c = lVar;
        this.f14985d = obj2;
        this.f14986e = th;
    }

    public /* synthetic */ b0(Object obj, m mVar, zd.l lVar, Object obj2, Throwable th, int i10, ae.j jVar) {
        this(obj, (i10 & 2) != 0 ? null : mVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b0 b(b0 b0Var, Object obj, m mVar, zd.l lVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = b0Var.f14982a;
        }
        if ((i10 & 2) != 0) {
            mVar = b0Var.f14983b;
        }
        m mVar2 = mVar;
        if ((i10 & 4) != 0) {
            lVar = b0Var.f14984c;
        }
        zd.l lVar2 = lVar;
        if ((i10 & 8) != 0) {
            obj2 = b0Var.f14985d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th = b0Var.f14986e;
        }
        return b0Var.a(obj, mVar2, lVar2, obj4, th);
    }

    public final b0 a(Object obj, m mVar, zd.l<? super Throwable, md.i0> lVar, Object obj2, Throwable th) {
        return new b0(obj, mVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f14986e != null;
    }

    public final void d(p<?> pVar, Throwable th) {
        m mVar = this.f14983b;
        if (mVar != null) {
            pVar.m(mVar, th);
        }
        zd.l<Throwable, md.i0> lVar = this.f14984c;
        if (lVar != null) {
            pVar.n(lVar, th);
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
        return ae.r.b(this.f14982a, b0Var.f14982a) && ae.r.b(this.f14983b, b0Var.f14983b) && ae.r.b(this.f14984c, b0Var.f14984c) && ae.r.b(this.f14985d, b0Var.f14985d) && ae.r.b(this.f14986e, b0Var.f14986e);
    }

    public int hashCode() {
        Object obj = this.f14982a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        m mVar = this.f14983b;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        zd.l<Throwable, md.i0> lVar = this.f14984c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f14985d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f14986e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f14982a + ", cancelHandler=" + this.f14983b + ", onCancellation=" + this.f14984c + ", idempotentResume=" + this.f14985d + ", cancelCause=" + this.f14986e + ')';
    }
}
