package ue;

import java.util.concurrent.atomic.AtomicReferenceArray;
import qe.e0;

/* JADX INFO: loaded from: classes2.dex */
final class g extends e0<g> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReferenceArray f21794e;

    public g(long j10, g gVar, int i10) {
        super(j10, gVar, i10);
        this.f21794e = new AtomicReferenceArray(f.f21793f);
    }

    @Override // qe.e0
    public int n() {
        return f.f21793f;
    }

    @Override // qe.e0
    public void o(int i10, Throwable th, qd.g gVar) {
        r().set(i10, f.f21792e);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f21794e;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f19053c + ", hashCode=" + hashCode() + ']';
    }
}
