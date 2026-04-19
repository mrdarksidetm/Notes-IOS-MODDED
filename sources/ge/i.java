package ge;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends g implements f<Integer> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11541e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final i f11542f = new i(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final i a() {
            return i.f11542f;
        }
    }

    public i(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // ge.g
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (l() != iVar.l() || n() != iVar.n()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // ge.g
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (l() * 31) + n();
    }

    @Override // ge.g, ge.f
    public boolean isEmpty() {
        return l() > n();
    }

    public boolean t(int i10) {
        return l() <= i10 && i10 <= n();
    }

    @Override // ge.g
    public String toString() {
        return l() + ".." + n();
    }

    @Override // ge.f
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Integer f() {
        return Integer.valueOf(n());
    }

    @Override // ge.f
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Integer d() {
        return Integer.valueOf(l());
    }
}
