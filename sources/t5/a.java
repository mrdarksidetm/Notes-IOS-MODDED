package t5;

import td.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21262a = new a("TOP_LEFT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21263b = new a("TOP_RIGHT", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21264c = new a("BOTTOM_RIGHT", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f21265d = new a("BOTTOM_LEFT", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f21266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ td.a f21267f;

    static {
        a[] aVarArrA = a();
        f21266e = aVarArrA;
        f21267f = b.a(aVarArrA);
    }

    private a(String str, int i10) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f21262a, f21263b, f21264c, f21265d};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f21266e.clone();
    }
}
