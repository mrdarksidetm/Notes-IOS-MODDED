package e4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f10520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f10521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f10522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f10523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f10524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f10525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f10526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f10527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f10528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f10529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ c[] f10530n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f10531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?> f10532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10533c;

    static {
        c cVar = new c("VOID", 0, Void.class, Void.class, null);
        f10520d = cVar;
        Class cls = Integer.TYPE;
        c cVar2 = new c("INT", 1, cls, Integer.class, 0);
        f10521e = cVar2;
        c cVar3 = new c("LONG", 2, Long.TYPE, Long.class, 0L);
        f10522f = cVar3;
        c cVar4 = new c("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f10523g = cVar4;
        c cVar5 = new c("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f10524h = cVar5;
        c cVar6 = new c("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f10525i = cVar6;
        c cVar7 = new c("STRING", 6, String.class, String.class, "");
        f10526j = cVar7;
        c cVar8 = new c("BYTE_STRING", 7, androidx.datastore.preferences.protobuf.g.class, androidx.datastore.preferences.protobuf.g.class, androidx.datastore.preferences.protobuf.g.f3561b);
        f10527k = cVar8;
        c cVar9 = new c("ENUM", 8, cls, Integer.class, null);
        f10528l = cVar9;
        c cVar10 = new c("MESSAGE", 9, Object.class, Object.class, null);
        f10529m = cVar10;
        f10530n = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10};
    }

    private c(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f10531a = cls;
        this.f10532b = cls2;
        this.f10533c = obj;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f10530n.clone();
    }

    public Class<?> a() {
        return this.f10532b;
    }
}
