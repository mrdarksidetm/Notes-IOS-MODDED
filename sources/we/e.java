package we;

import ae.m0;
import ae.r;
import ae.s;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import md.i0;
import md.l;
import md.n;
import md.p;
import nd.h0;
import nd.o;
import nd.q0;
import nd.r0;
import nd.u;
import ye.d;
import ye.j;

/* JADX INFO: loaded from: classes2.dex */
public final class e<T> extends af.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final he.c<T> f22897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<? extends Annotation> f22898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f22899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<he.c<? extends T>, we.b<? extends T>> f22900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, we.b<? extends T>> f22901e;

    static final class a extends s implements zd.a<ye.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e<T> f22903b;

        /* JADX INFO: renamed from: we.e$a$a, reason: collision with other inner class name */
        static final class C0475a extends s implements zd.l<ye.a, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e<T> f22904a;

            /* JADX INFO: renamed from: we.e$a$a$a, reason: collision with other inner class name */
            static final class C0476a extends s implements zd.l<ye.a, i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ e<T> f22905a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0476a(e<T> eVar) {
                    super(1);
                    this.f22905a = eVar;
                }

                public final void a(ye.a aVar) {
                    r.f(aVar, "$this$buildSerialDescriptor");
                    for (Map.Entry entry : ((e) this.f22905a).f22901e.entrySet()) {
                        ye.a.b(aVar, (String) entry.getKey(), ((we.b) entry.getValue()).getDescriptor(), null, false, 12, null);
                    }
                }

                @Override // zd.l
                public /* bridge */ /* synthetic */ i0 invoke(ye.a aVar) {
                    a(aVar);
                    return i0.f15558a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0475a(e<T> eVar) {
                super(1);
                this.f22904a = eVar;
            }

            public final void a(ye.a aVar) {
                r.f(aVar, "$this$buildSerialDescriptor");
                ye.a.b(aVar, "type", xe.a.y(m0.f720a).getDescriptor(), null, false, 12, null);
                ye.a.b(aVar, "value", ye.i.b("kotlinx.serialization.Sealed<" + this.f22904a.e().b() + '>', j.a.f24009a, new ye.f[0], new C0476a(this.f22904a)), null, false, 12, null);
                aVar.h(((e) this.f22904a).f22898b);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(ye.a aVar) {
                a(aVar);
                return i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, e<T> eVar) {
            super(0);
            this.f22902a = str;
            this.f22903b = eVar;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ye.f invoke() {
            return ye.i.b(this.f22902a, d.a.f23978a, new ye.f[0], new C0475a(this.f22903b));
        }
    }

    public static final class b implements h0<Map.Entry<? extends he.c<? extends T>, ? extends we.b<? extends T>>, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f22906a;

        public b(Iterable iterable) {
            this.f22906a = iterable;
        }

        @Override // nd.h0
        public String a(Map.Entry<? extends he.c<? extends T>, ? extends we.b<? extends T>> entry) {
            return entry.getValue().getDescriptor().a();
        }

        @Override // nd.h0
        public Iterator<Map.Entry<? extends he.c<? extends T>, ? extends we.b<? extends T>>> b() {
            return this.f22906a.iterator();
        }
    }

    public e(String str, he.c<T> cVar, he.c<? extends T>[] cVarArr, we.b<? extends T>[] bVarArr) {
        r.f(str, "serialName");
        r.f(cVar, "baseClass");
        r.f(cVarArr, "subclasses");
        r.f(bVarArr, "subclassSerializers");
        this.f22897a = cVar;
        this.f22898b = u.m();
        this.f22899c = n.a(p.f15570b, new a(str, this));
        if (cVarArr.length != bVarArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + e().b() + " should be marked @Serializable");
        }
        Map<he.c<? extends T>, we.b<? extends T>> mapR = r0.r(nd.p.P0(cVarArr, bVarArr));
        this.f22900d = mapR;
        h0 bVar = new b(mapR.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = bVar.b();
        while (itB.hasNext()) {
            T next = itB.next();
            Object objA = bVar.a(next);
            Object obj = linkedHashMap.get(objA);
            if (obj == null) {
                linkedHashMap.containsKey(objA);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str2 = (String) objA;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + e() + "' have the same serial name '" + str2 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(objA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (we.b) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f22901e = linkedHashMap2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(String str, he.c<T> cVar, he.c<? extends T>[] cVarArr, we.b<? extends T>[] bVarArr, Annotation[] annotationArr) {
        this(str, cVar, cVarArr, bVarArr);
        r.f(str, "serialName");
        r.f(cVar, "baseClass");
        r.f(cVarArr, "subclasses");
        r.f(bVarArr, "subclassSerializers");
        r.f(annotationArr, "classAnnotations");
        this.f22898b = o.c(annotationArr);
    }

    @Override // af.b
    public we.a<T> c(ze.c cVar, String str) {
        r.f(cVar, "decoder");
        we.b<? extends T> bVar = this.f22901e.get(str);
        return bVar != null ? bVar : super.c(cVar, str);
    }

    @Override // af.b
    public h<T> d(ze.f fVar, T t10) {
        r.f(fVar, "encoder");
        r.f(t10, "value");
        we.b<? extends T> bVarD = this.f22900d.get(ae.i0.b(t10.getClass()));
        if (bVarD == null) {
            bVarD = super.d(fVar, t10);
        }
        if (bVarD != null) {
            return bVarD;
        }
        return null;
    }

    @Override // af.b
    public he.c<T> e() {
        return this.f22897a;
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return (ye.f) this.f22899c.getValue();
    }
}
