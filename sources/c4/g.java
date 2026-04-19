package c4;

import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.y;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends w<g, a> implements e4.e {
    private static final g DEFAULT_INSTANCE;
    private static volatile e4.f<g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private y.i<String> strings_ = w.w();

    public static final class a extends w.a<g, a> implements e4.e {
        private a() {
            super(g.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(e eVar) {
            this();
        }

        public a A(Iterable<String> iterable) {
            t();
            ((g) this.f3751b).M(iterable);
            return this;
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        w.I(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(Iterable<String> iterable) {
        N();
        androidx.datastore.preferences.protobuf.a.a(iterable, this.strings_);
    }

    private void N() {
        if (this.strings_.p()) {
            return;
        }
        this.strings_ = w.D(this.strings_);
    }

    public static g O() {
        return DEFAULT_INSTANCE;
    }

    public static a Q() {
        return DEFAULT_INSTANCE.s();
    }

    public List<String> P() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.w
    protected final Object v(w.f fVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f6387a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return w.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                e4.f<g> bVar = PARSER;
                if (bVar == null) {
                    synchronized (g.class) {
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
