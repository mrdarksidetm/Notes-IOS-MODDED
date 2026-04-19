package rf;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class m implements vf.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<xf.a> f19530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f19531b;

    public m(List<xf.a> list, p pVar) {
        this.f19530a = list;
        this.f19531b = pVar;
    }

    @Override // vf.c
    public uf.p a(String str) {
        return this.f19531b.b(str);
    }

    @Override // vf.c
    public List<xf.a> b() {
        return this.f19530a;
    }
}
