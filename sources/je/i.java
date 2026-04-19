package je;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import je.h;

/* JADX INFO: loaded from: classes2.dex */
final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matcher f14212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f14213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f14214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<String> f14215d;

    public static final class a extends nd.c<String> {
        a() {
        }

        @Override // nd.a
        public int a() {
            return i.this.e().groupCount() + 1;
        }

        @Override // nd.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return d((String) obj);
            }
            return false;
        }

        public /* bridge */ boolean d(String str) {
            return super.contains(str);
        }

        @Override // nd.c, java.util.List
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = i.this.e().group(i10);
            return strGroup == null ? "" : strGroup;
        }

        @Override // nd.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return l((String) obj);
            }
            return -1;
        }

        public /* bridge */ int l(String str) {
            return super.indexOf(str);
        }

        @Override // nd.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return n((String) obj);
            }
            return -1;
        }

        public /* bridge */ int n(String str) {
            return super.lastIndexOf(str);
        }
    }

    public static final class b extends nd.a<f> implements g {

        static final class a extends ae.s implements zd.l<Integer, f> {
            a() {
                super(1);
            }

            public final f a(int i10) {
                return b.this.f(i10);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ f invoke(Integer num) {
                return a(num.intValue());
            }
        }

        b() {
        }

        @Override // nd.a
        public int a() {
            return i.this.e().groupCount() + 1;
        }

        @Override // nd.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return d((f) obj);
            }
            return false;
        }

        public /* bridge */ boolean d(f fVar) {
            return super.contains(fVar);
        }

        public f f(int i10) {
            ge.i iVarH = k.h(i.this.e(), i10);
            if (iVarH.d().intValue() < 0) {
                return null;
            }
            String strGroup = i.this.e().group(i10);
            ae.r.e(strGroup, "group(...)");
            return new f(strGroup, iVarH);
        }

        @Override // nd.a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<f> iterator() {
            return ie.o.s(nd.c0.R(nd.u.n(this)), new a()).iterator();
        }
    }

    public i(Matcher matcher, CharSequence charSequence) {
        ae.r.f(matcher, "matcher");
        ae.r.f(charSequence, "input");
        this.f14212a = matcher;
        this.f14213b = charSequence;
        this.f14214c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult e() {
        return this.f14212a;
    }

    @Override // je.h
    public h.b a() {
        return h.a.a(this);
    }

    @Override // je.h
    public List<String> b() {
        if (this.f14215d == null) {
            this.f14215d = new a();
        }
        List<String> list = this.f14215d;
        ae.r.c(list);
        return list;
    }

    @Override // je.h
    public ge.i c() {
        return k.g(e());
    }

    @Override // je.h
    public String getValue() {
        String strGroup = e().group();
        ae.r.e(strGroup, "group(...)");
        return strGroup;
    }

    @Override // je.h
    public h next() {
        int iEnd = e().end() + (e().end() == e().start() ? 1 : 0);
        if (iEnd > this.f14213b.length()) {
            return null;
        }
        Matcher matcher = this.f14212a.pattern().matcher(this.f14213b);
        ae.r.e(matcher, "matcher(...)");
        return k.e(matcher, iEnd, this.f14213b);
    }
}
