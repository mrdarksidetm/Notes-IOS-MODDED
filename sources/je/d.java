package je;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f14190a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f14191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f14192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f14193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f14194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f14195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f14196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Charset f14197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile Charset f14198i;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        ae.r.e(charsetForName, "forName(...)");
        f14191b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        ae.r.e(charsetForName2, "forName(...)");
        f14192c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        ae.r.e(charsetForName3, "forName(...)");
        f14193d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        ae.r.e(charsetForName4, "forName(...)");
        f14194e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        ae.r.e(charsetForName5, "forName(...)");
        f14195f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        ae.r.e(charsetForName6, "forName(...)");
        f14196g = charsetForName6;
    }

    private d() {
    }

    public final Charset a() {
        Charset charset = f14198i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        ae.r.e(charsetForName, "forName(...)");
        f14198i = charsetForName;
        return charsetForName;
    }

    public final Charset b() {
        Charset charset = f14197h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        ae.r.e(charsetForName, "forName(...)");
        f14197h = charsetForName;
        return charsetForName;
    }
}
