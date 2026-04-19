package androidx.compose.ui;

import ae.r;
import ae.s;
import androidx.compose.ui.e;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f2633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f2634c;

    /* JADX INFO: renamed from: androidx.compose.ui.a$a, reason: collision with other inner class name */
    static final class C0053a extends s implements p<String, e.b, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0053a f2635a = new C0053a();

        C0053a() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, e.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public a(e eVar, e eVar2) {
        this.f2633b = eVar;
        this.f2634c = eVar2;
    }

    public final e a() {
        return this.f2634c;
    }

    @Override // androidx.compose.ui.e
    public boolean b(l<? super e.b, Boolean> lVar) {
        return this.f2633b.b(lVar) && this.f2634c.b(lVar);
    }

    public final e c() {
        return this.f2633b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.e
    public <R> R e(R r10, p<? super R, ? super e.b, ? extends R> pVar) {
        return (R) this.f2634c.e(this.f2633b.e(r10, pVar), pVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (r.b(this.f2633b, aVar.f2633b) && r.b(this.f2634c, aVar.f2634c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f2633b.hashCode() + (this.f2634c.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) e("", C0053a.f2635a)) + ']';
    }
}
