package je;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14219b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f14220a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    static final class b extends ae.s implements zd.a<h> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f14222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f14223c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence, int i10) {
            super(0);
            this.f14222b = charSequence;
            this.f14223c = i10;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return j.this.a(this.f14222b, this.f14223c);
        }
    }

    /* synthetic */ class c extends ae.o implements zd.l<h, h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f14224a = new c();

        c() {
            super(1, h.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final h invoke(h hVar) {
            ae.r.f(hVar, "p0");
            return hVar.next();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(String str) {
        ae.r.f(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        ae.r.e(patternCompile, "compile(...)");
        this(patternCompile);
    }

    public j(Pattern pattern) {
        ae.r.f(pattern, "nativePattern");
        this.f14220a = pattern;
    }

    public static /* synthetic */ ie.g c(j jVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return jVar.b(charSequence, i10);
    }

    public final h a(CharSequence charSequence, int i10) {
        ae.r.f(charSequence, "input");
        Matcher matcher = this.f14220a.matcher(charSequence);
        ae.r.e(matcher, "matcher(...)");
        return k.e(matcher, i10, charSequence);
    }

    public final ie.g<h> b(CharSequence charSequence, int i10) {
        ae.r.f(charSequence, "input");
        if (i10 >= 0 && i10 <= charSequence.length()) {
            return ie.m.h(new b(charSequence, i10), c.f14224a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i10 + ", input length: " + charSequence.length());
    }

    public final h d(CharSequence charSequence) {
        ae.r.f(charSequence, "input");
        Matcher matcher = this.f14220a.matcher(charSequence);
        ae.r.e(matcher, "matcher(...)");
        return k.f(matcher, charSequence);
    }

    public final boolean e(CharSequence charSequence) {
        ae.r.f(charSequence, "input");
        return this.f14220a.matcher(charSequence).matches();
    }

    public final String f(CharSequence charSequence, String str) {
        ae.r.f(charSequence, "input");
        ae.r.f(str, "replacement");
        String strReplaceAll = this.f14220a.matcher(charSequence).replaceAll(str);
        ae.r.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public String toString() {
        String string = this.f14220a.toString();
        ae.r.e(string, "toString(...)");
        return string;
    }
}
