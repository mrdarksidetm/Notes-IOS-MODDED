package i5;

import ae.r;
import ae.s;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.v;
import md.n;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparable<k> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f12550f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final k f12551g = new k(0, 0, 0, "");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final k f12552h = new k(0, 1, 0, "");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final k f12553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final k f12554j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final md.l f12559e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final k a() {
            return k.f12552h;
        }

        public final k b(String str) {
            String strGroup;
            if (str != null && !v.v(str)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                    int i10 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    if (strGroup2 != null) {
                        int i11 = Integer.parseInt(strGroup2);
                        String strGroup3 = matcher.group(3);
                        if (strGroup3 != null) {
                            int i12 = Integer.parseInt(strGroup3);
                            String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
                            r.e(strGroup4, com.amazon.a.a.o.b.f7429c);
                            return new k(i10, i11, i12, strGroup4, null);
                        }
                    }
                }
            }
            return null;
        }
    }

    static final class b extends s implements zd.a<BigInteger> {
        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BigInteger invoke() {
            return BigInteger.valueOf(k.this.i()).shiftLeft(32).or(BigInteger.valueOf(k.this.j())).shiftLeft(32).or(BigInteger.valueOf(k.this.l()));
        }
    }

    static {
        k kVar = new k(1, 0, 0, "");
        f12553i = kVar;
        f12554j = kVar;
    }

    private k(int i10, int i11, int i12, String str) {
        this.f12555a = i10;
        this.f12556b = i11;
        this.f12557c = i12;
        this.f12558d = str;
        this.f12559e = n.b(new b());
    }

    public /* synthetic */ k(int i10, int i11, int i12, String str, ae.j jVar) {
        this(i10, i11, i12, str);
    }

    private final BigInteger c() {
        Object value = this.f12559e.getValue();
        r.e(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        r.f(kVar, "other");
        return c().compareTo(kVar.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f12555a == kVar.f12555a && this.f12556b == kVar.f12556b && this.f12557c == kVar.f12557c;
    }

    public int hashCode() {
        return ((((527 + this.f12555a) * 31) + this.f12556b) * 31) + this.f12557c;
    }

    public final int i() {
        return this.f12555a;
    }

    public final int j() {
        return this.f12556b;
    }

    public final int l() {
        return this.f12557c;
    }

    public String toString() {
        String str;
        if (!v.v(this.f12558d)) {
            str = '-' + this.f12558d;
        } else {
            str = "";
        }
        return this.f12555a + com.amazon.a.a.o.c.a.b.f7490a + this.f12556b + com.amazon.a.a.o.c.a.b.f7490a + this.f12557c + str;
    }
}
