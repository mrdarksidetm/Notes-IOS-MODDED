package ge;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends ge.a implements f<Character> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11529e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f11530f = new c(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public c(char c10, char c11) {
        super(c10, c11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (l() != cVar.l() || n() != cVar.n()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (l() * 31) + n();
    }

    @Override // ge.f
    public boolean isEmpty() {
        return r.g(l(), n()) > 0;
    }

    public boolean r(char c10) {
        return r.g(l(), c10) <= 0 && r.g(c10, n()) <= 0;
    }

    @Override // ge.f
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Character f() {
        return Character.valueOf(n());
    }

    @Override // ge.f
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Character d() {
        return Character.valueOf(l());
    }

    public String toString() {
        return l() + ".." + n();
    }
}
