package l9;

/* JADX INFO: loaded from: classes.dex */
public enum p implements a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14898a;

    p(int i10) {
        this.f14898a = i10;
    }

    @Override // l9.a
    public int a() {
        return this.f14898a;
    }
}
