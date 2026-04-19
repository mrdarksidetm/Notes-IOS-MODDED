package uf;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21830c;

    private x(int i10, int i11, int i12) {
        this.f21828a = i10;
        this.f21829b = i11;
        this.f21830c = i12;
    }

    public static x d(int i10, int i11, int i12) {
        return new x(i10, i11, i12);
    }

    public int a() {
        return this.f21829b;
    }

    public int b() {
        return this.f21830c;
    }

    public int c() {
        return this.f21828a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f21828a == xVar.f21828a && this.f21829b == xVar.f21829b && this.f21830c == xVar.f21830c;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f21828a), Integer.valueOf(this.f21829b), Integer.valueOf(this.f21830c));
    }

    public String toString() {
        return "SourceSpan{line=" + this.f21828a + ", column=" + this.f21829b + ", length=" + this.f21830c + "}";
    }
}
