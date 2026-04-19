package he;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f11905a = new l("PUBLIC", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f11906b = new l("PROTECTED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f11907c = new l("INTERNAL", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f11908d = new l("PRIVATE", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ l[] f11909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ td.a f11910f;

    static {
        l[] lVarArrA = a();
        f11909e = lVarArrA;
        f11910f = td.b.a(lVarArrA);
    }

    private l(String str, int i10) {
    }

    private static final /* synthetic */ l[] a() {
        return new l[]{f11905a, f11906b, f11907c, f11908d};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f11909e.clone();
    }
}
