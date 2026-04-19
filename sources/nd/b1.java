package nd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f16100a = new b1("Ready", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1 f16101b = new b1("NotReady", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1 f16102c = new b1("Done", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b1 f16103d = new b1("Failed", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ b1[] f16104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ td.a f16105f;

    static {
        b1[] b1VarArrA = a();
        f16104e = b1VarArrA;
        f16105f = td.b.a(b1VarArrA);
    }

    private b1(String str, int i10) {
    }

    private static final /* synthetic */ b1[] a() {
        return new b1[]{f16100a, f16101b, f16102c, f16103d};
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) f16104e.clone();
    }
}
