package ja;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import ja.d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class f implements ga.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f14160f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ga.c f14161g = ga.c.a(SubscriberAttributeKt.JSON_NAME_KEY).b(ja.a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ga.c f14162h = ga.c.a("value").b(ja.a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ga.d<Map.Entry<Object, Object>> f14163i = new ga.d() { // from class: ja.e
        @Override // ga.d
        public final void encode(Object obj, Object obj2) {
            f.q((Map.Entry) obj, (ga.e) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f14164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, ga.d<?>> f14165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, ga.f<?>> f14166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ga.d<Object> f14167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f14168e = new i(this);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14169a;

        static {
            int[] iArr = new int[d.a.values().length];
            f14169a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14169a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14169a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map<Class<?>, ga.d<?>> map, Map<Class<?>, ga.f<?>> map2, ga.d<Object> dVar) {
        this.f14164a = outputStream;
        this.f14165b = map;
        this.f14166c = map2;
        this.f14167d = dVar;
    }

    private static ByteBuffer j(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long k(ga.d<T> dVar, T t10) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f14164a;
            this.f14164a = bVar;
            try {
                dVar.encode(t10, this);
                this.f14164a = outputStream;
                long jA = bVar.a();
                bVar.close();
                return jA;
            } catch (Throwable th) {
                this.f14164a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> f l(ga.d<T> dVar, ga.c cVar, T t10, boolean z10) throws IOException {
        long jK = k(dVar, t10);
        if (z10 && jK == 0) {
            return this;
        }
        r((p(cVar) << 3) | 2);
        s(jK);
        dVar.encode(t10, this);
        return this;
    }

    private <T> f m(ga.f<T> fVar, ga.c cVar, T t10, boolean z10) {
        this.f14168e.b(cVar, z10);
        fVar.encode(t10, this.f14168e);
        return this;
    }

    private static d o(ga.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new ga.b("Field has no @Protobuf config");
    }

    private static int p(ga.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new ga.b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(Map.Entry entry, ga.e eVar) {
        eVar.add(f14161g, entry.getKey());
        eVar.add(f14162h, entry.getValue());
    }

    private void r(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f14164a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f14164a.write(i10 & 127);
    }

    private void s(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f14164a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f14164a.write(((int) j10) & 127);
    }

    @Override // ga.e
    public ga.e add(ga.c cVar, Object obj) {
        return d(cVar, obj, true);
    }

    ga.e b(ga.c cVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        r((p(cVar) << 3) | 1);
        this.f14164a.write(j(8).putDouble(d10).array());
        return this;
    }

    ga.e c(ga.c cVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        r((p(cVar) << 3) | 5);
        this.f14164a.write(j(4).putFloat(f10).array());
        return this;
    }

    ga.e d(ga.c cVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            r((p(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f14160f);
            r(bytes.length);
            this.f14164a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                l(f14163i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return b(cVar, ((Double) obj).doubleValue(), z10);
        }
        if (obj instanceof Float) {
            return c(cVar, ((Float) obj).floatValue(), z10);
        }
        if (obj instanceof Number) {
            return h(cVar, ((Number) obj).longValue(), z10);
        }
        if (obj instanceof Boolean) {
            return i(cVar, ((Boolean) obj).booleanValue(), z10);
        }
        if (!(obj instanceof byte[])) {
            ga.d<?> dVar = this.f14165b.get(obj.getClass());
            if (dVar != null) {
                return l(dVar, cVar, obj, z10);
            }
            ga.f<?> fVar = this.f14166c.get(obj.getClass());
            return fVar != null ? m(fVar, cVar, obj, z10) : obj instanceof c ? e(cVar, ((c) obj).d()) : obj instanceof Enum ? e(cVar, ((Enum) obj).ordinal()) : l(this.f14167d, cVar, obj, z10);
        }
        byte[] bArr = (byte[]) obj;
        if (z10 && bArr.length == 0) {
            return this;
        }
        r((p(cVar) << 3) | 2);
        r(bArr.length);
        this.f14164a.write(bArr);
        return this;
    }

    public f e(ga.c cVar, int i10) {
        return f(cVar, i10, true);
    }

    f f(ga.c cVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        d dVarO = o(cVar);
        int i11 = a.f14169a[dVarO.intEncoding().ordinal()];
        if (i11 == 1) {
            r(dVarO.tag() << 3);
            r(i10);
        } else if (i11 == 2) {
            r(dVarO.tag() << 3);
            r((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            r((dVarO.tag() << 3) | 5);
            this.f14164a.write(j(4).putInt(i10).array());
        }
        return this;
    }

    @Override // ga.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public f add(ga.c cVar, long j10) {
        return h(cVar, j10, true);
    }

    f h(ga.c cVar, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        d dVarO = o(cVar);
        int i10 = a.f14169a[dVarO.intEncoding().ordinal()];
        if (i10 == 1) {
            r(dVarO.tag() << 3);
            s(j10);
        } else if (i10 == 2) {
            r(dVarO.tag() << 3);
            s((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            r((dVarO.tag() << 3) | 1);
            this.f14164a.write(j(8).putLong(j10).array());
        }
        return this;
    }

    f i(ga.c cVar, boolean z10, boolean z11) {
        return f(cVar, z10 ? 1 : 0, z11);
    }

    f n(Object obj) {
        if (obj == null) {
            return this;
        }
        ga.d<?> dVar = this.f14165b.get(obj.getClass());
        if (dVar != null) {
            dVar.encode(obj, this);
            return this;
        }
        throw new ga.b("No encoder for " + obj.getClass());
    }
}
