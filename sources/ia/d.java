package ia;

import ga.f;
import ga.g;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements ha.b<d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ga.d<Object> f12606e = new ga.d() { // from class: ia.a
        @Override // ga.d
        public final void encode(Object obj, Object obj2) {
            d.k(obj, (ga.e) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f<String> f12607f = new f() { // from class: ia.b
        @Override // ga.f
        public final void encode(Object obj, Object obj2) {
            ((g) obj2).add((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f<Boolean> f12608g = new f() { // from class: ia.c
        @Override // ga.f
        public final void encode(Object obj, Object obj2) {
            d.m((Boolean) obj, (g) obj2);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f12609h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, ga.d<?>> f12610a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, f<?>> f12611b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ga.d<Object> f12612c = f12606e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12613d = false;

    class a implements ga.a {
        a() {
        }

        @Override // ga.a
        public void a(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.f12610a, d.this.f12611b, d.this.f12612c, d.this.f12613d);
            eVar.b(obj, false);
            eVar.i();
        }

        @Override // ga.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class b implements f<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final DateFormat f12615a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f12615a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // ga.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(Date date, g gVar) {
            gVar.add(f12615a.format(date));
        }
    }

    public d() {
        o(String.class, f12607f);
        o(Boolean.class, f12608g);
        o(Date.class, f12609h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(Object obj, ga.e eVar) {
        throw new ga.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Boolean bool, g gVar) {
        gVar.add(bool.booleanValue());
    }

    public ga.a h() {
        return new a();
    }

    public d i(ha.a aVar) {
        aVar.configure(this);
        return this;
    }

    public d j(boolean z10) {
        this.f12613d = z10;
        return this;
    }

    @Override // ha.b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public <T> d registerEncoder(Class<T> cls, ga.d<? super T> dVar) {
        this.f12610a.put(cls, dVar);
        this.f12611b.remove(cls);
        return this;
    }

    public <T> d o(Class<T> cls, f<? super T> fVar) {
        this.f12611b.put(cls, fVar);
        this.f12610a.remove(cls);
        return this;
    }
}
