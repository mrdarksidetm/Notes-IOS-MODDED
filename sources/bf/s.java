package bf;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends w {
    public static final s INSTANCE = new s();
    private static final String content = "null";
    private static final /* synthetic */ md.l<we.b<Object>> $cachedSerializer$delegate = md.n.a(md.p.f15570b, a.f5844a);

    static final class a extends ae.s implements zd.a<we.b<Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5844a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        public final we.b<Object> invoke() {
            return t.f5845a;
        }
    }

    private s() {
        super(null);
    }

    private final /* synthetic */ we.b f() {
        return $cachedSerializer$delegate.getValue();
    }

    @Override // bf.w
    public String a() {
        return content;
    }

    @Override // bf.w
    public boolean d() {
        return false;
    }

    public final we.b<s> serializer() {
        return f();
    }
}
