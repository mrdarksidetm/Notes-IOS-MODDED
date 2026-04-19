package y6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f23433a = new j("File", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f23434b = new j("Photo", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ j[] f23435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ td.a f23436d;

    static {
        j[] jVarArrA = a();
        f23435c = jVarArrA;
        f23436d = td.b.a(jVarArrA);
    }

    private j(String str, int i10) {
    }

    private static final /* synthetic */ j[] a() {
        return new j[]{f23433a, f23434b};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f23435c.clone();
    }
}
