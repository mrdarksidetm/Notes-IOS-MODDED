package ke;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f14466b = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f14467c = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f14468d = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f14469e = new d("SECONDS", 3, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f14470f = new d("MINUTES", 4, TimeUnit.MINUTES);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f14471g = new d("HOURS", 5, TimeUnit.HOURS);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f14472h = new d("DAYS", 6, TimeUnit.DAYS);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ d[] f14473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ td.a f14474j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeUnit f14475a;

    static {
        d[] dVarArrA = a();
        f14473i = dVarArrA;
        f14474j = td.b.a(dVarArrA);
    }

    private d(String str, int i10, TimeUnit timeUnit) {
        this.f14475a = timeUnit;
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f14466b, f14467c, f14468d, f14469e, f14470f, f14471g, f14472h};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f14473i.clone();
    }

    public final TimeUnit b() {
        return this.f14475a;
    }
}
