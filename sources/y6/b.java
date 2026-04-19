package y6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f23367a = new b("FilesSaving", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f23368b = new b("DirectoryDocumentsPicker", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ b[] f23369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ td.a f23370d;

    static {
        b[] bVarArrA = a();
        f23369c = bVarArrA;
        f23370d = td.b.a(bVarArrA);
    }

    private b(String str, int i10) {
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f23367a, f23368b};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f23369c.clone();
    }
}
