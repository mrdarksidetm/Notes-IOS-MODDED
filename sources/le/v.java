package le;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends c2 implements u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f15120e;

    public v(w wVar) {
        this.f15120e = wVar;
    }

    @Override // le.u
    public boolean a(Throwable th) {
        return s().O(th);
    }

    @Override // le.u
    public a2 getParent() {
        return s();
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
        r(th);
        return md.i0.f15558a;
    }

    @Override // le.e0
    public void r(Throwable th) {
        this.f15120e.A(s());
    }
}
