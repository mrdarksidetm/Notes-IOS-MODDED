package m1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f15198a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f15199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f15200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final x f15201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final x f15202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final w f15203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final w f15204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final w f15205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final w f15206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final w f15207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final w f15208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final w f15209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final w f15210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w f15211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final w f15212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final w f15213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final w f15214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final w f15215r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final w f15216s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final c f15217t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final c f15218u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final w f15219v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final c f15220w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final c[] f15221x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f15199b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f15200c = fArr2;
        x xVar = new x(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f15201d = xVar;
        x xVar2 = new x(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f15202e = xVar2;
        j jVar = j.f15235a;
        w wVar = new w("sRGB IEC61966-2.1", fArr, jVar.e(), xVar, 0);
        f15203f = wVar;
        w wVar2 = new w("sRGB IEC61966-2.1 (Linear)", fArr, jVar.e(), 1.0d, 0.0f, 1.0f, 1);
        f15204g = wVar2;
        w wVar3 = new w("scRGB-nl IEC 61966-2-2:2003", fArr, jVar.e(), null, new i() { // from class: m1.e
            @Override // m1.i
            public final double a(double d10) {
                return g.c(d10);
            }
        }, new i() { // from class: m1.f
            @Override // m1.i
            public final double a(double d10) {
                return g.d(d10);
            }
        }, -0.799f, 2.399f, xVar, 2);
        f15205h = wVar3;
        w wVar4 = new w("scRGB IEC 61966-2-2:2003", fArr, jVar.e(), 1.0d, -0.5f, 7.499f, 3);
        f15206i = wVar4;
        w wVar5 = new w("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, jVar.e(), new x(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f15207j = wVar5;
        w wVar6 = new w("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, jVar.e(), new x(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f15208k = wVar6;
        w wVar7 = new w("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new y(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f15209l = wVar7;
        w wVar8 = new w("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, jVar.e(), xVar, 7);
        f15210m = wVar8;
        w wVar9 = new w("NTSC (1953)", fArr2, jVar.a(), new x(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f15211n = wVar9;
        w wVar10 = new w("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, jVar.e(), new x(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f15212o = wVar10;
        w wVar11 = new w("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, jVar.e(), 2.2d, 0.0f, 1.0f, 10);
        f15213p = wVar11;
        w wVar12 = new w("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, jVar.b(), new x(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f15214q = wVar12;
        w wVar13 = new w("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, jVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f15215r = wVar13;
        w wVar14 = new w("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, jVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f15216s = wVar14;
        z zVar = new z("Generic XYZ", 14);
        f15217t = zVar;
        k kVar = new k("Generic L*a*b*", 15);
        f15218u = kVar;
        w wVar15 = new w("None", fArr, jVar.e(), xVar2, 16);
        f15219v = wVar15;
        l lVar = new l("Oklab", 17);
        f15220w = lVar;
        f15221x = new c[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9, wVar10, wVar11, wVar12, wVar13, wVar14, zVar, kVar, wVar15, lVar};
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double c(double d10) {
        return d.a(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double d(double d10) {
        return d.b(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final w e() {
        return f15215r;
    }

    public final w f() {
        return f15216s;
    }

    public final w g() {
        return f15213p;
    }

    public final w h() {
        return f15208k;
    }

    public final w i() {
        return f15207j;
    }

    public final c j() {
        return f15218u;
    }

    public final c k() {
        return f15217t;
    }

    public final c[] l() {
        return f15221x;
    }

    public final w m() {
        return f15209l;
    }

    public final w n() {
        return f15210m;
    }

    public final w o() {
        return f15205h;
    }

    public final w p() {
        return f15206i;
    }

    public final w q() {
        return f15204g;
    }

    public final w r() {
        return f15211n;
    }

    public final float[] s() {
        return f15200c;
    }

    public final c t() {
        return f15220w;
    }

    public final w u() {
        return f15214q;
    }

    public final w v() {
        return f15212o;
    }

    public final w w() {
        return f15203f;
    }

    public final float[] x() {
        return f15199b;
    }

    public final w y() {
        return f15219v;
    }
}
