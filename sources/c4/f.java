package c4;

import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.h0;
import androidx.datastore.preferences.protobuf.k1;
import androidx.datastore.preferences.protobuf.w;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends w<f, a> implements e4.e {
    private static final f DEFAULT_INSTANCE;
    private static volatile e4.f<f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private h0<String, h> preferences_ = h0.f();

    public static final class a extends w.a<f, a> implements e4.e {
        private a() {
            super(f.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(e eVar) {
            this();
        }

        public a A(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            t();
            ((f) this.f3751b).M().put(str, hVar);
            return this;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g0<String, h> f6388a = g0.d(k1.b.f3671k, "", k1.b.f3673m, h.T());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        w.I(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, h> M() {
        return O();
    }

    private h0<String, h> O() {
        if (!this.preferences_.j()) {
            this.preferences_ = this.preferences_.p();
        }
        return this.preferences_;
    }

    private h0<String, h> P() {
        return this.preferences_;
    }

    public static a Q() {
        return DEFAULT_INSTANCE.s();
    }

    public static f R(InputStream inputStream) {
        return (f) w.G(DEFAULT_INSTANCE, inputStream);
    }

    public Map<String, h> N() {
        return Collections.unmodifiableMap(P());
    }

    @Override // androidx.datastore.preferences.protobuf.w
    protected final Object v(w.f fVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f6387a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return w.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f6388a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                e4.f<f> bVar = PARSER;
                if (bVar == null) {
                    synchronized (f.class) {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new w.b<>(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                        break;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
