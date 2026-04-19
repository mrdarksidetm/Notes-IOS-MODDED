package b1;

import ae.j;
import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5167a;

    public d() {
        this(0, 1, null);
    }

    public d(int i10) {
        this.f5167a = i10;
    }

    public /* synthetic */ d(int i10, int i11, j jVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public final int a() {
        return this.f5167a;
    }

    public final void b(int i10) {
        this.f5167a = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("IntRef(element = ");
        sb2.append(this.f5167a);
        sb2.append(")@");
        String string = Integer.toString(hashCode(), je.b.a(16));
        r.e(string, "toString(this, checkRadix(radix))");
        sb2.append(string);
        return sb2.toString();
    }
}
