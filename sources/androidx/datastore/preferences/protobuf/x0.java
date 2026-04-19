package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class x0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f3775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f3777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3778d;

    x0(n0 n0Var, String str, Object[] objArr) {
        char cCharAt;
        this.f3775a = n0Var;
        this.f3776b = str;
        this.f3777c = objArr;
        int iCharAt = str.charAt(0);
        if (iCharAt >= 55296) {
            int i10 = iCharAt & 8191;
            int i11 = 13;
            int i12 = 1;
            while (true) {
                int i13 = i12 + 1;
                cCharAt = str.charAt(i12);
                if (cCharAt < 55296) {
                    break;
                }
                i10 |= (cCharAt & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
            iCharAt = i10 | (cCharAt << i11);
        }
        this.f3778d = iCharAt;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public boolean a() {
        return (this.f3778d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public n0 b() {
        return this.f3775a;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public e4.g c() {
        return (this.f3778d & 1) == 1 ? e4.g.PROTO2 : e4.g.PROTO3;
    }

    Object[] d() {
        return this.f3777c;
    }

    String e() {
        return this.f3776b;
    }
}
