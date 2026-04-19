package m5;

import ae.r;
import java.util.List;
import nd.c0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f15465a;

    /* JADX WARN: Multi-variable type inference failed */
    public k(List<? extends a> list) {
        r.f(list, "displayFeatures");
        this.f15465a = list;
    }

    public final List<a> a() {
        return this.f15465a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !r.b(k.class, obj.getClass())) {
            return false;
        }
        return r.b(this.f15465a, ((k) obj).f15465a);
    }

    public int hashCode() {
        return this.f15465a.hashCode();
    }

    public String toString() {
        return c0.h0(this.f15465a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
