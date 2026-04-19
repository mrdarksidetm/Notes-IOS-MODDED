package md;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f15569a = new p("SYNCHRONIZED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f15570b = new p("PUBLICATION", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f15571c = new p("NONE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ p[] f15572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ td.a f15573e;

    static {
        p[] pVarArrA = a();
        f15572d = pVarArrA;
        f15573e = td.b.a(pVarArrA);
    }

    private p(String str, int i10) {
    }

    private static final /* synthetic */ p[] a() {
        return new p[]{f15569a, f15570b, f15571c};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f15572d.clone();
    }
}
