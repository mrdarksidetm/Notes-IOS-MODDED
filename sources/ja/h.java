package ja;

import ja.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, ga.d<?>> f14170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, ga.f<?>> f14171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ga.d<Object> f14172c;

    public static final class a implements ha.b<a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ga.d<Object> f14173d = new ga.d() { // from class: ja.g
            @Override // ga.d
            public final void encode(Object obj, Object obj2) {
                h.a.d(obj, (ga.e) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, ga.d<?>> f14174a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, ga.f<?>> f14175b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ga.d<Object> f14176c = f14173d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(Object obj, ga.e eVar) {
            throw new ga.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h b() {
            return new h(new HashMap(this.f14174a), new HashMap(this.f14175b), this.f14176c);
        }

        public a c(ha.a aVar) {
            aVar.configure(this);
            return this;
        }

        @Override // ha.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public <U> a registerEncoder(Class<U> cls, ga.d<? super U> dVar) {
            this.f14174a.put(cls, dVar);
            this.f14175b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, ga.d<?>> map, Map<Class<?>, ga.f<?>> map2, ga.d<Object> dVar) {
        this.f14170a = map;
        this.f14171b = map2;
        this.f14172c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f14170a, this.f14171b, this.f14172c).n(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
