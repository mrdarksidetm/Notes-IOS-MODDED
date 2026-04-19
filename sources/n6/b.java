package n6;

import j6.f;
import j6.i;
import j6.q;
import n6.c;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f15929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f15930b;

    public static final class a implements c.a {
        @Override // n6.c.a
        public c a(d dVar, i iVar) {
            return new b(dVar, iVar);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    public b(d dVar, i iVar) {
        this.f15929a = dVar;
        this.f15930b = iVar;
    }

    @Override // n6.c
    public void a() {
        i iVar = this.f15930b;
        if (iVar instanceof q) {
            this.f15929a.a(((q) iVar).a());
        } else if (iVar instanceof f) {
            this.f15929a.b(iVar.a());
        }
    }
}
