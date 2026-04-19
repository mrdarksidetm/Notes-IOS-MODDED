package yb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends b {
    @Override // yb.f
    public void error(String str, String str2, Object obj) {
        l().error(str, str2, obj);
    }

    protected abstract f l();

    @Override // yb.f
    public void success(Object obj) {
        l().success(obj);
    }
}
