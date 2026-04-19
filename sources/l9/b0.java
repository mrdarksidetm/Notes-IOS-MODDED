package l9;

/* JADX INFO: loaded from: classes.dex */
public enum b0 implements a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14815a;

    b0(int i10) {
        this.f14815a = i10;
    }

    @Override // l9.a
    public int a() {
        return this.f14815a;
    }
}
