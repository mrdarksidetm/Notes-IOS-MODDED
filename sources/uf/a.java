package uf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends s {
    @Override // uf.s
    protected void j(s sVar) {
        if (!(sVar instanceof a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.j(sVar);
    }

    public a n() {
        return (a) super.f();
    }
}
