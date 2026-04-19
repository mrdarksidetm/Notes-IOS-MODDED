package rd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19459a = new a("COROUTINE_SUSPENDED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19460b = new a("UNDECIDED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f19461c = new a("RESUMED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f19462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ td.a f19463e;

    static {
        a[] aVarArrA = a();
        f19462d = aVarArrA;
        f19463e = td.b.a(aVarArrA);
    }

    private a(String str, int i10) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f19459a, f19460b, f19461c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f19462d.clone();
    }
}
