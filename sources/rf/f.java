package rf;

import java.util.List;
import uf.a0;

/* JADX INFO: loaded from: classes2.dex */
public class f implements xf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a0> f19488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f19489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f19493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f19494g;

    public f(List<a0> list, char c10, boolean z10, boolean z11, f fVar) {
        this.f19488a = list;
        this.f19489b = c10;
        this.f19491d = z10;
        this.f19492e = z11;
        this.f19493f = fVar;
        this.f19490c = list.size();
    }

    @Override // xf.b
    public Iterable<a0> a(int i10) {
        if (i10 >= 1 && i10 <= length()) {
            return this.f19488a.subList(0, i10);
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i10);
    }

    @Override // xf.b
    public int b() {
        return this.f19490c;
    }

    @Override // xf.b
    public Iterable<a0> c(int i10) {
        if (i10 >= 1 && i10 <= length()) {
            List<a0> list = this.f19488a;
            return list.subList(list.size() - i10, this.f19488a.size());
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i10);
    }

    @Override // xf.b
    public boolean d() {
        return this.f19491d;
    }

    @Override // xf.b
    public a0 e() {
        return this.f19488a.get(0);
    }

    @Override // xf.b
    public boolean f() {
        return this.f19492e;
    }

    @Override // xf.b
    public a0 g() {
        return this.f19488a.get(r0.size() - 1);
    }

    @Override // xf.b
    public int length() {
        return this.f19488a.size();
    }
}
