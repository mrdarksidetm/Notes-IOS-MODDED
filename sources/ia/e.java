package ia;

import android.util.Base64;
import android.util.JsonWriter;
import ga.f;
import ga.g;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class e implements ga.e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f12616a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12617b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonWriter f12618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, ga.d<?>> f12619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, f<?>> f12620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ga.d<Object> f12621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f12622g;

    e(Writer writer, Map<Class<?>, ga.d<?>> map, Map<Class<?>, f<?>> map2, ga.d<Object> dVar, boolean z10) {
        this.f12618c = new JsonWriter(writer);
        this.f12619d = map;
        this.f12620e = map2;
        this.f12621f = dVar;
        this.f12622g = z10;
    }

    private boolean h(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e k(String str, Object obj) throws IOException {
        m();
        this.f12618c.name(str);
        if (obj != null) {
            return b(obj, false);
        }
        this.f12618c.nullValue();
        return this;
    }

    private e l(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        m();
        this.f12618c.name(str);
        return b(obj, false);
    }

    private void m() throws IOException {
        if (!this.f12617b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f12616a;
        if (eVar != null) {
            eVar.m();
            this.f12616a.f12617b = false;
            this.f12616a = null;
            this.f12618c.endObject();
        }
    }

    public e a(long j10) throws IOException {
        m();
        this.f12618c.value(j10);
        return this;
    }

    @Override // ga.e
    public ga.e add(ga.c cVar, long j10) {
        return d(cVar.b(), j10);
    }

    @Override // ga.e
    public ga.e add(ga.c cVar, Object obj) {
        return e(cVar.b(), obj);
    }

    e b(Object obj, boolean z10) throws IOException {
        int i10 = 0;
        if (z10 && h(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new ga.b(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f12618c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f12618c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f12618c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    b(it.next(), false);
                }
                this.f12618c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f12618c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        e((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new ga.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f12618c.endObject();
                return this;
            }
            ga.d<?> dVar = this.f12619d.get(obj.getClass());
            if (dVar != null) {
                return j(dVar, obj, z10);
            }
            f<?> fVar = this.f12620e.get(obj.getClass());
            if (fVar != null) {
                fVar.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return j(this.f12621f, obj, z10);
            }
            add(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return g((byte[]) obj);
        }
        this.f12618c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f12618c.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                a(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f12618c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f12618c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                b(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                b(obj2, false);
            }
        }
        this.f12618c.endArray();
        return this;
    }

    @Override // ga.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e add(String str) throws IOException {
        m();
        this.f12618c.value(str);
        return this;
    }

    public e d(String str, long j10) throws IOException {
        m();
        this.f12618c.name(str);
        return a(j10);
    }

    public e e(String str, Object obj) {
        return this.f12622g ? l(str, obj) : k(str, obj);
    }

    @Override // ga.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e add(boolean z10) throws IOException {
        m();
        this.f12618c.value(z10);
        return this;
    }

    public e g(byte[] bArr) throws IOException {
        m();
        if (bArr == null) {
            this.f12618c.nullValue();
        } else {
            this.f12618c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void i() throws IOException {
        m();
        this.f12618c.flush();
    }

    e j(ga.d<Object> dVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f12618c.beginObject();
        }
        dVar.encode(obj, this);
        if (!z10) {
            this.f12618c.endObject();
        }
        return this;
    }
}
